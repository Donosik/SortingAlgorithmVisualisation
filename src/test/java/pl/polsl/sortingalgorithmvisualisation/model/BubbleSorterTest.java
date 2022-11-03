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
public class BubbleSorterTest
{

    BubbleSorter bubbleSorter;

    public BubbleSorterTest()
    {
        bubbleSorter = new BubbleSorter();
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
    }

    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test is used to test sort function form BubbleSorter class using various data arrays
     * @param test Array with unsorted data
     * @param expected Array with data in expected order
     */
    @ParameterizedTest
    @MethodSource("testData")
    public void sort(ArrayList<Integer> test, ArrayList<Integer> expected)
    {
        Data testData = new Data(test);
        Data expectedData = new Data(expected);

        bubbleSorter.sort(testData);
        assertArrayEquals(testData.getArray().toArray(), expectedData.getArray().toArray());
    }

    /**
     * Function providing data for sort function
     * @return Return Stream of Arguments, where each Argument consist of 2 ArrayList with Integers
     */
    private static Stream<Arguments> testData()
    {
        return Stream.of(
                Arguments.of(new ArrayList<Integer>(Arrays.asList(5, 7, 6, 1, 2)), new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 7))),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(3, 7, 6, 1, 2)), new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 7)))
        );
    }
}
