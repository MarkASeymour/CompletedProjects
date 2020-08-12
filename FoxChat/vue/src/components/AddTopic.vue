<template>
    <div> 
        <form @submit.prevent='submitTopic'>
            <div>
                <input 
                type="text"
                class="login-form"
                placeholder="Topic Name"
                v-model.trim="topic.topic_name"
                required
                autofocus
                />
            </div>
             <div>
                <input 
                type="text"
                class="login-form"
                placeholder="Topic Message"
                v-model.trim="topic.message"
                required
                />
            </div>
             <div>
                <input 
                type="text"
                class="login-form"
                placeholder="Keywords (separated by spaces)"
                v-model.trim="topic.keywords"
                required
                autofocus
                />
            </div>
            <div>
                <select required v-model="topic.department_id" class='choose-department'>
                    <option value="null" disabled selected hidden>Select Department</option>
                    <option value=1>Pathway</option>
                    <option value=2>Curriculum</option>
                </select>
            
            </div>
            <div class='link-add'>
                <div class='link-add-form'>
                    <input 
                        type="text"
                        class="login-form"
                        placeholder="Link Name"
                        v-model.trim="topic.link_name"
                        required
                        autofocus
                    />
                </div>
                <div class='link-add-form'>
                    <input 
                        type="text"
                        class="login-form"
                        placeholder="Link URL"
                        v-model.trim="topic.link_body"
                        required
                        autofocus
                    />
                </div>
            </div>
             <div>
               <button type="submit" class="login-button">
                   Submit Topic
               </button>
            </div>
        </form>
    </div>
</template>

<script>
import adminService from '@/services/AdminService'

export default {
    name: 'add-topic',
    data() {
        return {
            topic: {
                topic_name: null,
                department_id: null,
                message: null,
                link_name: null,
                link_body: null,
                keywords: null,
            }
        }
    },
    methods: {
        submitTopic() {
            this.topic.keywords = this.topic.keywords.split(" ")
            adminService.addTopic(this.topic)
            .then(response => {
          if (response.status == 201) {
            this.$swal({
                icon: 'success',
                title: 'Add Topic Successful',
                toast: true,
                timer: 3000,
                timerProgressBar: true,
                position: 'top',
                showConfirmButton: false,
            });
                this.topic = {
                    topic_name: null,
                department_id: null,
                message: null,
                link_name: null,
                link_body: null,
                keywords: null,
                }
          }
          })
        }
    }    
}
</script>

<style>

.choose-department {
    width: 100%;
    padding: 16px;
    margin-top: 15px;
    border-radius: 3px;
    border: 1px solid var(--main-color);
    font-size: 16px;
    background-color: var(--secondary-color);
}

.choose-department:first-child{
  color: #cecece;
}

.link-add {
    width: 100%;
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
}

.link-add-form {
    width: 100%;
}

.link-add-form:first-child {
    margin-right: 15px;
}

</style>