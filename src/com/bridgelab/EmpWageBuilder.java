package com.bridgelab;

// uc1

public class EmpWageBuilder {

    public static void employeeAttendace() {

        int IS_PRESENT = 1;

        double empCheck = Math.floor((Math.random() * 10) % 2);  //using random method for random no

        /*
         * check employee is present or absent
         */

        if (empCheck == IS_PRESENT) {

            System.out.println("Employee is Present");

        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }


    public static void main(String[] args) {

        EmpWageBuilder.employeeAttendace(); //main method
    }

}
