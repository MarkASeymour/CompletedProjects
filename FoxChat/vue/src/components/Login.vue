<template>
  <div class="form-signin">
    <form @submit.prevent="login">
      <p>Sign in to your account</p>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <div>
      <!-- <label for="username" class="sr-only">Username</label> -->
      <input
        type="text"
        id="username"
        class="form-login email-input"
        placeholder="Type in your username"
        v-model="user.username"
        required
        autofocus
      />
      <!-- <label for="password" class="sr-only">Password</label> -->
      <input
        type="password"
        id="password"
        class="form-login email-input"
        placeholder="Type in your password"
        v-model="user.password"
        required
      />
      <br/><button type="submit" class="email-button login-button">Sign in</button>
      </div>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style>

.form-signin form{
  display: inline-block;
  padding: 0 20px;
}

.form-signin p, .alert{
  margin-top: 10px;
  margin-bottom: 0;
  color: var(--main-color);
  font-size: 20px;
  text-align: center;
}


.form-login {
  margin: 15px 0 0 0;
  width: 100%;
  background-color: var(--secondary-color);
}

.login-button {
  margin: 15px 0;
  width:100%;
}

/* @media screen and (max-width: 900px) {
  .form-signin p, .alert{
    width: 90vw;
  }
} */

</style>
