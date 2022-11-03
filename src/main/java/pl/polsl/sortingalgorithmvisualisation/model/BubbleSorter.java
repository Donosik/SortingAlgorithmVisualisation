/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

import java.util.Arrays;
import java.util.List;

/**
 * Class to sort Data using Bubble Sort Algorithm
 *
 * @author Damian
 * @version 1.3
 */
public class BubbleSorter implements SortStrategy
{

    /**
     * Function where sorting algorithm is implemented
     *
     * @param data Data that needed to be sorted
     */
    @Override
    public void sort(Data data)
    {
        for (int i = 0; i < data.getArray().size() - 1; i++)
        {
            for (int j = 0; j < data.getArray().size() - i - 1; j++)
            {
                if (data.getElement(j) > data.getElement(j + 1))
                {
                    data.swap(j, j + 1);
                }
            }
        }
    }
}
