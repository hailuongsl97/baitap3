/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chef;

import Food.Material;
import java.util.ArrayList;

/**
 *
 * @author HL
 */
public class ChefA extends ChefMain{
    
  	public ChefA(String name) {
		super(name);
	}
	//các món ăn biết đã làm xong riêng 
	public void makeHamberger() {
		if(Material.butter<1) {
			String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			super.notifyAllWaiter(notify);
		}else {
			 String notify= this.getName()+" đã làm xong phở\n";
			super.notifyAllWaiter(notify);
			Material.butter--;
		}
	}
	public void makeJuice() {
		if(Material.fruit<1) {
			String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			super.notifyAllWaiter(notify);
		}else {
			 String notify= this.getName()+" đã làm xong phở\n";
			super.notifyAllWaiter(notify);
			Material.fruit--;
		}
	}
	public void makeMeat() {
		if(Material.pork<1) {
			String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			super.notifyAllWaiter(notify);
		}else {
			 String notify= this.getName()+" đã làm xong phở\n";
			super.notifyAllWaiter(notify);
			Material.pork--;
		}
	}
	//món mà đầu bếp 2 và đầu bếp 1 đều  biết đã làm xong 
	public void makeMilktea() {
		if(Material.milk<1) {
			String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			super.notifyAllWaiter(notify);
		}else {
			 String notify= this.getName()+" đã làm xong phở\n";
			super.notifyAllWaiter(notify);
			Material.milk--;
		}
	}
	
	public ArrayList<Integer> getCanMake() {
		this.setCanMake(3,6,7,8);//món mà khả năng riêng của đầu bếp 
		ArrayList<Integer> list= super.getDefaultDish();// các món ăn mặc định có thể làm
		list.addAll(canMake);
		return list;
	}

 
    
}
