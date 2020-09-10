<template>
  <li class="list-group-item">
    <img v-bind:src="video.snippet.thumbnails.default.url" alt="img" />
    {{video.snippet.title}}
  </li>
</template>

<script>
export default {
  name: "VideoListItem",
  props: ["video"],
};
</script>