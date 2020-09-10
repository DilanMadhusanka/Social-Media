<template>
  <ul class="list-group">
    <VideoListItem v-for="video in videos" :key="video.etag" v-bind:video="video" />
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
};
</script>

<style>
</style>