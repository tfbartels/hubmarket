<template>
  <q-page padding>
    <div class='content'>
      <div class="row" >
        <div class="col-12 col-md container-imagem">
          <img class="imagem" :src="this.produto.urlImagem"/>
        </div>
        <div class="col-12 col-md">
          <h6 class='titulo-produto'>{{this.produto.descricao}}</h6>
          <div class='container-classificacao' >
            <q-rating size="18px" readonly v-model="produto.classificacao" :max="5" />
          </div>
          <q-list link>
            <q-item tag="label" v-for="(produtoFornecedor, index) in this.produto.listaProdutoFornecedor" :key="index" >
              <q-item-side>
                <q-radio v-model="idProdFornecSelec" :val="produtoFornecedor.id" />
              </q-item-side>
              <q-item-main>
                <q-item-tile label>{{produtoFornecedor.valorVenda | toCurrency}}</q-item-tile>
                <q-item-tile sublabel>{{produtoFornecedor.fornecedor.nome}}</q-item-tile>
              </q-item-main>
            </q-item>
          </q-list>
          <div class='container-btn' >
            <q-btn label="Comprar" color="primary" @click="adicionarCarrinho"/>
          </div>
        </div>
      </div>
      <div>
        <h6 class='titulo'>Detalhes do produto</h6>
        {{produto.detalhes}}
        <h6 class='titulo'>Avaliações</h6>
        <q-list separator>
          <q-item multiline v-for="(avaliacao, index) in this.produto.listaAvaliacao" :key="index">
            <q-item-main>
              <q-rating size="18px" readonly v-model="avaliacao.classificacao" :max="5" />
              <q-item-tile sublabel>{{avaliacao.descricao}}</q-item-tile>
            </q-item-main>
            <q-item-side right>
              <q-item-tile class='dataAvaliacao'>{{avaliacao.dataCriacao}}</q-item-tile>
            </q-item-side>
          </q-item>
        </q-list>
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
      idProdFornecSelec: 0,
      produto: {}
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
    },

    adicionarCarrinho () {
      if (this.idProdFornecSelec === 0) {
        this.$q.dialog({
          message: 'Selecione um fornecedor!'
        })
        return
      }

      var produtoCarrinho = null
      var lista = []

      if (this.$q.localStorage.has('listaProdutosCarrinho')) {
        lista = this.$q.localStorage.get.item('listaProdutosCarrinho')

        for (var i = 0; i < lista.length; i++) {
          if (lista[i].id === this.produto.id) {
            produtoCarrinho = lista[i]
            break
          }
        }
      } else {
        this.$q.localStorage.set('listaProdutosCarrinho', lista)
      }

      lista = this.$q.localStorage.get.item('listaProdutosCarrinho')

      if (produtoCarrinho != null) {
        produtoCarrinho.quantidade++
      } else {
        var prodFornecSelec = null
        for (i = 0; i < this.produto.listaProdutoFornecedor.length; i++) {
          if (this.produto.listaProdutoFornecedor[i].id === this.idProdFornecSelec) {
            prodFornecSelec = this.produto.listaProdutoFornecedor[i]
            break
          }
        }

        produtoCarrinho = {
          id: this.produto.id,
          urlImagem: this.produto.urlImagem,
          descricao: this.produto.descricao,
          fornecedor: {
            id: prodFornecSelec.id,
            nome: prodFornecSelec.fornecedor.nome
          },
          quantidade: 0,
          frete: 0,
          valorUnitario: prodFornecSelec.valorVenda,
          prazoEntrega: ''
        }
        lista.push(produtoCarrinho)
      }

      this.$q.localStorage.set('listaProdutosCarrinho', lista)
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
    font-size: calc(13px + .5vw);
  }

  .container-classificacao{
   margin: .2em 0 .4em;
  }

  .content .container-btn{
    text-align: right;
  }

  .dataAvaliacao{
    font-size: 12px;
  }

  .q-btn{
    margin-top: 10px;
    width: 25%;
  }
</style>
