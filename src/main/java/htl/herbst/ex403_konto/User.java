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
public class User {
    private Account acc;
    private String name;

    public User(Account acc, String name) {
        this.acc = acc;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void withdraw(double sum){
        acc.withdraw(sum);
    }
    
    public void deposit(double sum){
        acc.deposit(sum);
    }

    @Override
    public String toString() {
        return name;
    }
    
}
