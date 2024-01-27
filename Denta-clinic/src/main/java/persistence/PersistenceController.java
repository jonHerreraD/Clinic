/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.User;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author diazj
 */
public class PersistenceController {
    
    
    
    ScheduleJpaController scheduleJPA = new ScheduleJpaController();
    OdontologistJpaController odontoJPA = new OdontologistJpaController();
    PatientJpaController patientJPA = new PatientJpaController();
    PersonJpaController personJPA = new PersonJpaController();
    TutorJpaController tutorJPA = new TutorJpaController();
    SecretaryJpaController secreJPA = new SecretaryJpaController();
    TurnJpaController turnJPA = new TurnJpaController();
    UserJpaController userJPA = new UserJpaController();

    public void createUser(User usu) {
        userJPA.create(usu);
    }

    public List<User> getUsers() {
        return userJPA.findUserEntities();
    }

    public void deleteUser(int id) {
        try {
            userJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User bringUser(int id) {
      return userJPA.findUser(id);
    }

    public void editUser(User usu) {
        try {
            userJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
