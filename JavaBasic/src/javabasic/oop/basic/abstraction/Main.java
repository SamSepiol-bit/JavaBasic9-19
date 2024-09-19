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
public class Main {

    public static void main(String[] args) {
        Media audio1 = new Audio();
        audio1.play();
        audio1.stop();

        Media video1 = new Video();
        video1.play();
        video1.stop();

    }

}
