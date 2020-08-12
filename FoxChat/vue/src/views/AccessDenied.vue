<template>
    <div id='access-denied'>
        <div>Access Denied</div>
        <div><font-awesome-icon icon="exclamation-triangle" id='denied-symbol'/></div>
        <div>Please Log In</div>
        <button @click="denied">Hello world</button>
    </div>
</template>

<script>
export default {
    name: 'access-denied',
    beforeCreate() {
        this.$swal(
            'Access Denied',
            'Please Login',
            'error'
            );
        this.$router.push("/");
    },
    methods: {
        denied() {
            this.$swal(
            'Access Denied',
            'Please Login',
            'error'
            );
        }
    }
}
</script>

<style>
#access-denied {
    font-size: 8vw;
    padding: 40px 0;
    text-align: center;
    margin: auto;
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    align-content: center;
    color: var(--main-color);
    min-height: 70vh;
}

#denied-symbol {
    font-size: 10vw;
    padding: 30px 0;
    color: var(--close-button-color);
}
</style>