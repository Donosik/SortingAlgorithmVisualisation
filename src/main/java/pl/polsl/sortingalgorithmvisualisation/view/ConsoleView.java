/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.view;

import java.util.List;
import java.util.stream.Stream;

import pl.polsl.sortingalgorithmvisualisation.controller.DataObserver;

/**
 * Class which shows the data on console output
 *
 * @author Damian
 * @version 1.3
 */
public class ConsoleView implements DataObserver
{

    /**
     * Print to console message from argument
     *
     * @param msg Message to print on console window
     */
    public void printMsg(String msg)
    {
        System.out.println(msg);
    }

    /**
     * Print to console data from argument
     *
     * @param data Data to show on console
     */
    public void printData(List<Integer> data)
    {
        //TODO: Change to foreach
        System.out.println("Sorted Data");

        Stream<Integer> stream=data.stream();
        stream.forEach(p->System.out.print(p+" "));
        
        System.out.println("");
    }

    /**
     * Function called when data is updated
     *
     * @param data Updated array of data
     */
    @Override
    public void update(List<Integer> data)
    {
        printData(data);
    }

}
