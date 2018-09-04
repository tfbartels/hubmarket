<template>
  <q-page  class='content'>
    <h6 class='titulo'>Carrinho</h6>
    <q-list inset-separator class="q-mt-md">
      <q-item tag="label"  v-for="(produto, index) in listaProdutos" :key="index">
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
          <q-item-tile sublabel>Subtotal: {{produto.subtotal}}</q-item-tile>
        </q-item-side>
      </q-item>
    </q-list>
  </q-page>
</template>

<script>
export default {
  name: 'Carrinho',
  data () {
    return {
      listaProdutos: [
        {
          id: 1,
          imagem: 'statics/telefone.jpg',
          descricao: 'Telefone Motorola',
          fornecedor: 'Motorola',
          quantidade: '1',
          valorUnitario: '800',
          frete: '10',
          subtotal: '810'
        },
        {
          id: 2,
          imagem: 'statics/telefone.jpg',
          descricao: 'Telefone Motorola',
          fornecedor: 'Motorola',
          quantidade: '1',
          valorUnitario: '600',
          frete: '50',
          subtotal: '650'
        }
      ],
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
  }
}
</script>

<style scoped>
.quantidade{
  max-width: 100px;
}
</style>
