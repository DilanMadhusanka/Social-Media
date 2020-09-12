<template>
  <div class="container">
    <SearchBar v-on:termChange="onTermChange" />
    <div class="row">
      <VideoDetails v-bind:video="selectedVideo" />
      <VideoList v-on:videoSelect="onVideoSelect" v-bind:videos="videos" />
    </div>
  </div>
</template>

<script>
import axios from "axios";
import SearchBar from "./components/SearchBar";
import VideoList from "./components/VideoList";
import VideoDetails from "./components/VideoDetails";

const API_KEY = "AIzaSyCwKVlAIrKwRRhAfknYJnPJ-iZGu1Ueg4I";

export default {
  name: "App",
  components: {
    SearchBar,
    VideoList,
    VideoDetails,
  },
  data() {
    return {
      videos: [],
      selectedVideo: null,
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
    onVideoSelect(video) {
      this.selectedVideo = video;
    },
  },
};
</script>

<style>
</style>