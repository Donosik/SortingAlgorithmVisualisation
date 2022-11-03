/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

/**
 * Class of Contex for Strategy design pattern for all sorting algorithm classes
 *
 * @author Damian
 * @version 1.3
 */
public class SortingStrategyContex
{

    /**
     * Current used sorting class
     */
    private SortStrategy sortStrategy;

    /**
     * Constructor of class
     *
     * @param strategy Sorting class that should be used at the start of this
     * class
     */
    public SortingStrategyContex(SortStrategy strategy)
    {
        sortStrategy = strategy;
    }

    /**
     * Function to change sorting algorith
     *
     * @param strategy New sorting algorithm
     */
    public void setStrategy(SortStrategy strategy)
    {
        sortStrategy = strategy;
    }
    
    /**
     * Function to call to sort Data using algorithm specified in sortStrategy
     * @param data Data that needs to be sorted
     * @throws ArrayAlreadySortedException Throws exception when data is already sorted to not sort it second time
     */
    public void sort(Data data) throws ArrayAlreadySortedException
    {
        if(checkIfSorted(data))
        {
            throw new ArrayAlreadySortedException("Array is already sorted, no need to sort it again");
        }
        
        sortStrategy.sort(data);
    }
    
    /**
     * Function to check if data is already sorted
     * @param data Data that needs to be checked
     * @return True if data is sorted in growing order else return false
     */
    private boolean checkIfSorted(Data data)
    {
        for (int i = 0; i < data.getArray().size() - 1; i++)
        {
            for (int j = 0; j < data.getArray().size() - i - 1; j++)
            {
                if (data.getElement(j) > data.getElement(j + 1))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
