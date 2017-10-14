package practice.june15.work;

import practice.june15.work.models.Employee;
import practice.june15.work.models.Employer;

import practice.june15.work.models.impl.FactoryImpl;

/**
 * Created by Human on 15.06.2017.
 */
public class Work {
    public static void main(String[] args) {
        // get employer
        Employer employer = FactoryImpl.getEmployer();
        // create new employee
        Employee employee = FactoryImpl.createEmployee();
        // employer gives task to employee
        employer.giveTask(employee);
        // employee does the work
        employee.doWork();


        System.out.println("");
        System.out.println("");
        Employee employee2 = FactoryImpl.createEmployee();
        employer.giveTask(employee2);
        employee2.doWork();
    }
}
