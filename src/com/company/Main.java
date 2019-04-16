package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char custname;
        double purchaseamount;
        double taxexempt = 0;
        double statetax = .03;
        double fedtax = .05;
        double specialsalestax = .07;
        int  taxcode;
        double totalamountdue;
        double salestax;
       System.out.println("enter customer name");
        Scanner keyboard = new Scanner(System.in);
        custname = keyboard.nextChar();
        System.out.println("enter purchase amount");
        purchaseamount = keyboard.nextDouble();
        System.out.println("enter tax code");
        taxcode = keyboard.nextInt();

        if taxcode = 0;
        salestax = 0;
        Else if taxcode = 1;
        salestax = purchaseamount * statetax;
        Else if taxcode = 2;
        salestax = purchaseamount * fedtax;
        else if taxcode = 3;
        salestax = purchaseamount * specialsalestax;
        end if
            totalamountdue = purchaseamount + salestax;





        System.out.println("customer name:  " +custname, "purchase amount:  "+purchaseamount + purchaseamount+ specialsalestax +  totalamountdue");
    }
}
