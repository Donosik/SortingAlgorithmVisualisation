/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.model;

/**
 * Custom class for excpetion when array is already sorted
 *
 * @author Damian
 * @version 1.3
 */
public class ArrayAlreadySortedException extends Exception
{

    /**
     * Constructor of exception class
     *
     * @param errorMessage Message which will be displayed upon getting
     * exception
     */
    public ArrayAlreadySortedException(String errorMessage)
    {
        super(errorMessage);
    }
}
