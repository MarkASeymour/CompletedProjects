package com.techelevator;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class MenuLogicHandler {
	File file = new File("Log.txt");
	LogWriter logWriter = new LogWriter(file);
	Inventory inventoryOne;
	ShoppingCart shoppingCartOne;
	DecimalFormat format = new DecimalFormat("##.00");
	Menu menu;
	Scanner userInput = new Scanner(System.in);
	SystemSalesReport systemSales = new SystemSalesReport();

	public MenuLogicHandler(Inventory inventory, ShoppingCart cart) {
		shoppingCartOne = cart;
		inventoryOne = inventory;

	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public boolean mainMenuChoices(String response) {
		// (1) Display Catering Items
		if (response.equals("1")) {
			// Printing Out all the Stuff
			menu.printOutInventory();
			return true;
		} else if (response.equals("2")) {
			// (2) Order --> We jump out of MainMenu here to OrderMenu.
			menu.orderMenu();
			return true;
			// (3) Exit Menu
		} else if (response.equals("3")) {
			System.out.println("Thanks for shopping with us! Have a great Day!");
			return false;
		}
		return true;

	}

	public boolean orderMenuChoices(String response) {
		boolean returnToMenu = false;

		// (1) Add Money to balance
		if (response.equals("1")) {
			System.out.println("Enter amount to increase:");
			double balanceIncrease = userInput.nextDouble();
			userInput.nextLine();

			if (!(balanceIncrease == (int) balanceIncrease)) {
				System.out.println("You can only add bills!");
				System.out.println("----------------------------------------------------------");
			} else {

				if (shoppingCartOne.getBalance() + balanceIncrease > 5000) {
					System.out.println("You can only add up to $5000!");
					System.out.println("----------------------------------------------------------");
				} else {
					shoppingCartOne.addToBalance(balanceIncrease);
					logWriter.addMoneyLog(balanceIncrease, shoppingCartOne);
					System.out.println("----------------------------------------------------------");
				}
				returnToMenu = false;
			}
			// (2) Place an Order
		} else if (response.equals("2")) {
			int currentStock = 0;

			System.out.println("Enter Product ID:");
			String idResponse = userInput.nextLine();
			boolean exists = inventoryOne.itemExists(idResponse);
			if (!exists) {
				System.out.println("Please enter a valid ID");
				System.out.println("----------------------------------------------------------");
			} else {

				System.out.println("Enter Quantity:");

				int quantityResponse = Integer.valueOf(userInput.nextLine());

				currentStock = inventoryOne.getInventoryMap().get(idResponse).getQuantity();

				double totalPrice = shoppingCartOne.getTotalPrice(inventoryOne, idResponse, quantityResponse);
				// Check to make sure they have enough money.
				if (shoppingCartOne.getBalance() - totalPrice < 0) {
					System.out.println("Insufficient Funds. Please add more to your balance.");
					System.out.println("----------------------------------------------------------");
				} else {

					// Check to make sure we have enough stock.
					if (currentStock == 0) {
						System.out.println("Item is SOLD OUT!");
						System.out.println("----------------------------------------------------------");
					} else if (!(currentStock >= Integer.valueOf(quantityResponse))) {
						System.out.println("Insufficient stock. Please try again.");
						System.out.println("----------------------------------------------------------");
					} else {
						shoppingCartOne.subtractFromBalance(totalPrice);
						inventoryOne.getInventoryMap().get(idResponse).setQuantity(currentStock - quantityResponse);
						shoppingCartOne.addToCart(idResponse, quantityResponse);
						logWriter.addPurchaseLog(inventoryOne.getInventoryMap().get(idResponse), quantityResponse,
								shoppingCartOne, inventoryOne);
						System.out.println("----------------------------------------------------------");
					}
					returnToMenu = false;
				}
			}
			// (3) Complete Transaction
		} else if (response.equals("3")) {
//			systemSales.writeSystemSales(inventoryOne, shoppingCartOne);
			this.printFinalBill();
			returnToMenu = true;
		}

		return returnToMenu;
	}
	
	public void printFinalBill() {
		List<String> menuFinalBill = shoppingCartOne.finalBill(inventoryOne);
		for (String billItem : menuFinalBill) {
			System.out.println(billItem);
		}
		
		System.out.println("Total: $" + format.format(shoppingCartOne.getAmountOwed(inventoryOne)));
		System.out.println(shoppingCartOne.giveChange(inventoryOne));
		System.out.println("----------------------------------------------------------");
		shoppingCartOne.subtractFromBalance(shoppingCartOne.getBalance());
		logWriter.getChangeLog(shoppingCartOne, inventoryOne);
	}
	
	
	

}
