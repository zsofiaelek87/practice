<template>
    <div>
      <h2>Dog List</h2>
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Breed</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="dog in dogs" :key="dog.id">
            <td>{{ dog.name }}</td>
            <td>{{ dog.breed }}</td>
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
        dogs: [],
      }
    },
    mounted() {
      this.getAllDogs();
    },
    methods: {
      getAllDogs() {
        axios.get('/dogs')
        .then(response => {
          console.log(response.data);
          this.dogs = response.data;
        })
        .catch(error => {
          console.log(error.response.data);
          // handle error
        });
      },
    },
  }
  </script>
  