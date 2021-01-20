package Food;

import Chef.ChefMain;
import DesignPattern.IMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HL
 */
public class Meat implements IMenu{
    ChefMain chef;
public Meat(ChefMain chef) {
        this.chef = chef;
    }

  
    @Override
    public void execute() {
chef.makeMeat();
    }
}
