/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingalgorithmvisualisation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pl.polsl.sortingalgorithmvisualisation.model.ArrayAlreadySortedException;
import pl.polsl.sortingalgorithmvisualisation.view.ConsoleView;
import pl.polsl.sortingalgorithmvisualisation.model.SortingStrategyContex;
import pl.polsl.sortingalgorithmvisualisation.model.Data;
import pl.polsl.sortingalgorithmvisualisation.model.BubbleSorter;

/**
 * Main Controller class of program
 *
 * @author Damian
 * @version 1.3
 */
public class Controller
{
    /**
     * Enum for all possible algorithms that user may choose from
     */
    enum PossibleStrategies
    {
        BUBBLESORT,
        QUICKSORT
    }

    /**
     * Path to file with data to input
     */
    private String filePath;
    /**
     * Object of class responsible to show data processed by program
     */
    private ConsoleView view;
    /**
     * Object of class responsible to process data
     */
    private SortingStrategyContex sorter;
    /**
     * Object of data processed by program
     */
    Data data;

    /**
     * Default Constructor of class Controller without path to file
     */
    public Controller()
    {
        this("");
    }

    /**
     * Constructor of class Controller which initializes neeeded variables
     *
     * @param arg Path to file with data
     */
    public Controller(String arg)
    {

        filePath = arg;

        view = new ConsoleView();
        // By default BubbleSorter is used to sort Data
        sorter = new SortingStrategyContex(new BubbleSorter());
        data = new Data();
        data.addObserver(view);
    }

    /**
     * Main function of class which run all functions needed for the process to
     * sort the data and visualize it
     */
    public void run()
    {
        correctPath();
        changeStrategy();
        try
        {
            data.setArray(inputFile());
            sorter.sort(data);
            view.printData(data.getArray());
        } catch (IncorrectFileFormatException | ArrayAlreadySortedException ex)
        {
            view.printMsg(ex.getMessage());
        }
    }
    
    /**
     * Function to change strategy used to sort array
     */
    private void changeStrategy()
    {
        view.printMsg("All possible strategies:");
        int i=1;
        for(PossibleStrategies var:PossibleStrategies.values())
        {
            view.printMsg(i+" "+var);
            i+=1;
        }
        //String input=getTextFromCommandLine();
        
    }

    /**
     * Function inputs data from file and returns it
     *
     * @return Return array of ints inputed from file in form of List<Integer>
     * @throws IncorrectFileFormatException Throws this Exception when file name
     * is incorrect. It's need to end with ".txt"
     */
    private List<Integer> inputFile() throws IncorrectFileFormatException
    {
        String format = ".txt";
        if (!filePath.endsWith(format))
        {
            throw new IncorrectFileFormatException("File format is incorrect");
        }

        List<Integer> testArray = new ArrayList<>();
        testArray.add(5);
        testArray.add(8);
        testArray.add(6);
        testArray.add(9);
        testArray.add(1);
        return testArray;
    }

    /**
     * Function to check if path is correct. It runs in loop and ends only if
     * path is correct
     */
    private void correctPath()
    {
        // Here check if filePath is correct
        while (!checkIfCorrectArgument(filePath))
        {
            view.printMsg("Write path to file to proccess again");

            filePath = getTextFromCommandLine();

            view.printMsg("File path: " + filePath);
        }
    }

    /**
     * Function checking whenever arg is a valid path to file which is openable
     *
     * @param arg Path to potential file
     * @return Return true if path is valid, else return false
     */
    private boolean checkIfCorrectArgument(String arg)
    {
        // Checking if file is opening correctly
        if (arg.length() >= 5)
        {
            return true;
        }
        return false;

    }

    /**
     * Function to get text from console
     *
     * @return Return first word from console input
     */
    private String getTextFromCommandLine()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
