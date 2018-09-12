<template>
  <q-layout view="lHh Lpr lFf">

    <q-layout-header>
      <q-toolbar
        color="primary"
        :glossy="$q.theme === 'mat'"
        :inverted="$q.theme === 'ios'"
      >
        <q-btn
          flat
          dense
          @click="leftDrawerOpen = !leftDrawerOpen"
          aria-label="Menu"
        >
          <q-icon name="menu" />
        </q-btn>

        <q-toolbar-title>
          <div class="row items-center" >
            <div class="col-12 col-md">
              <router-link class='link' :to="{ name:'index'}">
                <img alt="Hub Market" src="statics/hubmarket-logo.png">
              </router-link >
            </div>

            <div class="col-12 col-md">
              <q-search
              v-model="terms"
              placeholder="O que você procura?"
              icon="search"
              >
                <q-autocomplete @search="search" @selected="selected" />
              </q-search>
            </div>

            <div class="col-12 col-md"/>
          </div>
        </q-toolbar-title>

        <q-btn flat round >
          <router-link class='link' :to="{ name:'carrinho'}">
            <q-icon name="shopping_cart" size='25px'/>
          </router-link >
        </q-btn>

      </q-toolbar>
    </q-layout-header>

    <!-- Menu -->
    <q-layout-drawer
      v-model="leftDrawerOpen"
      :content-class="$q.theme === 'mat' ? 'bg-grey-2' : null"
    >
      <cpMenu />
    </q-layout-drawer>

    <!-- Main -->
    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
import { openURL } from 'quasar'
import cpMenu from 'components/Menu'

export default {
  name: 'MyLayout',
  components: { cpMenu },
  data () {
    return {
      terms: '',
      selected: '',
      leftDrawerOpen: false
    }
  },
  methods: {
    search (terms) {
      this.$router.push({name: 'listaproduto', params: {descricao: terms}})
    },
    openURL
  }
}
</script>

<style>
.content{
  padding-left: 10%;
  padding-right: 10%;
}

.link{
  text-decoration: none;
}

.titulo{
  margin: 2em 0 .8em;
  padding-bottom: .4em;
  border-bottom: 1px solid #ddd;
  color: #003163;
}

</style>
