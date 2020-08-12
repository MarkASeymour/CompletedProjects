<template>
  <div>
    <div class="Body">
      <div class="container">
        <p class="one">
          Easy to use chatbot platform
          <br />for any business.
        </p>
        <div class="learn-more">
        <form>
          <label for="emailInput">Enter your business email to Learn More!</label>
          <input type="text" class="email-input" name="emailInput" v-model="userEmail" v-on:keyup.enter="submitEmail()"
                placeholder="Enter email here . . . "/>
          <button type="submit" class="email-button" v-on:click.prevent="submitEmail()">Submit</button>
        </form>
        </div>
        <!-- <img class="front-image" src="../assets/cloud-wifi 2.png" /> -->
      <!-- </div>
      <div class="container"> -->
        <p class="two">Demo our product <br> at any time.</p>
        <video class="demo" src="../assets/NewProductDemo.mp4" playsinline muted loop autoplay />
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: "the-body",
  data() {
    return {
      userEmail: ""
    }
  },
  methods: {
    submitEmail(){
      this.userEmail = "";
    }
  }
};
</script>

<style>
:root{
--main-color: #00aae7;
--hover-color: #62c2e6;
}

.learn-more {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  font-size:25px;
  color: var(--main-color);
  order: 2;
  width: 40%;
}

.email-button {
background-color: var(--main-color);
color: white;
font-family: Avenir, Helvetica, Arial, sans-serif;
font-size:20px;
border-style: solid;
border-color: var(--hover-color);
border-radius: 5px;
margin: 10px;
}

.email-input {
  background-color: white;
  color: var(--hover-color);
  width: 350px;
  padding: 12px 20px;
  border-width: 1px;
  border-style: solid;
  border-color: var(--main-color);
  border-radius: 5px;

}



.demo {
  width: 40%;
  order: 3;
  border-style: solid;
  border-width: 1.2rem;
  border-color: var(--main-color);
  border-color: var(--main-color);
  border-radius: 10px;
  box-shadow: 5px 15px 25px rgba(0,0,0,.25);

}

.container {
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  height: 300px;
  justify-content: space-evenly;
  align-items: center;
  
}

.one {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: left;
  font-size: 50px;
  order: 1;
  color: var(--main-color);
}

.two {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: right;
  font-size:50px;
  order: 4;
  color: var(--main-color);
}


.Body {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  font-size: 100px;
  text-align: center;
  background-color: white;
  color: var(--main-color);
  width: 100%;
  height: 1100px;
  margin: 0;
}
</style>