<template>
  <el-container>
    <el-header class="top-bar" height=100%>
      <el-row id="header-content">
        <el-col :span="4">
          <div class="logo">
             <img src="../assets/images/logo.png" class="image">
          </div>
        </el-col>
        <el-col :span="16"><div class="grid-content bg-purple-light">Pesquisa</div></el-col>
        <el-col :span="4"><div class="grid-content bg-purple">Menu Usuario</div></el-col>
      </el-row>
    </el-header>
    <el-main height=100%>
      <cpMenu/>
      <router-view/>
    </el-main>
    <el-footer>Footer</el-footer>
    </el-container>
</template>

<script>
import cpMenu from './layout/Menu'
export default {
  name: 'Main',
  components: {cpMenu}
}
</script>

<style>
  .top-bar {
    box-shadow: 0 1px 0 rgba(12,13,14,0.15);
  }

 .el-header {
    text-align: center;
    line-height: 300%;
  }

  #header-content{
    margin: auto;
    width: 60%;
  }

  .logo img{
    max-width:200px;
    max-height:80px;
    width: auto;
    height: auto;
    padding: 5px;
  }

  .el-main {
    text-align: center;
    margin: auto;
    padding:0.5%;
    width: 60%;
  }

  .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }

</style>
