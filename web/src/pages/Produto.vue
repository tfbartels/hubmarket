<template>
  <q-page padding>
    <div class='content'>
      <div class="row" >
        <div class="col-12 col-md ">
          <img class="image" :src="produto.imagem"/>
        </div>
        <div class="col-12 col-md">
        <q-list link>
          <q-item tag="label">
            <q-item-side>
              <q-radio v-model="option" val="1" />
            </q-item-side>
            <q-item-main>
              <q-item-tile label>R$ 100</q-item-tile>
              <q-item-tile sublabel>Fornecedor 01</q-item-tile>
            </q-item-main>
          </q-item>
          <q-item tag="label">
            <q-item-side>
              <q-radio v-model="option" val="2" />
            </q-item-side>
            <q-item-main>
              <q-item-tile label>R$ 100</q-item-tile>
              <q-item-tile sublabel>Fornecedor 01</q-item-tile>
            </q-item-main>
          </q-item>
        </q-list>
        </div>
      </div>
      <div class="row inline" >
      Detalhes do produto {{produto.id}}
      </div>
    </div>
  </q-page>
</template>

<script>
export default {
  name: 'produto',
  data () {
    return {
      option: '',
      produto: {
        id: 0,
        imagem: 'statics/telefone.jpg'
      }
    }
  },

  created () {
    this.produto.id = this.$route.params.idProduto
  }
}
</script>

<style scoped>
  .image{
    max-width: 400px;   /* Máximo da largura da imagem */
    width: 100%;
    height: auto;
    max-height: 400px;  /* Máximo da altura da imagem */
    min-height: auto;      /* Mínimo da altura, por padrão “auto” */
    background-size:100%;
    background-repeat: no-repeat;
  }
</style>
