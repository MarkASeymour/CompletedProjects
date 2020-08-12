<template>
    <div >
      <div class='no-scroll' v-if='!loggedIn'>
        <new-header />
        </div>
      <div class='scroll'>
          <div v-if='loggedIn'>
            <new-header />
          </div>
          <router-view />
          <the-footer />
        </div>
    </div>
</template>

<script>
import NewHeader from './components/NewHeader.vue'
import TheFooter from './components/TheFooter.vue'

export default {
  name: 'App',
  components: {
    NewHeader,
    TheFooter,
   },
  computed: {
        loggedIn () {
          return this.$store.state.token != '';
        }
  }

}
</script>

<style>
:root{
  --main-color: #095781;
  --secondary-color: #ffffff;
  --border-color: #00000027;
  --recieved-bubble-color: #0D81BF;
  --sent-bubble-color: #0CB07C;
  --chatbot-text-input-color: #495057;
  /* --close-button-color: rgb(255, 85, 85); */
  --close-button-color: rgb(236, 72, 43);
  --hover-color: #62c2e6;
  --background-color: #fafafa;
}

body{
  margin: 0px;
  font-family: Avenir, Helvetica, Arial, sans-serif;
}

.no-scroll {
    position:-webkit-sticky;
    position: sticky;
    top: 0;
}
@media screen and (max-height: 700px) {
  .no-scroll {
    position:unset;
  }
}

@media screen and (max-width: 900px) {
  .no-scroll {
    position:unset;
  }
}

.scroll{
    overflow:auto;
    background-color: var(--background-color);
}
</style>