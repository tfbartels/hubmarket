<template>
    <q-list no-border>
        <q-list-header>Categorias</q-list-header>
        <cpMenuItem v-for="itemMenu in itensMenu" :item="itemMenu" :key="itemMenu.index" />
    </q-list>
</template>

<script>
import cpMenuItem from 'components/MenuItem'

export default {
  name: 'Menu',
  components: { cpMenuItem },
  data () {
    return {
      itensMenu:
      [
        {
          id: 1,
          descricao: 'Celulares',
          itensMenu: [
            {
              id: 2,
              descricao: 'Motorola'
            },
            {
              id: 3,
              descricao: 'LG'
            },
            {
              id: 4,
              descricao: 'Samsung'
            }
          ]
        },
        {
          id: 5,
          descricao: 'TVs',
          itensMenu: [
            {
              id: 6,
              descricao: 'LG'
            },
            {
              id: 7,
              descricao: 'Samsung'
            },
            {
              id: 8,
              descricao: 'Philco'
            }
          ]
        }
      ]
    }
  }
}
</script>

<style>
</style>
