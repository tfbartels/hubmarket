<template>
  <q-page padding>
    <div class='content'>
      <div class="row" >
        <div class="col-12 col-md">
        12
        </div>
        <div class="col-12 col-md">
        2
        </div>
      </div>
      <div class="row" >
      Produto {{id}}
      </div>
    </div>
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
