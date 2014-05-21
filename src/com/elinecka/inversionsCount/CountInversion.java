package com.elinecka.inversionsCount;

import com.elinecka.inversionsCount.Counters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gennadiy on 18.05.2014.
 */
public class CountInversion {





    public static void main(String[] args) throws IOException {

        List<Integer> inputList = new ArrayList<Integer>();
        //BufferedReader inputReader = new BufferedReader(new FileReader("C:\\JavaProject\\test.txt"));
        BufferedReader inputReader = new BufferedReader(new FileReader("C:\\Users\\Gennadiy\\Documents\\Coursera\\IntegerArray.txt"));

        String nextLine;


        while ((nextLine = inputReader.readLine()) != null) {
            inputList.add(new Integer(nextLine));
        }
        System.out.println(inputList.size());

        System.out.println("Number of inversions is " + Counters.calculateInversions(inputList));



    }




}
