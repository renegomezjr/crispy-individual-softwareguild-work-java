/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.generics;

/**
 *
 * @author Rene Gomez
 */
public class GenericsDriver {
    public static void main(String[] args) {
        Box<String> wordBox = new Box("Llama");
        System.out.println(wordBox.getItem());
        
        Llama<String, Integer> beebop = new Llama<>();
        beebop.thingOne = "Yo";
        beebop.thingTwo = 2;
    }
}
