package com.mycompany.bugged_04_stowekyle;

/*
 * This program...      //Your Block COMMENT Here  ////////////////////////////
 * 
 *
 *
*/


import java.util.Scanner;
public class Bugged_04_StoweKyle{
    public static void main(String[] args){
        int var1;
        System.out.print("Type 1 if you want to convert Dollars to Euros and 2 to convert Euros to Dollars. ");
        Scanner keyboard = new Scanner(System.in);
        var1 = keyboard.nextInt();
        
        switch(var1){
            case 1 -> DollarstoEuros();
            case 2 -> EurostoDollars();
            default -> System.out.print("Invalid Input");
        }
    }

    static void DollarstoEuros(){
        double dollars;
        double eurosPerDollar;
        double grossEuros;
        double fee;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");        
        dollars = keyboard.nextDouble();        
        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = keyboard.nextDouble();        
        grossEuros = dollars * eurosPerDollar;        
        System.out.println(dollars + " Dollars => " + grossEuros
         + " Gross Euros.");
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        double rate = keyboard.nextDouble(); 
        
        fee = grossEuros * rate / 100;
        double netEuros = grossEuros - fee;
        
	System.out.println("Thank you for using the Dollars to Euros Converter.\n");
	System.out.println("Please check your Math.\n");	
        System.out.println(dollars + " \tDollars\n " + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                grossEuros + " \tGross Euros\n" +
                rate + " \tFee Percentage %\n" +
                fee + " \tFee in Euros\n" +
                netEuros + " \tNet Euros\n");        
    }
   static void EurostoDollars(){
        double Euros;
        double DollarsperEuro;
        double grossDollars;
        double fee;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Euros to Dollars Converter.\n");            
        System.out.print("How many Euros do you want to convert? ");        
        Euros = keyboard.nextDouble();        
        System.out.print("What is the Dollars-per-Euros exchange rate? ");        
        DollarsperEuro = keyboard.nextDouble();        
        grossDollars = Euros * DollarsperEuro;        
        System.out.println(Euros + " Dollars => " + grossDollars
         + " Gross Euros.");
        System.out.print("\nWhat is the Dollars-per-Euros Fee Percentage % ? ");        
        double rate = keyboard.nextDouble(); 
        
        fee = grossDollars * rate / 100;
        double netEuros = grossDollars - fee;
        
	System.out.println("Thank you for using the Euros to Dollars Converter.\n");
	System.out.println("Please check your Math.\n");	
        System.out.println(Euros + " \tEuros\n " + 
                DollarsperEuro + " \tDollars per Euro Exchange Rate\n" +
                grossDollars + " \tGross Dollars\n" +
                rate + " \tFee Percentage %\n" +
                fee + " \tFee in Dollars\n" +
                netEuros + " \tNet Dollars\n"); 
    } 
}
