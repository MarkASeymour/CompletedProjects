<template>
  <div>
    <div class="header">
      <router-link :to="{ name: 'home' }">
      <div class="start">
        <img class="logo" src="../assets/ChatLogo.png" />
        <div class="title">chatBoi.io</div>
      </div>
      <router-link>
      <div class="end">
        <div class="dropdown">
          <button class="dropbtn">Product</button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropbtn">Solutions</button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropbtn">Integrations</button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropbtn">Templates</button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropbtn">Help</button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
          </div>
          <div class="dropdown">
            <button class="dropbtn">Login</button>
          </div>
          <div class="dropdown">
            <button class="dropbtn">Sign Up</button>
          </div>
      </div>

      
    </div>
  </div>
</template>

<script>
export default {
  name: "the-header",
};
</script>

<style>

.logo {
  order: 1;
  width: auto;
  height: 50%;
  margin-right: 10px;
  margin-left: 10px;
}

.title {
  order: 2;
  color: var(--secondary-color);
  font-size: 50px;
  font-family: Avenir, Helvetica, Arial, sans-serif;
}

.header {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  flex-grow: 1;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  background-color: var(--main-color);
  color: var(--secondary-color);
  width: 100%;
  height: 150px;
}

.start {
  order: 1;
  display: flex;
  flex: 1;
  flex-direction: row;
  align-items: center;
  max-width: 400px;
}



.end {
  order: 2;
  display: flex;
  flex: 1;
  flex-direction: row;
  justify-content: space-evenly;
}

/*Dropdown Styles*/
.dropbtn {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  background-color: var(--main-color);
  color: var(--secondary-color);
  font-size: 16px;
  border: none;
  height: 100%;
  min-width: 70px;
}

.dropbtn:hover {
  background-color: var(--hover-color);
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: var(--secondary-color);
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {
  background-color: var(--hover-color);
}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  background-color: var(--hover-color);
}
</style>