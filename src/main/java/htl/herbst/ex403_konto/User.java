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

    public User(Account acc) {
        this.acc = acc;
    }
    
    public void withdraw(double sum){
        acc.withdraw(sum);
    }
    
}
