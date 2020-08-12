<template>
    <div v-if="dataLoaded" id='topics-searched-chart' ref='topicsChart'> 
        <GChart
            :settings="{packages: ['bar']}"    
            :data="chartData"
            :options="chartOptions"
            :createChart="(el, google) => new google.charts.Bar(el)"
            @ready="onChartReady"
        />
    </div>
</template>

<script>
import dataService from '../services/DataService.js'
import { GChart } from 'vue-google-charts'

export default {
    components : {
        GChart,
    },
    name: 'topics-searched-chart',
    created () {
        this.loadChartData()
    },
    data () {
        return {
            dataLoaded: false,
            chartsLib: null,
            chartData: null,
        }
    },
    computed: {
        chartOptions () {
            if (!this.chartsLib) return null;
            return this.chartsLib.charts.Bar.convertOptions({
                chart: {
                    // title: 'Top Searched Topics',
                    },
                    height: 700,
                    bars: 'horizontal', // Required for Material Bar Charts.
                    hAxis: { format: 'decimal' },
                    legend: { position: 'none' },
                    axes: {
                        x: {
                            0: { side: 'top', label: 'Times Searched'}
                        }
                    },
                    colors: ['#56b9ee', '#d95f02', '#7570b3']
                })
        },
    },
    methods: {
        onChartReady (chart, google) {
            this.chartsLib = google
            },
        loadChartData () {
            dataService.getTopicSearchData().then(response =>{
                if(response.status === 202) {
                    var json_data = response.data;
                    var result = [];
                    result.push(['Topic', 'Times Searched']);
                    for(var i in json_data) result.push([i, json_data [i]]);
                }
                this.chartData = result;
                this.dataLoaded = true;
                });
        }
    }
}
</script>

<style>

#topics-searched-chart {
    padding: 20px;
    padding-bottom: 0;
    box-sizing: border-box;
}
</style>