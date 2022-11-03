/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Damian
 */
public class DataTest
{
    Data data;
    public DataTest()
    {
        data=new Data();
    }

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    public void setUp()
    {
        data.setArray(new ArrayList<Integer>(Arrays.asList(1,5,6,9,7,2,3)));
    }

    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test is used to test swap function in Data class
     * @param index1 First index to swap value
     * @param index2 Second index to swap value
     */
    @ParameterizedTest
    @MethodSource("testData")
    public void swap(int index1,int index2)
    {
        int data1=data.getElement(index1);
        data.swap(index1,index2);
        int data2=data.getElement(index2);
        assertEquals(data1,data2);
    }
    
    /**
     * Function providing data for swap function
     * @return Return Stream of Arguments, where each Argument consist of 2 ints
     */
    private static Stream<Arguments> testData()
    {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(2,3)
        );
    }
}
