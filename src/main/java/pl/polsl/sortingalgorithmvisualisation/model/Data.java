/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

import java.util.Collections;
import java.util.List;
import pl.polsl.sortingalgorithmvisualisation.controller.DataObservable;

/**
 * Class storing array of data for all algorithms
 *
 * @author Damian
 * @version 1.3
 */
public class Data extends DataObservable
{

    /**
     * Array storing data needed to be sorted
     */
    private List<Integer> array;

    /**
     * Default Constructor for class Data
     */
    public Data()
    {

    }

    /**
     * Constructor for class Data
     *
     * @param value Default value for variable array
     */
    public Data(List<Integer> value)
    {
        setArray(value);
    }

    /**
     * Getter of variable array
     *
     * @return Return array
     */
    public List<Integer> getArray()
    {
        return array;
    }

    /**
     * Getter of element in variable array
     *
     * @param index Index of data you want to get
     * @return Return element of array from specific index
     */
    public Integer getElement(int index)
    {
        return array.get(index);
    }

    /**
     * Setter of variable array. It notify all observers about new state of
     * array
     *
     * @param value New values of the array
     */
    public void setArray(List<Integer> value)
    {
        array = value;
        notifyObservers(array);
    }

    /**
     * Function to swap two values in array. It notify all observers about new
     * state of array
     *
     * @param index1 First index of value to swap
     * @param index2 Second index of value to swap
     */
    public void swap(int index1, int index2)
    {
        Collections.swap(array, index1, index2);
        notifyObservers(array);
    }

}
