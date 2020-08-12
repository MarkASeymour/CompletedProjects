<template>
    <div class='body'>
        <div id='flex-row'>
            <div class='body-div'>
                <p class='big-text'>Introducing Foxchat!<br />Your newest chatbot solution for quick user interactions.</p>
                <button type="submit" class="email-button" v-on:click.prevent >Sign up today!</button>
            </div>
            <div class='body-div demo-div'>
                <img id="demo-vert" src="../assets/mobile_demo.gif" playsinline muted loop autoplay />
            </div>
        </div>
        <div id='flex-row'>
            <div class='body-div'>
                <form id='sign-up'>
                    <div>Sign up for free and<br/>start building your custom chatbot today.</div>
                    <input type="text" class="email-input" name="emailInput" v-model="userEmail" v-on:keyup.enter="submitEmail()"
                        required placeholder="Enter your business email"/>
                    <button type="submit" class="email-button" v-on:click.prevent="submitEmail()">Sign up</button>
                </form>
            </div>
            <div class='body-div demo-div'>
                <img id="demo-hor" src="../assets/sample_visualization.png" playsinline muted loop autoplay />
                Admin Tools
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'landing'
}
</script>

<style>

.body{
    height: fit-content;
    min-height: 100vh;
    width: 100%;
    color:var(--main-color);
}

#flex-row {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    padding-top: 20px;
}

.body-div {
    max-width: 100%;
    margin: 20px 100px;
    flex: 1;
}

.big-text {
    font-size: 50px;
    text-align: center;
}

.demo-div {
    display: flex;
    flex-direction: column;
    justify-items: center;
    text-align: center;
    font-size: 30px;
}
#demo-vert {
    width: 100%;
    max-width: 200px;
    border-style: solid;
    border-width: 2px;
    border-color: var(--main-color);
    border-radius: 10px;
    margin-bottom: 10px;
     
}

#demo-hor {
    max-width: 100%;
    border-style: solid;
    border-width: 2px;
    border-color: var(--main-color);
    border-radius: 13px;
    margin-bottom: 10px;
    box-shadow: 5px 15px 25px rgba(0,0,0,.25); 
}

#sign-up {
    font-size: 20px;
}
.email-input {
    width: 300px;
    padding: 16px 0 16px 10px;
    margin-right: 8px;
    margin-top: 10px;
    margin-bottom: 10px;
    border-radius: 3px;
    border: 1px solid var(--main-color);
    background-color: var(--secondary-color);
    font-size: 16px;
}

.email-input::placeholder {
    padding-left: 10px;
}

.email-button {
    padding: 13px 40px 15px;
    color:var(--secondary-color);
    background-color: var(--main-color);
    border-radius: 3px;
    border: none;
    margin-top: 1px;
    font-size: 19px;
    border: 1px solid var(--main-color);
}
.email-button:hover {
    color:var(--main-color);
    background-color: var(--secondary-color);
}

.email-button:active {
    background-color:var(--main-color);
    color: var(--secondary-color);
}

@media screen and (max-width: 1200px) {
    #flex-row {
        display: flex;
        flex-direction: column;
        /* flex-wrap: wrap; */
        justify-content: center;
        align-items: center;
    }
    
    .big-text {
        font-size: 5vw;
    }

    .body-div {
    max-width: 80%;
    margin: 20px 100px;
    }
}

@media screen and (max-width: 600px) {
    .body-div {
    max-width: 80%;
    margin: 20px;
    }

}
</style>