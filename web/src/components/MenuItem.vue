<template>
  <div>
    <q-collapsible  v-if="item.listaCategoriasInferiores" indent :label="item.descricao">
      <MenuItem  v-for="itemMenu in item.listaCategoriasInferiores" :item="itemMenu" :key="itemMenu.index" />
    </q-collapsible>
    <router-link class='link' :to="{ name:'listaproduto', params: { id: item.id}}" replace   v-else >
    <q-item link >
      <q-item-main :label="item.descricao">
      </q-item-main>
    </q-item>
    </router-link>
  </div>
</template>

<script>
export default {
  name: 'MenuItem',
  props: ['item']
}
</script>

<style scoped>

</style>
