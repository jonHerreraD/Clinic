/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.List;
import persistence.PersistenceController;

/**
 *
 * @author diazj
 */
public class Controller {
    
    PersistenceController persisController = new PersistenceController();
    
    public void createUser(String username, String password, String role){
        User usu = new User();
        usu.setUserName(username);
        usu.setPassword(password);
        usu.setRole(role);
        persisController.createUser(usu);
    }

    public List<User> getUsers() {
        return persisController.getUsers();
    }

    public void deleteUser(int id) {
        persisController.deleteUser(id);
    }

    public User bringUser(int id) {
       return persisController.bringUser(id);
    }

    public void editUser(User usu) {
        persisController.editUser(usu);
    }
    
}
