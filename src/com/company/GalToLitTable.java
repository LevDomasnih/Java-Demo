package com.company;

public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, litres;
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854;
            System.out.println(gallons + " Галлоном соответствует " +
                    litres + " Литра.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
