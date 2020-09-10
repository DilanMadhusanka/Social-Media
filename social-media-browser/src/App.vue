<template>
  <div>
    <SearchBar v-on:termChange="onTermChange" />
    <VideoList v-bind:videos="videos"/>
  </div>
</template>

<script>
import axios from "axios";
import SearchBar from "./components/SearchBar";
import VideoList from "./components/VideoList";

const API_KEY = "AIzaSyCwKVlAIrKwRRhAfknYJnPJ-iZGu1Ueg4I";

export default {
  name: "App",
  components: {
    SearchBar,
    VideoList,
  },
  data() {
    return {
      videos: [],
    };
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
          this.videos = response.data.items;
        });
    },
  },
};
</script>

<style>
</style>