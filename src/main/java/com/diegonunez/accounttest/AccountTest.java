/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.diegonunez.accounttest;

/**
 *
 * @author ddienu
 */
public class AccountTest {

    public static void main(String[] args) {
        
        CheckingAccount accountChk = new CheckingAccount();
        
        accountChk.balance = 1000;
        accountChk.name = "Diego";
        
        accountChk.withDraw(200);
        
        SavingsBond savings = new SavingsBond();
        
        savings.name = "Diego";
        savings.balance = 100;
        savings.savingsBond(30);
        savings.earnInterest();
    }
}
