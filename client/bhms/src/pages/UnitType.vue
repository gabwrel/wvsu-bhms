<template>
  <div class="q-pa-md row items-start q-gutter-md">
  <q-card class="my-card" flat bordered>
    <q-img src="~assets/apt-1.jpg" />

    <q-card-section>
      <div class="row no-wrap items-center">
        <div class="col text-h6 ellipsis">
          Room 101
        </div>

      </div>

      <q-rating v-model="stars" :max="5" size="32px" />
    </q-card-section>

    <q-card-section class="q-pt-none">
      <div class="text-subtitle1">
        ₱7000.00・Good for 2・Air-conditioned
      </div>
      <div class="text-caption text-grey">
        Our Standard Room is a cozy and affordable option, perfect for students or young professionals on a budget.
      </div>
    </q-card-section>

    <q-separator />

  </q-card>
  </div>
  <div class="q-pa-md row items-start q-gutter-md">
    <q-card class="my-card" flat bordered>
      <q-img src="~assets/apt-2.jpg" />

      <q-card-section>
        <div class="row no-wrap items-center">
          <div class="col text-h6 ellipsis">
            Room 102
          </div>

        </div>

        <q-rating v-model="stars" :max="5" size="32px" />
      </q-card-section>

      <q-card-section class="q-pt-none">
        <div class="text-subtitle1">
          ₱7000.00・Good for 2・Air-conditioned
        </div>
        <div class="text-caption text-grey">
          Enjoy stunning city views from our Penthouse Suite, featuring a private balcony and a spacious living area.
        </div>
      </q-card-section>

      <q-separator />

    </q-card>
  </div>
  <div class="q-pa-md row items-start q-gutter-md">
    <q-card class="my-card" flat bordered>
      <q-img src="~assets/apt-2.jpg" />

      <q-card-section>
        <div class="row no-wrap items-center">
          <div class="col text-h6 ellipsis">
            Room 102
          </div>

        </div>

        <q-rating v-model="stars" :max="5" size="32px" />
      </q-card-section>

      <q-card-section class="q-pt-none">
        <div class="text-subtitle1">
          ₱7000.00・Good for 2・Air-conditioned
        </div>
        <div class="text-caption text-grey">
          Enjoy stunning city views from our Penthouse Suite, featuring a private balcony and a spacious living area.
        </div>
      </q-card-section>

      <q-separator />

    </q-card>
  </div>
</template>
<script>
import { ref } from 'vue'

export default {
  setup () {
    return {
      stars: ref(4)
    }
  }
}
</script>

<style lang="sass" scoped>
.my-card
  width: 70%
  //max-width: 500px
</style>
