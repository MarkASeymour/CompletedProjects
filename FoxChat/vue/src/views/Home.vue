<template>
    <div>
        <new-landing />
        <chat-bot />
    </div>    
</template>

<script>
import ChatBot from '@/components/ChatBot.vue';
import NewLanding from '@/components/NewLanding.vue';

export default {
  name: "home",
  components: {
    ChatBot,
    NewLanding,
  }
};
</script>
