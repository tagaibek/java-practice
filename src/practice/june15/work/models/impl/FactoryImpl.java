package practice.june15.work.models.impl;

import practice.june15.work.models.Employee;
import practice.june15.work.models.Employer;

/**
 * Created by Human on 15.06.2017.
 */
public class FactoryImpl {
    public static Employee createEmployee(){
        String employeeName = (int) (Math.random() * 10) + "Employee";

        return new Emploee2Impl(employeeName);
    }

    public static Employer getEmployer(){
        return new EmployerImpl("Mirlan");
    }
}
