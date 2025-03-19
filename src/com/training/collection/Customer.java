/*
 * writ a java code to do following tasks:
 * 1. add customer to a list
 * 2. update customer information (get the details from user)
 * 3.delete a particular customer. (get customer details from user) 
 * 4. show all customer details.
 */
package com.training.collection;
import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer { ID: " + id + ", Name: " + name + ", Email: " + email + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return id == customer.id; // نعتبر العميل متكرراً إذا كان لديه نفس الـ ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // توليد `hashCode` بناءً على `id`
    }
}



//to chick or test you can use collection way rather than scanner way

//package com.training.exercise4;
//
//
//
//
//
//public class Customer {
//
//    private int id;
//
//    private String name;
//
//    private String email;
//
//
//
//    // Constructor
//
//    public Customer(int id, String name, String email) {
//
//        this.id = id;
//
//        this.name = name;
//
//        this.email = email;
//
//    }
//
//
//
//    // Getter and Setter methods
//
//    public int getId() {
//
//        return id;
//
//    }
//
//
//
//    public void setId(int id) {
//
//        this.id = id;
//
//    }
//
//
//
//    public String getName() {
//
//        return name;
//
//    }
//
//
//
//    public void setName(String name) {
//
//        this.name = name;
//
//    }
//
//
//
//    public String getEmail() {
//
//        return email;
//
//    }
//
//
//
//    public void setEmail(String email) {
//
//        this.email = email;
//
//    }
//
//
//
//    // toString method to display customer details
//
//    @Override
//
//    public String toString() {
//
//        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
//
//    }
//
//}
//
