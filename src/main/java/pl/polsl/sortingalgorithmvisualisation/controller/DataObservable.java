/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for all elements that will be observed by DataObserver interface
 *
 * @author Damian
 * @version 1.3
 */
public class DataObservable
{

    /**
     * List of all observers that are interested about state of array
     */
    public List<DataObserver> observers = new ArrayList<>();

    /**
     * Funtion to invoke when array is updated
     * @param data Array which was updated
     */
    public void notifyObservers(List<Integer> data)
    {
        for (DataObserver observer : observers)
        {
            observer.update(data);
        }
    }

    /**
     * Function to add observer interested about array
     * @param observer Object which wants to be observer
     */
    public void addObserver(DataObserver observer)
    {
        observers.add(observer);
    }

    /**
     * Function to delete observer who no longer wants to be informed about array
     * @param observer Object which no longer wants to observe
     */
    public void deleteObserver(DataObserver observer)
    {
        observers.remove(observer);
    }
}
