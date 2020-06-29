package com.techelevator;

import com.techelevator.view.Menu;

public class CateringSystemCLI {

	public static void main(String[] args) {
		// creating all the instances we'll need to pass to others
		Inventory inventoryOne = new Inventory();
		ShoppingCart shoppingCartOne = new ShoppingCart();
		MenuLogicHandler handler = new MenuLogicHandler(inventoryOne, shoppingCartOne);
		Menu menu = new Menu(inventoryOne, shoppingCartOne, handler);
		handler.setMenu(menu);
		// Running the initial fileLoader.
		inventoryOne.initialInventory();
		// mainMenu can return a false to break this loop.
		boolean continueMenu = true;
		while (continueMenu == true) {
			continueMenu = menu.mainMenu();
		}
	}

}
