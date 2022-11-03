/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation;

import pl.polsl.sortingalgorithmvisualisation.controller.Controller;

/**
 * Main class where program starts
 *
 * @author Damian
 * @version 1.3
 */
public class SortingAlgorithmVisualisation
{

    /**
     * Main method of program Currently aaaaa file name is throwing exception
     * for testing purposes, and valid name for file needs to be 5 letters or
     * longer
     *
     * @param args Program only read first argument and check if it is correct
     * path to file with data to sort
     */
    public static void main(String[] args)
    {
        Controller controller;
        if (args.length > 0)
        {
            controller = new Controller(args[0]);
        } else
        {
            controller = new Controller();
        }
        controller.run();    
    }
}
