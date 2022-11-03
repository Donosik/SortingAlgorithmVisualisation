/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.controller;

/**
 * Custom class for excpetion when format for provided file is incorrect
 *
 * @author Damian
 * @version 1.3
 */
public class IncorrectFileFormatException extends Exception
{

    /**
     * Constructor of exception class
     *
     * @param errorMessage Message which will be displayed upon getting
     * exception
     */
    public IncorrectFileFormatException(String errorMessage)
    {
        super(errorMessage);
    }
}
