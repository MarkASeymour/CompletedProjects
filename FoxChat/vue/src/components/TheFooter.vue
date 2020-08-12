<template>
    <div>
        <div class='footer'>
            <p>Copyright © 2020 JavaGreen, Inc. All rights reserved</p>
            <p>We use Cookies. <a href="#">Click to learn more</a></p>
        </div>
    </div>
</template>

<script>
export default {
    name: "the-footer"
}
</script>

<style>

.footer {
    display: flex;
    flex-direction: column;
    align-content: center;
    justify-content: center;
    font-family: Avenir, Helvetica, Arial, sans-serif;
    text-align: center;
    background-color:var(--main-color);
    color:var(--secondary-color);
    width: 100%;
    height: 75px;
}

.footer p {
    color: var(--secondary-color);
    margin: 2px;
    font-size: 18px;
}

.footer a {
    color: var(--secondary-color);
}

.footer a:hover {
    color: rgb(110, 110, 110);
}

@media screen and (max-width: 600px) {
    .footer {
        height: 50px;
    }

    .footer p {
        font-size: 2vw;
    }
}
</style>