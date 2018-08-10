<template>
  <el-menu :default-active="activeIndex" class="menu" mode="horizontal" @select="handleSelect">
    <el-submenu index="1">
      <template slot="title">Menu 1</template>
      <el-menu-item index="1-1">item one</el-menu-item>
      <el-menu-item index="1-2">item two</el-menu-item>
      <el-menu-item index="1-3">item three</el-menu-item>
      <el-submenu index="1-4">
        <template slot="title">item four</template>
        <el-menu-item index="1-4-1">item one</el-menu-item>
        <el-menu-item index="1-4-2">item two</el-menu-item>
        <el-menu-item index="1-4-3">item three</el-menu-item>
      </el-submenu>
    </el-submenu>
    <el-submenu index="2">
      <template slot="title">Menu 2</template>
      <el-menu-item index="2-1">item one</el-menu-item>
      <el-menu-item index="2-2">item two</el-menu-item>
      <el-menu-item index="2-3">item three</el-menu-item>
      <el-submenu index="2-4">
        <template slot="title">item four</template>
        <el-menu-item index="2-4-1">item one</el-menu-item>
        <el-menu-item index="2-4-2">item two</el-menu-item>
        <el-menu-item index="2-4-3">item three</el-menu-item>
      </el-submenu>
    </el-submenu>
  </el-menu>
</template>

<script>
export default {
  name: 'Menu'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>

</style>
