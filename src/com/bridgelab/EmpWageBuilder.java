package com.bridgelab;

// uc5

/*
     calculating wages for month
 */

public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int SALARY_PER_HR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int NO_OF_DAYS = 20;

    public static void employeeAttendace() {

        int Working_Hr = 0;
        int empwage = 0;
        int Totalempwage = 0;

        /*
        using for loop
         */

        for (int day = 0; day < NO_OF_DAYS; day++) {

            int empCheck = (int) Math.floor((Math.random() * 10) % 3);

            /*
            adding employee salary using switch case statement

             */

            switch (empCheck) {

                case IS_FULL_TIME:      //condtion 1
                    Working_Hr = 8;
                    break;

                case IS_PART_TIME:       //condition 2
                    Working_Hr = 4;
                    break;

                default:                     // if case1 and case2 is fail then default condition is print
                    Working_Hr = 0;

            }

            empwage = Working_Hr * SALARY_PER_HR;

            Totalempwage += empwage;

            System.out.println("Emp Wage :  " + empwage);
        }

        System.out.println("Total Emp Wage : " + Totalempwage);
    }

    public static void main(String[] args) {

        EmpWageBuilder.employeeAttendace();    //main method

    }

}