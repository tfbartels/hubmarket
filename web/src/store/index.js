import Vue from 'vue'
import Vuex from 'vuex'

import carrinho from './carrinho'

Vue.use(Vuex)

export const store = new Vuex.Store({
  modules: {
    carrinho
  }
})

export default store
