package za.ac.cput.assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a Collection programme for collection using TDD
 */


class CollecitonTest {

    Collection c = new LinkedHashSet();

    @Test

    void add(){
        c.add("Ottor");
        c.add("Ncedo");
        c.add("Ongi");
        assertEquals(3, c.size());
        System.out.println(c);
        System.out.println("Total names added: " +c.size());
    }

    @Test
     void remove(){
        c.add("Bukhona");
        c.add("Ncedo");
        c.remove("Ncedo");
        assertEquals(1,c.size());
        System.out.println(c);
        System.out.println("Total names removed: " +c.size());
    }

    @Test
    void find(){
        c.add("Bukhona");
        c.add("Ncedo");
        if(c.contains("Ncedo")){
            System.out.println("Ncedo");
        }
        assertEquals(2, c.size());
    }
}