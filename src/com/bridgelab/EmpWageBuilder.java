package com.bridgelab;

// uc4

/*
     adding employee salary using switch case statement
 */


public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int SALARY_PER_HR = 20;
    public static final int IS_PART_TIME = 2;

    public static void employeeAttendace() {

        int empCheck = (int) Math.floor((Math.random() * 10) % 3);

        int Working_Hr = 0;

        switch (empCheck) {

            case IS_FULL_TIME:
                Working_Hr = 8;   //condition 1
                break;

            case IS_PART_TIME:
                Working_Hr = 4;   //condition 2
                break;

            default:
                Working_Hr = 0;  //default condition print if case1 and 2 fail.
        }

        double Salary = Working_Hr * SALARY_PER_HR;

        System.out.println("Emplyee Salary is = " + Salary + "  Doller");
    }


    public static void main(String[] args) {

        EmpWageBuilder.employeeAttendace();    //main method
    }

}