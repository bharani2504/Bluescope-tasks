package org.bluescope.problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DepreciationCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your product price");
        double price = sc.nextDouble();

        System.out.println("Enter purchase date (dd-MM-yyyy) :");
        String inputdate = sc.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate purchasedate = LocalDate.parse(inputdate, formatter);

        LocalDate date = LocalDate.now();

        long totaldays = ChronoUnit.DAYS.between(purchasedate, date);

        double years = totaldays / 365.0;
        double rate=getrate(years);

        double yearlydp=price * (rate/100);
        double totaldp= yearlydp*years;

        double finalvalue=price-totaldp;

        if ( finalvalue < 0) {
            finalvalue = 0;}

        System.out.println(" Current value of your product is :" + finalvalue);

    }


    public static double getrate(double years) {

        if (years <= 1)
            return 5;
        else if (years <= 3)
            return 10;
        else if (years <= 5)
            return 15;
        else
            return 20;
    }


}
