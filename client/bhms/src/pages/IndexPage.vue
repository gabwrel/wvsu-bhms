<template>
  <q-page class="flex flex-center">
    <img
      alt="Chateau D' Alta logo"
      src="~assets/logo.png"
      style="width: 400px; height: 400px"
    />
  </q-page>
  <div class="q-pa-md">
    <q-carousel
      animated
      v-model="slide"
      navigation
      infinite
      :autoplay="autoplay"
      arrows
      transition-prev="slide-right"
      transition-next="slide-left"
      @mouseenter="autoplay = false"
      @mouseleave="autoplay = true"
    >
      <q-carousel-slide :name="1" img-src="~assets/apt-1.jpg" />
      <q-carousel-slide :name="2" img-src="~assets/apt-2.jpg" />
      <q-carousel-slide :name="3" img-src="~assets/apt-3.jpeg" />
      <q-carousel-slide :name="4" img-src="~assets/apt-4.jpg" />
    </q-carousel>
  </div>
</template>

<script>
import { defineComponent, ref } from 'vue'

export default defineComponent({
  name: 'IndexPage',
 setup (){
    return {
      slide: ref(1),
      autoplay: ref(true)
    }
 }

})
</script>
