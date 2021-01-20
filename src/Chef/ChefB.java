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
public class ChefB extends ChefMain{
    public ChefB(String name){
		super(name);
	}
	//các món ăn biết đã làm xong riêng 
	public void makeNoodles() {
		if(Material.pork<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllWaiter(false);
		}else {
			System.out.print(this.getName()+" đã làm xong phở\n");
			super.notifyAllWaiter(true);
			Material.pork--;
		}
	}
	public void makeSoda() {
		if(Material.fruit<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllWaiter(false);
		}else {
			System.out.print(this.getName()+" đã làm xong soda\n");
			super.notifyAllWaiter(true);
			Material.fruit--;
		}
	}
	//món mà đầu bếp 2 và đầu bếp 1 đều  biết đã làm xong 
	public void makeMilktea() {
		if(Material.milk<1) {
			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
			super.notifyAllWaiter(false);
		}else {
			System.out.print(this.getName()+" đã làm xong trà sữa \n");
			super.notifyAllWaiter(true);
			Material.milk--;
		}
	}
	public ArrayList<Integer> getCanMake() {
		this.setCanMake(3,5,10);//món mà khả năng riêng của đầu bếp 
		ArrayList<Integer> list= super.getDefaultDish();//các món ăn mặc định có thể làm
		list.addAll(canMake);
		return list;
	}
}
