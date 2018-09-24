<template>
  <q-page class='content'>
      <h6 class='titulo'>{{this.categoria.descricao}}</h6>
      <q-card inline style="width: 230px;" v-for="(produto, index) in listaProduto" :key="index">
        <router-link class='link' :to="{ name:'produto', params: { id: produto.id }}">
          <q-card-media class="media">
            <img :src="produto.urlImagem">
          </q-card-media>
          <q-card-main>
            <div class="titulo-produto">{{produto.descricao}}</div>
            <q-rating size="18px" readonly v-model="produto.classificacao" :max="5" />
            <div class="preco-produto">{{produto.menorPreco | toCurrency}}</div>
          </q-card-main>
        </router-link>
      </q-card>
  </q-page>
</template>

<script>
import axios from 'axios'
export default {
  name: 'ListaProduto',
  data () {
    return {
      categoria: {
        id: 0,
        descricao: ''
      },
      listaProduto: []
    }
  },
  created: function () {
    this.loadData()
  },
  watch: {
    '$route' (to) {
      this.loadData()
    }
  },
  methods: {
    loadData () {
      axios
        .get('http://localhost:8081/api/v1/produto/produto/listarpordescricao/' + this.$route.params.descricao)
        .then(response => (this.listaProduto = response.data))
        .catch(error => console.log(error))

      this.categoria.descricao = this.$route.params.descricao
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

.titulo-produto{
  color: black;
}

.preco-produto{
 margin-top: 15px;
 color: #003163;
}
</style>
