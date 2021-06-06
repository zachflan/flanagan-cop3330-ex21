/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex21;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner monthNum = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        String monthNumS = monthNum.nextLine();
        int monthNumI = Integer.parseInt(monthNumS);

        switch(monthNumI){
            case 1:
                System.out.println("The name of the month is January");
                break;
            case 2:
                System.out.println("The name of the month is February");
                break;
            case 3:
                System.out.println("The name of the month is March");
                break;
            case 4:
                System.out.println("The name of the month is April");
                break;
            case 5:
                System.out.println("The name of the month is May");
                break;
            case 6:
                System.out.println("The name of the month is June");
                break;
            case 7:
                System.out.println("The name of the month is July");
                break;
            case 8:
                System.out.println("The name of the month is August");
                break;
            case 9:
                System.out.println("The name of the month is September");
                break;
            case 10:
                System.out.println("The name of the month is October");
                break;
            case 11:
                System.out.println("The name of the month is November");
                break;
            case 12:
                System.out.println("The name of the month is December");
                break;
        }
    }
}