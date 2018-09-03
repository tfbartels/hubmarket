<template>
  <q-page padding>
    <div class='content'>
      <div class="row" >
        <div class="col-12 col-md container-imagem">
          <img class="imagem" :src="produto.imagem"/>
        </div>
        <div class="col-12 col-md">
          <h6 class='titulo-produto'>Teste{{this.produto.descricao}}</h6>
          <div class='container-classificacao' >
            <q-rating size="18px" readonly v-model="produto.classificacao" :max="5" />
          </div>
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
          <div class='container-btn' >
            <q-btn label="Comprar" color="primary" />
          </div>
        </div>
      </div>
      <div>
        <h6 class='titulo'>Detalhes do produto</h6>
        {{produto.id}}
        <h6 class='titulo'>Avaliações</h6>
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
        imagem: 'statics/telefone.jpg',
        classificacao: 4
      }
    }
  },
  created () {
    this.produto.id = this.$route.params.id
  }
}
</script>

<style scoped>
  .content .container-imagem{
    text-align: center;
  }

  .imagem{
    max-width: 400px;   /* Máximo da largura da imagem */
    width: 100%;
    height: auto;
    max-height: 400px;  /* Máximo da altura da imagem */
    min-height: auto;      /* Mínimo da altura, por padrão “auto” */
    background-size:100%;
    background-repeat: no-repeat;
  }

  .titulo-produto{
    margin: .2em 0 .4em;
    padding-bottom: .4em;
    border-bottom: 1px solid #ddd;
  }

  .container-classificacao{
   margin: .2em 0 .4em;
  }

  .content .container-btn{
    text-align: right;
  }

  .q-btn{
    margin-top: 10px;
    width: 25%;
  }
</style>
