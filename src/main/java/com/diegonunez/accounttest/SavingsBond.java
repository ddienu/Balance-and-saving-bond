/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.accounttest;

/**
 *
 * @author ddienu
 */
public class SavingsBond {
    
    public String name;
    public double balance;
    public int term;
    public int monthsRemaining;
    public double interestRate;
    
    public void savingsBond ( int term){
        
        if( term >= 0 && term<12){
            interestRate = 0.005;
        }else if(term >= 12 && term <24){
            interestRate = 0.01;
        }else if(term >= 24 && term < 36){
            interestRate = 0.015;
        }else if(term >= 36 && term < 47){
            interestRate = 0.02;
        }else if (term >= 48 && term < 60){
            interestRate = 0.025;
        }else{
            System.out.println("Invalid term");
            interestRate = 0;
        }
        monthsRemaining = term;
    }
    
    public void earnInterest(){
        
        if ( monthsRemaining > 0){
            balance += ((balance * interestRate) / 12);
            monthsRemaining--;
            System.out.println("Balance: $"+balance);
            System.out.println("Rate "+interestRate*100+"%");
            System.out.println("Months Remaining: "+monthsRemaining);
        }else{
            System.out.println("Bond Matured");
        }
    }
    
}
