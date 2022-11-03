/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SortingStrategyContexTest
{

    SortingStrategyContex sorter;

    public SortingStrategyContexTest()
    {
        sorter = new SortingStrategyContex(new BubbleSorter());
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

    @ParameterizedTest
    @MethodSource("testData")
    public void sort(ArrayList<Integer> test, ArrayList<Integer> expected, boolean expectedException)
    {

        Data testData = new Data(test);
        Data expectedData = new Data(expected);

        try
        {
            sorter.sort(testData);
            assertArrayEquals(testData.getArray().toArray(), expectedData.getArray().toArray());
        } catch (ArrayAlreadySortedException ex)
        {
            assertEquals(true, expectedException);
        }

    }

    /**
     * Function providing data for sort function
     *
     * @return Return Stream of Arguments, where each Argument consist of
     */
    private static Stream<Arguments> testData()
    {
        return Stream.of(
                Arguments.of(new ArrayList<Integer>(Arrays.asList(5, 7, 6, 1, 2)), new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 7)), false),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(3, 7, 6, 1, 2)), new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 7)), false),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1,1)), new ArrayList<Integer>(Arrays.asList(1,1)), true),
                Arguments.of(new ArrayList<Integer>(Arrays.asList()), new ArrayList<Integer>(Arrays.asList()), true),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1)), new ArrayList<Integer>(Arrays.asList(1)), true)
        );
    }
}
