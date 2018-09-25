<template>
  <q-page  class='content'>
    <h6 class='titulo'>Carrinho</h6>
    <div class="row justify-end items-center componente" >
      <div>
        <q-input class="cep" type="number" stack-label="CEP" v-model="cep" />
      </div>
      <div class="calculacep" >
        <q-btn @click="calculaFretePrazoEntrega()" label="Calcular" color="primary"/>
      </div>
    </div>

    <div class="row componente item" v-for="(produto, index) in listaProdutos" :key="index">
      <div class="col-1">
       <div class="row justify-start">
        <img :src="produto.urlImagem" class="imagem">
       </div>
      </div>
      <div class="col-12 col-md">
        <router-link class='link' :to="{ name:'produto', params: { id: produto.id }}">
          <div class="row justify-start">
          {{produto.descricao}}
          </div>
        </router-link>
        <div class="row justify-start atributo">
         Fornecedor: {{produto.fornecedor.nome}}
        </div>
        <div class="row quantidade justify-start">
          <q-select float-lasabel="Quantidade:" align="left" class="quantidade"
          v-model="produto.quantidade"
          :options="quantidadeOptions"/>
        </div>
      </div>
      <div class="col-12 col-md"/>
      <div class="col-12 col-md">
        <div class="row">
         <q-btn label="Excluir" oultine color="red" size="sm" @click="excluirCarrinho(produto.id)"/>
        </div>
      </div>
      <div class="col-12 col-md">
        <div class="row justify-end atributo">
         Prazo de entrega: {{produto.prazoEntrega}}
        </div>
        <div class="row justify-end atributo">
         Valor unitário: {{produto.valorUnitario | toCurrency}}
        </div>
        <div class="row justify-end atributo">
          Valor frete: {{produto.frete | toCurrency}}
        </div>
        <div class="row justify-end subtotal">
         Subtotal: {{subtotal(produto.quantidade, produto.valorUnitario, produto.frete) | toCurrency}}
        </div>
      </div>
    </div>
    <div class="row justify-end total componente" >
      Total: {{total() | toCurrency}}
    </div>
    <div class="row justify-end componente" >
      <q-btn label="Finalizar Comprar" color="primary" />
    </div>
  </q-page>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Carrinho',
  data () {
    return {
      cep: '',
      listaProdutos: [],
      selected: '',
      quantidadeOptions: [],
      urlFretePrazoEntrega: []
    }
  },
  created: function () {
    this.loadData()
  },
  methods: {
    subtotal (quantidade, valorUnitario, frete) {
      return (parseFloat(quantidade) * parseFloat(valorUnitario)) + parseFloat(frete)
    },

    total () {
      var total = 0
      for (var i = 0; i < this.listaProdutos.length; i++) {
        total = total + ((this.listaProdutos[i].quantidade * this.listaProdutos[i].valorUnitario) + this.listaProdutos[i].frete)
      }
      return total
    },

    loadData () {
      this.listaProdutos = this.$q.localStorage.get.item('listaProdutosCarrinho')
      this.loadQuantidadeOptions()
    },

    loadQuantidadeOptions () {
      for (var i = 1; i <= 10; i++) {
        var item = {}
        item.label = i.toString()
        item.value = i
        this.quantidadeOptions.push(item)
      }
    },

    calculaFretePrazoEntrega () {
      var i = 0
      this.urlFretePrazoEntrega = []
      for (i = 0; i < this.listaProdutos.length; i++) {
        this.obterFretePrazoEntrega(i)
      }
    },

    obterFretePrazoEntrega (i) {
      // const self = this;
      axios
        .get('http://localhost:8081/api/v1/pedido/itempedido/obterfreteprazoentrega/' + this.listaProdutos[i].fornecedor.id + '/' + this.cep)
        .then(response => {
          this.listaProdutos[i].frete = response.data.valorFrete
          this.listaProdutos[i].prazoEntrega = response.data.prazoEntrega
        })
        .catch(error => console.log(error))
    },

    excluirCarrinho (id) {
      var index = this.listaProdutos.findIndex(v => v.id === id)
      if (index > -1) {
        this.listaProdutos.splice(index, 1)
      }
      this.$q.localStorage.set('listaProdutosCarrinho', this.listaProdutos)
    }
  }
}
</script>

<style scoped>
.quantidade{
  max-width: 100px;
}

.cep{
  max-width: 100px;
}

.componente{
  margin-top: 20px;
}

.atributo{
  color: grey;
  font-size: 14px
}

.calculacep{
  margin-left: 20px;
}

.subtotal{
  color: grey;
  font-weight: bold;
  font-size: 15px
}

.total{
  color: black;
  font-weight: bold;
}

.imagem{
  max-width: 70px;
  max-height: 70px;
}

.item{
 padding-bottom: .4em;
 border-bottom: 1px solid #ddd;
 margin: 2em 0 .1em;
}
</style>
