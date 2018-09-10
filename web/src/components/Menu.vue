<template>
    <q-list no-border>
        <q-list-header>Categorias</q-list-header>
        <cpMenuItem v-for="itemMenu in itensMenu" :item="itemMenu" :key="itemMenu.index" />
    </q-list>
</template>

<script>
import cpMenuItem from 'components/MenuItem'
import axios from 'axios'
export default {
  name: 'Menu',
  components: { cpMenuItem },
  data () {
    return {
      itensMenu: []
    }
  },
  mounted () {
    this.loadData()
  },
  methods: {
    loadData () {
      axios
        .get('http://localhost:8081/api/v1/produto/categoria')
        .then(response => (this.itensMenu = response.data))
        .catch(error => console.log(error))
    }
  }
}
</script>

<style>
</style>
