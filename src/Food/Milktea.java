/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import Chef.ChefMain;
import DesignPattern.IMenu;

/**
 *
 * @author HL
 */
public class Milktea implements IMenu {
    ChefMain chef;
public Milktea(ChefMain chef) {
        this.chef = chef;
    }

  
    @Override
    public void execute() {
chef.makeMilktea();
//To change body of generated methods, choose Tools | Templates.
    }
}
