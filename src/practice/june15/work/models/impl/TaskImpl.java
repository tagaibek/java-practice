package practice.june15.work.models.impl;

import practice.june15.work.models.Task;

/**
 * Created by Human on 15.06.2017.
 */
class TaskImpl implements Task {
    private String name;
    private String status = "not started";

    TaskImpl(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String statuss){
        this.status = statuss ;
    }
}
