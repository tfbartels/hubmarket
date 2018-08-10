import Vue from 'vue'
import Router from 'vue-router'
import MainView from '@/components/Main.vue'
import DestaqueView from '@/components/view/Destaque.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      name: '',
      path: '/',
      component: MainView,
      children: [
        {
          name: 'Destaque',
          path: '',
          component: DestaqueView
        }
      ]
    }
  ]
})
