/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.herbst.ex403_konto;

/**
 *
 * @author Alex
 */
public class Account {
    private double balance;
    
    public void withdraw(double sum){
        balance -= sum;
    }
    
    public void deposit(double sum){
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }    
}
