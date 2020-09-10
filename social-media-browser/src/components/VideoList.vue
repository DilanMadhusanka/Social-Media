<template>
  <ul>
    <VideoListItem v-for="(video, index) in videos" :key="index" v-bind:video="video" />
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