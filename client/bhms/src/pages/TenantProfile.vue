<template>
  <div class="q-pa-md">
    <q-table flat bordered title="Tenants" :rows="rows"
             :filter="filter" :columns="columns" row-key="name" white color="amber">
      <template v-slot:top-right>
        <q-input borderless dense debounce="300" v-model="filter" placeholder="Search">
          <template v-slot:append>
            <q-icon name="search" />
          </template>
        </q-input>
      </template>
    </q-table>
  </div>
</template>

<script>
import { ref } from 'vue'
const columns = [
  {
    name: 'name',
    required: true,
    label: 'Name',
    align: 'left',
    field: row => row.name,
    format: val => `${val}`,
    sortable: true
  },
  { name: 'roomNumber', align: 'center', label: 'Room number', field: 'roomNumber', sortable: true },
  { name: 'monthlyDue', label: 'Monthly Due', field: 'monthlyDue', sortable: true },
  { name: 'totalPayment', label: 'Total Payment', field: 'totalPayment' },
  { name: 'balance', label: 'Balance', field: 'balance' },

]

const rows = [
  {
    name: 'John Wick',
    roomNumber: 101,
    monthlyDue: "₱7000.00",
    totalPayment: "₱7000.00",
    balance: "₱3000.00"
  },
  {
    name: 'Leonardo DiCaprio',
    roomNumber: 102,
    monthlyDue: "₱7000.00",
    totalPayment: "₱7000.00",
    balance: "₱3000.00"
  },
  {
    name: 'Anne Hathaway',
    roomNumber: 204,
    monthlyDue: "₱10,000.00",
    totalPayment: "₱10,000.00",
    balance: "₱3000.00"
  },
  {
    name: 'Doja Cat',
    roomNumber: 303,
    monthlyDue: "₱10,000.00",
    totalPayment: "₱10,000.00",
    balance: "₱0.00"
  },
  {
    name: 'Kendrick Lamar',
    roomNumber: 105,
    monthlyDue: "₱8,000.00",
    totalPayment: "₱8,000.00",
    balance: "₱2000.00"
  },
  {
    name: 'Taylor Swift',
    roomNumber: 106,
    monthlyDue: "₱10,000.00",
    totalPayment: "₱12,000.00",
    balance: "₱5000.00"
  },
  {
    name: 'Travis Scott',
    roomNumber: 108,
    monthlyDue: "₱15,000.00",
    totalPayment: "₱18,000.00",
    balance: "₱3000.00"
  },
]

export default {
  setup () {
    return {
      filter: ref(''),
      columns,
      rows
    }
  }
}
</script>
