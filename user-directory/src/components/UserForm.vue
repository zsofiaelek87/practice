<template>
    <div>
      <h2>Create User</h2>
      <form>
        <div>
          <label for="username">Username:</label>
          <input type="text" id="username" v-model="username">
        </div>
        <div>
          <label for="email">Email:</label>
          <input type="email" id="email" v-model="email">
        </div>
        <button type="submit" @click.prevent="createUser">Create User</button>
      </form>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        username: '',
        email: '',
      }
    },
    methods: {
      createUser() {
        axios.post('/users', {
          username: this.username,
          email: this.email,
        })
        .then(response => {
          console.log(response.data);
          // handle success
        })
        .catch(error => {
          console.log(error.response.data);
          // handle error
        });
      },
    },
  }
  </script>
  