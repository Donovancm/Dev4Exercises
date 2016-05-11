/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPatternMusic;

/**
 *
 * @author Donovan
 */
public interface IMusicLibraryVisitor {
    void onJazz(Jazz number);
    void onHeavyMetal(HeavyMetal number);
}
