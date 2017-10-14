package practice.june15.work.models.impl;

import practice.june15.work.models.Employee;
import practice.june15.work.models.Employer;
import practice.june15.work.models.Task;

/**
 * Created by Human on 15.06.2017.
 */
class EmployerImpl implements Employer {
    private String name;

    public EmployerImpl(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void giveTask(Employee employee){
        String taskName = (int)(Math.random() * 100) + "";

        Task task = new TaskImpl(taskName);
        employee.takeTask(task);
    }
}
