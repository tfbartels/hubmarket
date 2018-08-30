<template>
  <q-page padding>
    Produto {{id}}
  </q-page>
</template>

<script>
export default {
  name: 'produto',
  data () {
    return {
      id: 0
    }
  },

  created () {
    this.id = this.$route.params.idProduto
  }
}
</script>

<style>
</style>
