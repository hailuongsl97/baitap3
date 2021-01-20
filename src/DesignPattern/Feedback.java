package DesignPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HL
 */
public abstract class Feedback  {
    // đóng vai trò là chain of responsibility
protected Feedback nextLevel;
public void setNextLevel( Feedback nextLevel){
this.nextLevel = nextLevel;
}
public abstract void handleComplain(int level);
}
