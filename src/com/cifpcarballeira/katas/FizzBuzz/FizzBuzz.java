/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author chanquinhas
 */
public class FizzBuzz {

    public String getFizzBuzz(int i) {        
        if (i%5 == 0 && i %3 == 0)            
            return "FizzBuzz";
        if (i%3 == 0)
            return "Fizz";
        if (i%5 == 0)
            return "Buzz";
        if (i%3 == 0)
            return "Fizz";
        if (new Integer(i).toString().contains("3"))
            return "Fizz";
        else 
            return new Integer(i).toString();
    }
    
}