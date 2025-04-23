package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalc {

    public static void main(String[] args) {
        try
        {

        FileReader fileReader = new FileReader("src/data/employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);

        bufReader.readLine(); // Ignoring header line PLEASE REMEMBER THIS NEXT TIME

        String input;

        while((input = bufReader.readLine()) != null) {

            String[] tokens = input.split("\\|");
//            System.out.println(Arrays.toString(tokens)); // checking to see if the array method is actually working lmao
            int employeeID = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            float hoursWorked = Float.parseFloat(tokens[2]);
            float payRate = Float.parseFloat(tokens[3]);


            Employee emp = new Employee(employeeID, name, hoursWorked, payRate);
            emp.setName(name);
            emp.setPayRate(payRate);
            emp.setEmployeeID(employeeID);
            emp.setHoursWorked(hoursWorked);

            System.out.printf("Name: %s | ID: %d | Pay Rate: $%.2f | Hours Worked: %.2f | Gross Pay: $%.2f%n",
                    emp.getName(), emp.getEmployeeID(), emp.getPayRate(), emp.getHoursWorked(), emp.getGrossPay());
        }

        bufReader.close();


    }

    catch(IOException e){
            e.printStackTrace();
        }
    }
}
