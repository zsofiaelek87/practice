<template>
  <div>
    <UserForm />
    <DogTable />
    <UserTable />
  </div>
</template>

<script>
import UserForm from './components/UserForm.vue'
import DogTable from './components/DogTable.vue'
import UserTable from './components/UserTable.vue'

export default {
  name: 'App',
  components: {
    UserForm,
    DogTable,
    UserTable
  }
}
</script>
