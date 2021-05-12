package za.ac.cput.assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a programme for Set using TDD
 */

class SetTest {

    @Test
    public void setAdd() {
        HashSet<String> hs= new HashSet<String>();
        hs.add("To All The boys");
        hs.add("Kissing Booth");
        hs.add("Lost In Space");

        assertEquals(3, hs.size());
        System.out.println(hs);
        System.out.println("Total books added: " +hs.size());

    }

    @Test
    public void setRemove() {
        HashSet<String> hs= new HashSet<String>();
        hs.add("Kissing Booth");
        hs.add("Lost In Space");
        hs.remove("Lost In Space");

        assertEquals(1, hs.size());
        System.out.println(hs);
        System.out.println("Total books removed: " +hs.size());

    }


    @Test
    public void setFind() {

        HashSet<String> hs= new HashSet<String>();
        hs.add("The Thief");
        hs.add("The Dolls House");
        hs.add("Modern Family");
        if(hs.contains("The Thief")){
        }
        assertEquals(3, hs.size());
        System.out.println("The Thief");
    }

}