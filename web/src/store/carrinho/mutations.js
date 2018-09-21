/*
export function someMutation (state) {
}
*/
import { LocalStorage } from 'quasar'

export function increment (state) {
  state.count++
}

export function adicionarProduto (state, produto) {
  state.listaProdutos.push(produto)
  LocalStorage.set('listaProdutosCarrinho', state.listaProdutos)
}

export function possuiProduto (state, produto) {
  if (LocalStorage.get.item('listaProdutosCarrinho') !== null) {
    alert(1)
    state.listaProdutos = LocalStorage.get.item('listaProdutosCarrinho')
    for (var i = 0; i < state.listaProdutos.length; i++) {
      if (state.listaProdutos[i].id === produto.id) {
        alert(2)
        return true
      }
    }
  }
  return false
}
