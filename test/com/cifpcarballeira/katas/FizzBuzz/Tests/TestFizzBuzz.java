/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz.Tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chanquinhas
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals ("1", result);
     }
     
     @Test
     public void test2devuelve2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals ("2", result);
     }
     
     @Test
     public void test3devuelveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals ("Fizz", result);
     }
     
     @Test
     public void test5devuelveBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(5);
        assertEquals ("Buzz", result);
     }

    @Test
     public void test3_5devuelveFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);
        assertEquals ("FizzBuzz", result);
     }

    @Test
     public void testcontiene3() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(43);
        assertEquals ("Fizz", result);
          
     }   

    @Test
     public void testcontiene5() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(25);
        assertEquals ("Buzz", result);
    } 	 

}