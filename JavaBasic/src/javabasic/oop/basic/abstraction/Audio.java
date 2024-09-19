/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasic.oop.basic.abstraction;

/**
 *
 * @author hnd
 */
public class Audio extends Media{
    
    void play(){
        System.out.println("Playing audio");
    }
    void stop(){
        System.out.println("Stopping audio");
    }
    
}
