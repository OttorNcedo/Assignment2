package za.ac.cput.assignment2;
/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a Students programme for List using TDD
 */

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class listTest {
    private List<String> students = new ArrayList<String>();

    public int indexOf(Object o) {

        return 0;
    }

    @Test
    public void listAdd() {
        students.add("Emma");
        students.add("Ronan");
        students.add("Antonio");
        students.add("Paul");
        assertEquals(4, students.size());
        System.out.println("Total students added: " + students.size());
    }

    @Test
    public void listRemove() {
        students.add("Antonio");
        students.add("Paul");
        students.remove("Paul");
        assertEquals(1, students.size());
        System.out.println("Student(s) removed: " + students.size());
    }
    @Test
    public void listFind() {
        //public int indexOf(Object o);
        students.add("Manny");
        students.add("Jacob");
        students.add("Luke");
        assertEquals(3,students.size());
        System.out.println("index of 'Manny' is: " +students.indexOf("Manny"));

    }
}