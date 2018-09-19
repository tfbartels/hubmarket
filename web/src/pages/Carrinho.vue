<template>
  <q-page  class='content'>
    <h6 class='titulo'>Carrinho</h6>
    {{this.$store.state.carrinho.count}}
    <div class="row" >
      <div class="col-12 col-md">
        <q-input class="cep" type="number" stack-label="CEP" v-model="cep" />
      </div>
    </div>
    <q-list inset-separator class="q-mt-md">
      <q-item tag="label"  v-for="(produto, index) in this.$store.state.carrinho.listaItens" :key="index">
        <q-item-side :avatar="produto.imagem" />
        <q-item-main multiline>
          <q-item-tile label>{{produto.descricao}}</q-item-tile>
          <q-item-tile sublabel>Fornecedor: {{produto.fornecedor}}</q-item-tile>
          <q-select float-label="Quantidade:" align="left" class="quantidade"
           v-model="produto.quantidade"
           :options="quantidadeOptions"/>
           <q-item-tile sublabel>Prazo de entrega: 10 dias uteis</q-item-tile>
        </q-item-main>
        <q-item-side right>
          <q-item-tile sublabel>Valor unitário: {{produto.valorUnitario}}</q-item-tile>
          <q-item-tile sublabel>Valor frete: {{produto.frete}}</q-item-tile>
          <q-item-separator />
          <q-item-tile sublabel>Subtotal: {{subtotal(produto.quantidade, produto.valorUnitario, produto.frete)}}</q-item-tile>
        </q-item-side>
      </q-item>
    </q-list>
    <div class="row" >
      Total:
    </div>
    <div class="row" >
      <q-btn label="Finalizar Comprar" color="primary" />
    </div>
  </q-page>
</template>

<script>
export default {
  name: 'Carrinho',
  data () {
    return {
      cep: '',
      listaProdutos: [],
      selected: '',
      quantidadeOptions: [
        {
          label: '1',
          value: '1'
        },
        {
          label: '2',
          value: '2'
        }
      ]
    }
  },
  created: function () {
    this.loadData()
  },
  methods: {
    subtotal (quantidade, valorUnitario, frete) {
      return (parseFloat(quantidade) * parseFloat(valorUnitario)) + parseFloat(frete)
    },

    loadData () {
      this.listaProdutos = this.$store.state.carrinho.listaItens
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

.row{
  margin-top: 5px;
  text-align: right;
}
</style>
