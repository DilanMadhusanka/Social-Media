<template>
  <ul class="list-group col-md-4">
    <VideoListItem
      v-for="video in videos"
      :key="video.etag"
      v-bind:video="video"
      v-on:videoSelect="onVideoSelect"
    />
  </ul>
</template>

<script>
import VideoListItem from "./VideoListItem";
export default {
  name: "VedioList",
  props: ["videos"],
  components: {
    VideoListItem,
  },
  methods: {
    onVideoSelect(video) {
      this.$emit("videoSelect", video);
    },
  },
};
</script>

<style>
</style>