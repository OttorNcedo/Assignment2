package za.ac.cput.assignment2;

/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a HashMap programme for Map using TDD
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {
    private HashMap map;

    @BeforeEach
    public void setUp() {

        this.map = new HashMap();
    }

    @Test
    public void mapAdd() {
        map.add("Hello", 3);
        map.add("Love", 3);
        map.add("Laugh", 3);
        assertEquals(3, map.size());
        System.out.println("Total Strings added: " +map.size());

    }

    @Test

    public void mapRemove() {
        map.add("Hello", 2);
        map.add("Love", 2);
        map.remove("Hello");

        assertEquals(1,map.size());
        System.out.println("Total Strings removed: " +map.size());
    }

    @Test
    public void mapFind() {
        map.add("Mouse",5);
        map.add("Hello", 5);

        assertEquals(2,map.size());
        assertTrue(map.containsKey("Hello"));
        System.out.println("Hello");
    }


}