package za.ac.cput.assignment2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a Students programme for List using TDD
 */

public class list{
    private String firstName;
    private String lastName;
    private int Id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                '}';
    }
}
