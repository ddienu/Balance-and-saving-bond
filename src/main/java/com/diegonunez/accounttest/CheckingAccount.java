/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.accounttest;

/**
 *
 * @author ddienu
 */
public class CheckingAccount {
    
    public double balance;
    public String name;
    
    public void withDraw(double quantityWithDraw){
        
        if ( balance < 10){
            System.out.println("The balance is too low to make a withdraw");
        }else if( quantityWithDraw < 0){
            System.out.println("Positive values only");
        }else{
            System.out.println("Your balance is: "+balance);
            balance -= quantityWithDraw;
            System.out.println("The withdraw quantity is: "+quantityWithDraw);
            System.out.println("New balance is: "+balance);
        }
        
    }
    
    
    
    
}
