<script setup>
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import { getDatabase, ref, onValue } from "firebase/database";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyA5t4H_U60ITnPhDBCldAs8TcewiwLSjxk",
  authDomain: "chateau-de-alta.firebaseapp.com",
  databaseURL:
    "https://chateau-de-alta-default-rtdb.asia-southeast1.firebasedatabase.app",
  projectId: "chateau-de-alta",
  storageBucket: "chateau-de-alta.appspot.com",
  messagingSenderId: "1092544716639",
  appId: "1:1092544716639:web:860a5b00ecc046967760ea",
  measurementId: "G-6TN5LTJQ2Z",
};

const db = getDatabase();

const state = reactive({
  occupancyCount: 0,
});

onValue(ref(db, "occupancyCount"), (snapshot) => {
  state.occupancyCount = snapshot.val();
});

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
</script>

<template>
  <div class="q-pa-md">
    <div class="row">
      <div class="col" style="font-size: 30px">
        <p>Welcome, Admin!</p>
        <div class="row">
          <div class="col-4">
            <div class="q-pa-md row q-gutter-md">
              <q-card class="dashboardCard" style="padding: 5px; width: 100%">
                <q-card-section>
                  <div class="card-title" style="font-size: 20px">
                    Occupancy Count
                  </div>
                  <div class="row">
                    <div
                      class="col-10"
                      style="padding-left: 10px; font-size: 50px"
                    >
                      {{ occupancyCount }}
                    </div>
                    <div class="col-2">
                      <q-icon
                        name="person"
                        color="lime-10"
                        class="text-primary"
                        size="40px"
                        style="padding-top: 20px"
                      />
                    </div>
                  </div>
                  <q-separator style="width: 100%" size="2px" />
                </q-card-section>
              </q-card>
            </div>
          </div>
          <div class="col-4">
            <div class="q-pa-md row q-gutter-md">
              <q-card class="dashboardCard" style="padding: 5px; width: 100%">
                <q-card-section>
                  <div class="card-title" style="font-size: 20px">
                    Bed Count
                  </div>
                  <div class="row">
                    <div
                      class="col-10"
                      style="padding-left: 10px; font-size: 50px"
                    >
                      30
                    </div>
                    <div class="col-2">
                      <q-icon
                        name="bed"
                        color="lime-10"
                        class="text-primary"
                        size="40px"
                        style="padding-top: 20px"
                      />
                    </div>
                  </div>
                  <q-separator style="width: 100%" size="2px" />
                </q-card-section>
              </q-card>
            </div>
          </div>
          <div class="col-4">
            <div class="q-pa-md row q-gutter-md">
              <q-card class="dashboardCard" style="padding: 5px; width: 100%">
                <q-card-section>
                  <div class="card-title" style="font-size: 20px">
                    Room Count
                  </div>
                  <div class="row">
                    <div
                      class="col-10"
                      style="padding-left: 10px; font-size: 50px"
                    >
                      30
                    </div>
                    <div class="col-2">
                      <q-icon
                        name="apartment"
                        color="lime-10"
                        class="text-primary"
                        size="40px"
                        style="padding-top: 20px"
                      />
                    </div>
                  </div>
                  <q-separator style="width: 100%" size="2px" />
                </q-card-section>
              </q-card>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-4">
        <div class="q-pa-md row q-gutter-md">
          <q-card class="dashboardCard" style="padding: 5px; width: 100%">
            <q-card-section>
              <div class="card-title" style="font-size: 20px">
                Total Boarders
              </div>
              <div class="row">
                <div class="col-10" style="padding-left: 10px; font-size: 50px">
                  7
                </div>
                <div class="col-2">
                  <q-icon
                    name="person"
                    color="lime-10"
                    class="text-primary"
                    size="40px"
                    style="padding-top: 20px"
                  />
                </div>
              </div>
              <q-separator style="width: 100%" size="2px" />
            </q-card-section>
          </q-card>
        </div>
      </div>
      <div class="col-4">
        <div class="q-pa-md row q-gutter-md">
          <q-card class="dashboardCard" style="padding: 5px; width: 100%">
            <q-card-section>
              <div class="card-title" style="font-size: 20px">
                Available Beds
              </div>
              <div class="row">
                <div class="col-10" style="padding-left: 10px; font-size: 50px">
                  24
                </div>
                <div class="col-2">
                  <q-icon
                    name="bed"
                    color="lime-10"
                    class="text-primary"
                    size="40px"
                    style="padding-top: 20px"
                  />
                </div>
              </div>
              <q-separator style="width: 100%" size="2px" />
            </q-card-section>
          </q-card>
        </div>
      </div>
      <div class="col-4">
        <div class="q-pa-md row q-gutter-md">
          <q-card class="dashboardCard" style="padding: 5px; width: 100%">
            <q-card-section>
              <div class="card-title" style="font-size: 20px">
                Available Rooms
              </div>
              <div class="row">
                <div class="col-10" style="padding-left: 10px; font-size: 50px">
                  24
                </div>
                <div class="col-2">
                  <q-icon
                    name="apartment"
                    color="lime-10"
                    class="text-primary"
                    size="40px"
                    style="padding-top: 20px"
                  />
                </div>
              </div>
              <q-separator style="width: 100%" size="2px" />
            </q-card-section>
          </q-card>
        </div>
      </div>
      <div class="" style="width: 100%">
        <div class="q-pa-md row q-gutter-md">
          <q-card class="dashboardCard" style="padding: 5px; width: 100%">
            <q-card-section>
              <div class="card-title" style="font-size: 20px">
                Total collectibles this month
              </div>
              <div class="row">
                <div class="col-10" style="padding-left: 10px; font-size: 50px">
                  ₱36, 000.00
                </div>
                <div class="col-2">
                  <q-icon
                    name="payments"
                    color="lime-10"
                    class="text-primary"
                    size="40px"
                    style="padding-top: 20px"
                  />
                </div>
              </div>
              <q-separator style="width: 100%" size="2px" />
            </q-card-section>
          </q-card>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped lang="sass"></style>
