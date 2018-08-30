<template>
  <q-page padding>
    <div class='content'>
      <q-card inline style="width: 250px;" v-for="(produto, index) in listaProduto" :key="index">
        <router-link class='link' :to="{ name:'produto', params: { idProduto: produto.id }}">
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
    </div>
  </q-page>
</template>

<script>
export default {
  name: 'ListaProduto',
  data () {
    return {
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
  }
}
</script>

<style scoped>
 .content{
  padding-left: 10%;
  padding-right: 10%;
 }

 .link{
  text-decoration: none;
 }

 .media{
  padding: 20px;
 }

 .q-card{
  margin: 10px;
 }

</style>
