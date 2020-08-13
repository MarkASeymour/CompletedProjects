<template>
    <div id='admin-page'>
        <div id='admin-menus'>
            <p>Topics</p>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic = !showAddTopic"> 
                    <div class='admin-button-text'>Add Topic</div> 
                    <div v-if="!showAddTopic"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic"><add-topic /></div>
            </div>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic2 = !showAddTopic2"> 
                    <div class='admin-button-text'>Edit Topic</div> 
                    <div v-if="!showAddTopic2"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic2"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic2"><add-topic /></div>
            </div>
            <p>Subtopics</p>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic3 = !showAddTopic3"> 
                    <div class='admin-button-text'>Add Subtopic</div> 
                    <div v-if="!showAddTopic3"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic3"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic3"><add-topic /></div>
            </div>
             <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic4 = !showAddTopic4"> 
                    <div class='admin-button-text'>Edit Subtopic</div> 
                    <div v-if="!showAddTopic4"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic4"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic4"><add-topic /></div>
            </div>
            <p>Departments</p>
            <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic5 = !showAddTopic5"> 
                    <div class='admin-button-text'>Add Department</div> 
                    <div v-if="!showAddTopic5"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic5"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic5"><add-topic /></div>
            </div>
             <div class='admin-menu'>
                <div class='admin-menu-button' @click="showAddTopic6 = !showAddTopic6"> 
                    <div class='admin-button-text'>Edit Department</div> 
                    <div v-if="!showAddTopic6"><font-awesome-icon icon="caret-down" class='admin-caret-down' /></div>
                    <div v-if="showAddTopic6"><font-awesome-icon icon="caret-up" class='admin-caret-up' /></div>
                </div>
                <div class='chart' v-if="showAddTopic6"><add-topic /></div>
            </div>
        </div>
    </div>
</template>

<script>
import AddTopic from '@/components/AddTopic'

export default {
    components : {
        AddTopic,
    },
    name: 'admin-tools',
    data () {
        return {
            showAddTopic: false,
            showAddTopic2: false,
            showAddTopic3: false,
            showAddTopic4: false,
            showAddTopic5: false,
            showAddTopic6: false,
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