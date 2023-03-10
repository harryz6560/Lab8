package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<City>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, cityList);
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCities(){
        CustomList list = new CustomList(null, cityList);
        // see if it is false
        assertEquals(false, list.hasCity(new City("Yellowknife", "Northwest Territories")));
    }

    @Test
    void testCountCities(){
        CustomList list = new CustomList(null, cityList);
        City city = new City("Yellowknife", "Northwest Territories");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }

    @Test
    void testDeleteCities(){
        CustomList list = new CustomList(null, cityList);
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        // test the delete
        cityList.delete(city);
        assertEquals(0, cityList.countCities());
    }

}
