
package logic;

import java.util.Date;


public class Person {
   
    private String dni;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String address;
    private Date birthday;

    public Person() {
    }

    public Person( String dni, String name, String lastName, String phoneNumber, String address, Date birthday) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthday = birthday;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    
    
    
}
