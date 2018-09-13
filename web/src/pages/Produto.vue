<template>
  <q-page padding>
    <div class='content'>
      <div class="row" >
        <div class="col-12 col-md container-imagem">
          <img class="imagem" src="statics/telefone.jpg"/>
        </div>
        <div class="col-12 col-md">
          <h6 class='titulo-produto'>Teste{{this.produto.descricao}}</h6>
          <div class='container-classificacao' >
            <q-rating size="18px" readonly v-model="produto.classificacao" :max="5" />
          </div>
          <q-list link>
            <q-item tag="label" v-for="(prodFornec, index) in produto.produtoFornecedor" :key="index" >
              <q-item-side>
                <q-radio v-model="option" :val="prodFornec.id" />
              </q-item-side>
              <q-item-main>
                <q-item-tile label>{{prodFornec.valorVenda | toCurrency}}</q-item-tile>
                <q-item-tile sublabel>{{prodFornec.fornecedor.nome}}</q-item-tile>
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
import axios from 'axios'

export default {
  name: 'produto',
  data () {
    return {
      option: '',
      produto: ''
    }
  },
  created () {
    this.loadData()
  },
  methods: {
    loadData () {
      axios
        .get('http://localhost:8081/api/v1/produto/produto/' + this.$route.params.id)
        .then(response => (this.produto = response.data))
        .catch(error => console.log(error))
    }
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
