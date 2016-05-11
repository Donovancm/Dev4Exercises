/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPatternInt;

/**
 *
 * @author Donovan
 */
public class NumberVisitor implements INumberVisitor {

    @Override
    public void onInt(MyInt number) {
        System.out.println("INT NUMBER GIVEN");
    }

    @Override
    public void onFloat(MyFloat number) {
        System.out.println("FLOAT NUMBER GIVEN");
    }
    
}
