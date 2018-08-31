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
          <div class="row justify-between items-center" >
            <div class="col-12 col-md">
              <img alt="Hub Market" src="statics/hubmarket-logo.png">
            </div>
            <div class="col-12 col-md">
              <q-search
               v-model="searchModel"
               placeholder="O que você procura?"
               icon="search"
              />
            </div>
            <div class="col-12 col-md"></div>
          </div>
        </q-toolbar-title>
      </q-toolbar>
    </q-layout-header>

    <q-layout-drawer
      v-model="leftDrawerOpen"
      :content-class="$q.theme === 'mat' ? 'bg-grey-2' : null"
    >
      <cpMenu />
    </q-layout-drawer>

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
      leftDrawerOpen: false
    }
  },
  methods: {
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
</style>
