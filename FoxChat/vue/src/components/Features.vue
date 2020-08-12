<template>
    <div class='body'>
        <div class='body-row'>
            <div class='body-element'>
                <p class='big-text'>Introducing Foxchat!<br />Your newest chatbot solution for quick user interactions.</p>
                <button class="signup-button" v-on:click.prevent >Sign up today!</button>
            </div>
            <div class='body-element'>
                <img class='vertical-img' src="../assets/mobile_demo.gif" />
            </div>
        </div>
        <div class='body-row'>
            <div class='body-element'>
                <img class='horizontal-img' src="../assets/sample.png" />
            </div>
            <div class='body-element'>
                <p class='big-text'>Intuitively search for topics.</p>
            </div>
        </div>
        <div class='body-row'>
            <div class='body-element'>
                <p class='big-text'>Granular Responses</p>
            </div>
            <div class='body-element'>
                <img class='vertical-img' src="../assets/sample_vert.png" />
            </div>
        </div>
        <div class='body-row'>
            <div class='body-element'>
            </div>
            <div class='body-element'>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'features'
}
</script>

<style>
.body {
    color: var(--main-color);
    padding: 40px 0;
}

.body p{
    margin: 0;
}

.body-row {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    margin-bottom: 60px;
}

.body-element {
    min-width: 400px;
    margin-bottom: 40px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    width: 40%;
}

.body img {
    border: 2px solid var(--main-color);
    border-radius: 12px;
}

.vertical-img {
    max-height: 400px;
    box-shadow: 5px 15px 25px rgba(0,0,0,.25);
}

.horizontal-img {
    max-width: 100%;
    box-shadow: 5px 15px 25px rgba(0,0,0,.25);
}

.big-text {
    font-size: 40px;
    text-align: center;
}


/* Button Styling */
.signup-button {
    padding: 13px 40px 15px;
    color:var(--secondary-color);
    background-color: var(--main-color);
    border-radius: 3px;
    border: none;
    margin-top: 10px;
    font-size: 19px;
    border: 1px solid var(--main-color);
}
.signup-button:hover {
    color:var(--main-color);
    background-color: var(--secondary-color);
}

.signup-button:active {
    background-color:var(--main-color);
    color: var(--secondary-color);
}

</style>