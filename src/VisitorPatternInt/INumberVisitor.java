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
public interface INumberVisitor {
     void onInt(MyInt number);
     void onFloat(MyFloat number);

    
}
