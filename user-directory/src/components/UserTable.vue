<template>
    <div>
      <h2>User List</h2>
      <table>
        <thead>
          <tr>
            <th>Username</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="user in users" :key="user.id">
            <td>{{ user.username }}</td>
            <td>{{ user.email }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        users: [],
      }
    },
    mounted() {
      this.getAllUsers();
    },
    methods: {
      getAllUsers() {
        axios.get('/users')
        .then(response => {
          console.log(response.data);
          this.users = response.data;
        })
        .catch(error => {
          console.log(error.response.data);
          // handle error
        });
      },
    },
  }
  </script>
  