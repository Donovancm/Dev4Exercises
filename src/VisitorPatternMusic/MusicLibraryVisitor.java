/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPatternMusic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Donovan
 */
public class MusicLibraryVisitor implements IMusicLibraryVisitor {

    public List<Jazz> jazz = new ArrayList<>();
    public List<HeavyMetal> heavyMetal = new ArrayList<>();
    
    @Override
    public void onJazz(Jazz number) {
        jazz.add(number);
    }

    @Override
    public void onHeavyMetal(HeavyMetal number) {
        heavyMetal.add(number);
    }
    
}
