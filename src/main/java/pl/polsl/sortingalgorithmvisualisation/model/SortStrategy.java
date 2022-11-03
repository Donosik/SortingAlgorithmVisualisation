/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

/**
 * Interface for all classes implementing sorting algorithm
 *
 * @author Damian
 * @version 1.3
 */
public interface SortStrategy
{

    /**
     * Function used to sort data provided as argument
     *
     * @param data Data that needs to be sorted
     */
    public void sort(Data data);
}
