<template>
  <div class="q-pa-md">
    <q-table
      flat bordered
      title="Collectibles"
      :filter="filter"
      :rows="rows"
      :columns="columns"
      row-key="name"
      binary-state-sort
    >
      <template v-slot:top-right>
        <q-input borderless dense debounce="300" v-model="filter" placeholder="Search">
          <template v-slot:append>
            <q-icon name="search" />
          </template>
        </q-input>
      </template>

      <template v-slot:body="props">
        <q-tr :props="props">
          <q-td key="name" :props="props">
            {{ props.row.name }}
            <q-popup-edit v-model="props.row.name" v-slot="scope">
              <q-input v-model="scope.value" dense autofocus counter @keyup.enter="scope.set" />
            </q-popup-edit>
          </q-td>
          <q-td key="roomNumber" :props="props">
            {{ props.row.roomNumber }}
            <q-popup-edit v-model="props.row.roomNumber" title="Update room number" buttons v-slot="scope">
              <q-input type="number" v-model="scope.value" dense autofocus />
            </q-popup-edit>
          </q-td>
          <q-td key="monthlyDue" :props="props">
            {{ props.row.monthlyDue }}
            <q-popup-edit v-model="props.row.monthlyDue" title="Update monthly due" buttons persistent v-slot="scope">
              <q-input type="number" v-model="scope.value" dense autofocus hint="Use buttons to close" />
            </q-popup-edit>
          </q-td>
          <q-td key="totalPayment" :props="props">
            {{ props.row.totalPayment }}
            <q-popup-edit v-model="props.row.totalPayment" title="Update payment" buttons persistent v-slot="scope">
              <q-input type="number" v-model="scope.value" dense autofocus hint="Use buttons to close" />
            </q-popup-edit>
          </q-td>
          <q-td key="balance" :props="props">
            {{ props.row.balance }}
            <q-popup-edit v-model="props.row.totalPayment" title="Update balance" buttons persistent v-slot="scope">
              <q-input type="number" v-model="scope.value" dense autofocus hint="Use buttons to close" />
            </q-popup-edit>
          </q-td>

        </q-tr>
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
  { name: 'monthlyDue', label: 'Monthly Due', field: 'monthlyDue', sortable: true, style: 'width: 10px' },
  { name: 'totalPayment', label: 'Total Payment', field: 'totalPayment' },
  { name: 'balance', label: 'Balance', field: 'balance' }
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
    roomNumber: 103,
    monthlyDue: "₱10,000.00",
    totalPayment: "₱10,000.00",
    balance: "₱3000.00"
  },
  {
    name: 'Doja Cat',
    roomNumber: 104,
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
    roomNumber: 107,
    monthlyDue: "₱15,000.00",
    totalPayment: "₱18,000.00",
    balance: "₱3000.00"
  },
]

export default {
  setup () {
    return {
      columns,
      rows: ref(rows)
    }
  }
}
</script>
