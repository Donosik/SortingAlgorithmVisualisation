/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.controller;

import java.util.List;

/**
 * Interface for all class that wants to be informed about array update
 *
 * @author Damian
 * @version 1.3
 */
public interface DataObserver
{

    /**
     * Function called when function notifyObservers from DataObservable is called
     * @param data Array of data that was updated 
     */
    public void update(List<Integer> data);
}
