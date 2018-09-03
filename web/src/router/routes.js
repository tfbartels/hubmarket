
const routes = [
  {
    path: '/',
    component: () => import('layouts/MyLayout.vue'),
    children: [
      { path: '', component: () => import('pages/Index.vue') },
      { name: 'listaproduto', path: 'listaproduto/:id', component: () => import('pages/ListaProduto.vue') },
      { name: 'produto', path: 'produto/:id', component: () => import('pages/Produto.vue') }
    ]
  }
]

// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue')
  })
}

export default routes
