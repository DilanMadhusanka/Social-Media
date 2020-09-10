<template>
  <li class="list-group-item">
    <img v-bind:src="thumbnailsUrl" alt="img" />
    {{video.snippet.title}}
  </li>
</template>

<script>
export default {
  name: "VideoListItem",
  props: ["video"],
  computed: {
    thumbnailsUrl() {
      return this.video.snippet.thumbnails.default.url;
    },
  },
};
</script>