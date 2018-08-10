<template>
 <div>
  <el-row>
    <el-col :span="8" v-for="(o) in 12" :key="o">
      <el-card shadow="hover" >
        <img src="../../assets/logo.png" class="image">
        <div id="desc-prod">Descricao do produto</div>
        <div>Preço</div>
      </el-card>
    </el-col>
  </el-row>
 </div>
</template>

<script>
export default {
  name: 'Destaque'
}
</script>

<style>
  .el-card {
    margin:10%;
  }

  .image {
    width: 100%;
    display: block;
  }

</style>
