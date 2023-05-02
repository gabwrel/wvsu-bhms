<template>
  <q-layout view="lHh Lpr lFf">
    <q-header elevated class="bg-lime-10">
      <q-toolbar>
        <q-btn
          flat
          dense
          round
          icon="menu"
          aria-label="Menu"
          @click="toggleLeftDrawer"
        />

        <q-toolbar-title>
          Chateau D Alta
        </q-toolbar-title>

<!--        <div>Quasar v{{ $q.version }}</div>-->
      </q-toolbar>
    </q-header>

    <q-drawer class="bg-lime-1"
      v-model="leftDrawerOpen"
      show-if-above
      bordered
    >
      <q-list>

        <q-item-label header>
          Essential Links
        </q-item-label>

        <EssentialLink
          v-for="link in essentialLinks"
          :key="link.title"
          v-bind="link"
        />
      </q-list>

    </q-drawer>

    <q-page-container>
      <q-card>

      </q-card>
      <router-view />
    </q-page-container>
  </q-layout>

</template>

<script>
import { defineComponent, ref } from 'vue'
import EssentialLink from 'components/EssentialLink.vue'

const linksList = [
  {
    title: 'Home',
    caption: '',
    icon: 'home',
    link: '/home'
  },
  {
    title: 'Tenants Profile',
    caption: '',
    icon: 'person',
    link: '/tenants'
  },
  {
    title: 'Unit Types',
    caption: '',
    icon: 'apartment',
    link: '/unitType'
  },
  {
    title: 'Payment',
    caption: '',
    icon: 'receipt_long',
    link: ''
  },
  {
    title: 'Collectibles',
    caption: '',
    icon: 'payments',
    link: ''
  },
  {
    title: 'Settings',
    caption: '',
    icon: 'settings',
    link: ''
  },
  {
    title: 'Help',
    caption: '',
    icon: 'help',
    link: ''
  },
]

export default defineComponent({
  name: 'MainLayout',

  components: {
    EssentialLink
  },

  setup () {
    const leftDrawerOpen = ref(false)

    return {
      essentialLinks: linksList,
      leftDrawerOpen,
      toggleLeftDrawer () {
        leftDrawerOpen.value = !leftDrawerOpen.value
      }
    }
  }
})
</script>
