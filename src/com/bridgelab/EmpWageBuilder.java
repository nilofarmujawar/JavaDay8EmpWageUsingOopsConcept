package com.bridgelab;

// uc2

/*
calculate daily employee wage
 */


public class EmpWageBuilder {


    public static final int IS_PRESENT = 1;
    public static final int SALARY_PER_HR = 20;

    public static void employeeAttendace() {

        double empCheck = Math.floor((Math.random() * 10) % 2);

        int Working_Hr = 0;

        /*
        checking condition
         */
        
        if (empCheck == IS_PRESENT) {

            Working_Hr = 8;

        }

        double Salary = Working_Hr * SALARY_PER_HR;

        System.out.println("Employee Salary is = " + Salary + "  Doller");

    }


    public static void main(String[] args)
    {
        EmpWageBuilder.employeeAttendace();  //main method
    }

}

