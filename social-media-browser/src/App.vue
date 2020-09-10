<template>
  <div>
    <SearchBar v-on:termChange="onTermChange" />
    <VideoList />
  </div>
</template>

<script>
import axios from "axios";
import SearchBar from "./components/SearchBar";
import VideoList from "./components/VideoList";

const API_KEY = "AIzaSyA4cN7hcMjsqIKgPVXhGErY6dF-miLDPc8";

export default {
  name: "App",
  components: {
    SearchBar,
    VideoList,
  },
  methods: {
    onTermChange(searchTerm) {
      axios
        .get("https://www.googleapis.com/youtube/v3/search", {
          params: {
            key: API_KEY,
            type: "video",
            part: "snippet",
            q: searchTerm,
          },
        })
        .then((response) => {
          console.log(response);
        });
    },
  },
};
</script>

<style>
</style>