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

// nếu không xử lý dc thi 
public void setNextLevel( Feedback nextLevel){
this.nextLevel = nextLevel;
}
// phương thức xử lý phàn nàn khách hàng
public abstract void handleComplain(int level);
}
