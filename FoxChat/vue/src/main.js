import Vue from 'vue'
import App from './App.vue'
import router from './router/index'
import store from './store/index'
import axios from 'axios'
import VueChatScroll from 'vue-chat-scroll'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faBars, faTimes, faComments, faExclamationTriangle, faCaretDown, faCaretUp} from '@fortawesome/free-solid-svg-icons'
import { faVuejs } from '@fortawesome/free-brands-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'


import VueSweetalert2 from 'vue-sweetalert2';

library.add(faBars, faTimes, faComments, faExclamationTriangle, faCaretDown, faCaretUp, faVuejs)

Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.use(VueChatScroll)
Vue.use(VueSweetalert2);

Vue.config.productionTip = false

axios.defaults.baseURL = process.env.VUE_APP_REMOTE_API;

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
