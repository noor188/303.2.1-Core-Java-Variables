package com.perscholas.java_basics;

public class JavaBasicsClass {

    public static void main(String args[]){
        // Program 1
        int int_one = 1;
        int int_two = 2;
        int add_int = int_one + int_two;
        System.out.println(int_one + "+" + int_two + "=" + add_int);

        // Program 2
        double double_one = 3.5;
        double double_two = 4.7;
        double add_double = double_one + double_two;
        System.out.println(double_one + "+" + double_two + "=" + add_double);

        // Program 3
        int int_three = 3;
        double double_three = 4.7;
        double add_double_int = double_three + int_three;
        System.out.println(int_three + "+" + double_three + "=" + add_double_int);

        // Program 4
        int int_four = 44568334;
        int int_five = 5432;
        int divide ;
        divide = int_four / int_five;
        System.out.println(int_four + "/" + int_five + "=" + divide);

        // need to declare the variable that holds the result as float
        double divide2 ;
        divide2 = (float) int_four / int_five;
        System.out.println(int_four + "/" + int_five + "=" + divide);

        // Program 5
        double double_four = 5.5;
        double double_five = 6.7;
        double divide_double = double_five / double_four;
        System.out.println(double_five + "/" + double_four + "=" + divide_double);
        int intValue = (int) divide_double;
        System.out.println("Cast double value to int :" + intValue);

        // Program 6
        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println(y + "/" + x + "=" + q);
        double q2 = (double) y / x;
        System.out.println(y + "/" + x + "=" + q2);

        // Program 7
        final int X = 0;
        int z = X + 1;
        System.out.println(X + "+" + "1" + "=" + z);

        // Program 8
        String product1 = "coffee";
        String product2 = "tea";
        String product3 = "cake";
        double price1   = 2.7;
        double price2   = 3.5;
        double price3   = 4.5;
        double subtotal = price1 * 3 + price2 * 4 + price3 * 2;
        final double SALES_TAX = 16/100;
        double totalSale = (subtotal * SALES_TAX) + subtotal;
        System.out.printf("%.2f" , totalSale);


    }
}
