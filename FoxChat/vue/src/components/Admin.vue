<template>
    <div id='admin-page'>
        <div id='admin-menus'>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showTopicsSeached = !showTopicsSeached"> 
                    <div class='admin-button-text'>Most Searched Topics</div> 
                    <div v-if="!showTopicsSeached"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showTopicsSeached"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showTopicsSeached"><topics-searched-chart /></div>
            </div>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showKeywordsSeached = !showKeywordsSeached">
                    <div class='admin-button-text'>Most Searched Keywords</div>  
                    <div v-if="!showKeywordsSeached"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showKeywordsSeached"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showKeywordsSeached"><topics-searched-chart /></div>
            </div>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showJobsSeached = !showJobsSeached">
                    <div class='admin-button-text'>Most Searched Jobs</div>  
                    <div v-if="!showJobsSeached"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showJobsSeached"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showJobsSeached"><topics-searched-chart /></div>
            </div>
        </div>
    </div>
</template>

<script>
import TopicsSearchedChart from '@/components/TopicsSearchedChart.vue'

export default {
    components : {
        TopicsSearchedChart,
    },
    name: 'admin',
    data () {
        return {
            showTopicsSeached: false,
            showKeywordsSeached: false,
            showJobsSeached: false,
        }
    },
}
</script>

<style>
#admin-page {
    min-height: 80vh;
}

#admin-menus {
    margin: auto;
    max-width: 80%;
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    align-content: center;
    padding-top: 20px;
}

.admin-menu {
    box-sizing: border-box;
    margin-bottom: 10px;
    padding: 10px 20px;
    width: 100%;

    box-shadow: 0 4px 16px rgba(0,0,0,.25);
    background-color: var(--secondary-color);
    border-radius: 6px;
    color: var(--main-color);
}

.admin-menu-button {
    display: flex;
    justify-content: space-between;
}

.admin-button-text {
    font-size: 18px;
    margin: auto 0;
}
.admin-caret-down {
    color: var(--border-color);
    font-size: 30px
}

.admin-caret-up {
    color: var(--main-color);
    font-size: 30px
}

#admin-up-tri {
    align-self: center;
    width: 0;
    height: 0;
    border-left: 8px solid transparent;
    border-right: 8px solid transparent;
    border-bottom: 12px solid var(--main-color);
}

.chart {
    width: 100%;
    margin-top: 5px;
    border-top: 1px solid var(--border-color);
}
</style>