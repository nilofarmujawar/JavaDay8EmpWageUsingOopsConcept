package com.bridgelab;

// uc7

/*
    Refactor the Code to write a Class Method to Compute Employee Wage
 */

public class EmpWageBuilder {


    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;

    public static void employeeAttendace(int SALARY_PER_HOUR, int TOTAL_WORK_DAY, int MAX_WORKING_HOUR,
                                         int FULL_DAY_WORKING_HOUR) {

        int empCheck;
        int empHr = 0;
        int totalSalary = 0;
        int day = 0;

        /*
        while loop used
          */

        while (day < TOTAL_WORK_DAY && (empHr + FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {

            day++;

            empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            /*
            adding employee salary using switch case
             */

            switch (empCheck) {

                case IS_PRESENT:                            //condition 1
                    empHr += FULL_DAY_WORKING_HOUR;
                    break;

                case IS_PART_TIME:                          //condition 2
                    empHr += (FULL_DAY_WORKING_HOUR / 2);
                    break;

                default:
                    empHr += 0;             // if case1 and case 2 is failed then default condition print
                    break;
            }

            System.out.println("Working day : " + day + " (Present : " + empCheck + ")");

        }

        totalSalary = empHr * SALARY_PER_HOUR;

        System.out.println("Monthly Emp Wage : " + totalSalary + "\nTotal working hour : " + empHr);

    }

    //main method
    
    public static void main(String[] args) {

        EmpWageBuilder.employeeAttendace(20, 20, 100, 8);
    }

}