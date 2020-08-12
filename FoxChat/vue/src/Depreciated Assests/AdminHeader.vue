<template>
    <div>
        <header>
            <router-link :to="{ name: 'home' }">
            <div id='logo-title'>
                <div class="title"><font-awesome-icon icon="comments" /> TE Chat</div>
            </div>
            </router-link>
            <div id='menus'>
                <div class='menu-div menu-click'>
                    Visualizations
                </div>
                <div class='menu-div menu-click'>
                    Admin Tools
                </div>
                <div class='menu-div menu-click' @click='logout'>
                    Logout
                </div>
            </div>
            <div id='mobileMenuButton' v-if="mobileHidden" v-on:click="mobileHidden = false">
                <p><font-awesome-icon icon="bars" /></p>
            </div>
            <div id='mobileMenuButton' v-if="!mobileHidden" v-on:click="mobileHidden = true, loginHidden = true">
                <P><font-awesome-icon icon="times" /></p>
            </div>
        </header>
        <transition name="slide">
        <div v-if="!loginHidden" id='login'>
            <new-login />
        </div>
        </transition>
        <transition name="slide">
        <div v-if="!mobileHidden" id='mobile-menu'>
            <div class='mobile-menu-div' v-on:click="loginHidden = !loginHidden" @click='logout'>
                <p>Logout</p>
            </div>
            <div class='mobile-menu-div'>
                <p>Visualizations</p> 
            </div>
            <div class='mobile-menu-div'>
                <p>Admin Tools</p>
            </div>
        </div>
        </transition>
    </div>
</template>

<script>

export default {
    name: 'admin-header',
    components: {
    },
    data() {
        return {
            mobileHidden: true,
            loginHidden: true,
        }
    },
    methods: {
        logout() {
            this.$store.commit('LOGOUT');
            this.$router.push("/");
        }
    }
}
</script>

<style>

#login {
    position: absolute;
    right:0;
    background-color: var(--secondary-color);
    border-bottom: 2px solid var(--main-color);
    border-left: 2px solid var(--main-color);
    width: 25%;
    height: fit-content;
    border-bottom-left-radius: 10px;
    padding: 30px 50px;
}

#mobileMenuButton p {
    margin: 0 25px;
    font-size:50px;
    color:var(--secondary-color);
}

#mobile-menu {
    border-bottom: 1px solid var(--border-color);
}
.slide-enter,
.slide-leave-to {
  visibility: hidden;
  height: 0;
  margin: 0;
  padding: 0;
  opacity: 0;
}

.slide-enter-active,
.slide-leave-active {
  transition: all .6s;
}

.mobile-menu-div {
    display: flex;
    justify-content: flex-start;
    align-content: center;
    height: 90px;
    font-size: 40px;
    width: 100%;
    border-top: 1px solid var();
    color: var(--main-color);
    background-color: var(--secondary-color);
}

.mobile-menu-div p {
    margin: auto;
}

header{
    display: flex;
    align-items: stretch;
    flex-wrap: wrap;
    justify-content: space-between;
    width: 100%;
    height: 90px;
    /* padding: 15px 0; */
    background-color: var(--main-color);
}

#logo-title {
    height: 100%;
    display: flex;
    align-items: center;
    justify-self: flex-start;
    flex-grow: 0;
    min-width: fit-content;
    width: 30%;
    flex-wrap: nowrap;
}
.logo {
    width: auto;
    height: 75px;
    margin-right: 10px;
    margin-left: 10px;
}

header a {
    text-decoration: none;
}

.title {
    color:var(--secondary-color);
    font-size: 55px;
    white-space: nowrap;
    padding-left: 25px;
    padding-right: 15px;
}

#menus {
    display: flex;
    align-items: center;
    justify-content: flex-end;
    margin-left: auto;
    flex: 1;
    font-size: 20px;
}

.menu-div {
    color: var(--secondary-color);
    display: flex;
    min-width:fit-content;
    justify-content: center;
    align-items: center;
    padding: 5px 0;
    height: 70%;
    flex-grow: 1;
    max-width: 200px;
    
    
}

.dropdown {
  position: relative;
  display: inline-block;
  cursor:default;
}

.dropbtn {
    display: flex;
    min-width: fit-content;
    align-items: center;
    justify-content: center;
    height: 100%;
  }

.dropdown-content {
  display: none;
  position: absolute;
  background-color: var(--secondary-color);
  color: var(--main-color);
  min-width: 160px;
  width: 100%;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
  text-align: center;
}

/* Links inside the dropdown */
.dropdown-content a {
  color: var(--main-color);
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  background-color: var(--secondary-color);
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
    background-color: var(--main-color);
    color:var(--secondary-color);
    }

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
    background-color: var(--secondary-color);
    color: var(--main-color);
}

.dropdown:hover .dropbtn #down-tri {
    background-color: var(--secondary-color);
    color: var(--main-color);
    border-top: 8px solid var(--main-color);
}

#down-tri {
    margin-left: 5px;
    width: 0;
    height: 0;
    border-left: 4px solid transparent;
    border-right: 4px solid transparent;
    border-top: 8px solid var(--secondary-color);
    }

.menu-click {
    cursor:pointer;
}

@media screen and (min-width: 900px) {
    
    #mobileMenuButton {
        display: none;
    }
    #mobile-menu {
        display: none;
    }
}

@media screen and (max-width: 900px) {
    
    .title {
        padding-right: 0;
    }
    #menus {
        display: none;
    }

    #login {
        box-sizing: border-box;
        border: none;
        position: unset;
        width: 100%;
        height: fit-content;
        padding: 20px;
    }
}

@media screen and (max-width: 400px) {
    .title {
        font-size: 12vw;
    }
}
</style>