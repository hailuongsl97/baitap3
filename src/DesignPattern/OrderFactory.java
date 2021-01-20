/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

import Food.Cake;
import Food.Chicken;
import Food.Coffee;
import Food.Cream;
import Food.Hamberger;
import Food.Juice;
import Food.Meat;
import Food.Milktea;
import Food.Noodles;
import Food.Soda;
import Member.ManageMember;

/**
 *
 * @author HL
 */
public class OrderFactory {
    ManageMember manage;
	public OrderFactory(ManageMember manage) {
		this.manage = manage;
	}

   
	public IMenu getOrder(int index) {
		switch(index) {
		case 1: return new Cake(manage.getRandomChefCanMake(index)); 
		case 2: return new Cream(manage.getRandomChefCanMake(index)); 
		case 3: return new Milktea(manage.getRandomChefCanMake(index)); 
		case 4: return new Coffee(manage.getRandomChefCanMake(index)); 
		case 5: return new Soda(manage.getRandomChefCanMake(index)); 
		case 6: return new Juice(manage.getRandomChefCanMake(index)); 
		case 7: return new Meat(manage.getRandomChefCanMake(index)); 
		case 8: return new Hamberger(manage.getRandomChefCanMake(index)); 
		case 9: return new Chicken(manage.getRandomChefCanMake(index)); 
		case 10: return new Noodles(manage.getRandomChefCanMake(index)); 
		default: return null;
		}
	}
}
