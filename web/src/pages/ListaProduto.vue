<template>
  <q-page class='content'>
      <h6 class='titulo'>{{this.categoria.id }}</h6>
      <q-card inline style="width: 250px;" v-for="(produto, index) in listaProduto" :key="index">
        <router-link class='link' :to="{ name:'produto', params: { id: produto.id }}">
          <q-card-media class="media">
            <img src="statics/telefone.jpg">
          </q-card-media>
          <q-card-main>
            <div>{{produto.descricao}}</div>
            <q-rating size="18px" readonly v-model="produto.classificacao" :max="5" />
            <div>{{produto.preco}}</div>
          </q-card-main>
        </router-link>
      </q-card>
  </q-page>
</template>

<script>
export default {
  name: 'ListaProduto',
  data () {
    return {
      categoria: {
        id: 0,
        descricao: ''
      },
      listaProduto: [
        {
          id: 1,
          descricao: 'Moto G',
          classificacao: 3,
          preco: 'R$800,00'
        },
        {
          id: 2,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        },
        {
          id: 3,
          descricao: 'Moto G2',
          classificacao: 5,
          preco: 'R$1000,00'
        },
        {
          id: 4,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        },
        {
          id: 5,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        },
        {
          id: 6,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        },
        {
          id: 6,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        },
        {
          id: 6,
          descricao: 'Moto G2',
          classificacao: 3,
          preco: 'R$1000,00'
        }
      ]
    }
  },
  created: function () {
    this.categoria.id = this.$route.params.id
  },
  watch: {
    '$route' (to) {
      this.categoria.id = to.params.id
    }
  }
}
</script>

<style scoped>
 .media{
  padding: 20px;
 }

 .q-card{
  margin: 10px;
 }
</style>
