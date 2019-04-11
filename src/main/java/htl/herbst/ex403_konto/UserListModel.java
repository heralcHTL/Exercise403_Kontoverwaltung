/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.herbst.ex403_konto;

import java.util.LinkedList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Alex
 */
public class UserListModel extends AbstractListModel{

    private LinkedList<User> liUser = new LinkedList<>();
    
    public void addUser(User u){
        if(!liUser.contains(u)){
            liUser.add(u);
        }
    }
    
    @Override
    public int getSize() {
        return liUser.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liUser.get(index);
    }
    
}
