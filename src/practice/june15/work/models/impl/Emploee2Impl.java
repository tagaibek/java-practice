package practice.june15.work.models.impl;

import practice.june15.work.models.Employee;
import practice.june15.work.models.Task;

/**
 * Created by Human on 15.06.2017.
 */
class Emploee2Impl implements Employee{
    private String name;
    private Task task;

    Emploee2Impl(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void takeTask(Task task){
        this.task = task;
    }

    public void doWork(){
       this.doingActualWork();
    }

    private void doingActualWork(){
        System.out.println(getName() + " starting my task");
        System.out.println("task=" + task.getName() + ". initial status = " + task.getStatus());
        System.out.println("working on a task=" + task.getName() + "...");

        this.task.setStatus("completed");

        System.out.println("task=" + task.getName() + ". latest status = " + task.getStatus());
        System.out.println(getName() + " ending my taks");
        }


}
