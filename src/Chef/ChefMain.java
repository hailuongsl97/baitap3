/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chef;

import Food.Material;
import DesignPattern.IObserver;
import java.util.ArrayList;

/**
 *
 * @author HL
 */
public class ChefMain {

    // đóng vai trò là lớp cha của các lớp đầu bếp 
    static ArrayList<IObserver> listNotify = new ArrayList<IObserver>();// danh sách thông báo tới các phục vụ

    public static void add(IObserver waiter) {// thêm thông báo tới phục vụ
        listNotify.add(waiter);
    }

    // phương thức thông báo tới toàn bộ phục vụ
    public void notifyAllWaiter(String status) {
        for (IObserver waiter : listNotify) {
            waiter.listen(status);//t 
        }
    }

    String name;

   
    public ChefMain(String name) {
        this.name = name;
    }
    ArrayList<Integer> canMake = new ArrayList<>();// danh sách các món mà đầu bếp có thể làm

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public ArrayList<Integer> getDefaultDish(){// các món ăn mặc định mà đầu bếp nào cũng có thể  làm
		ArrayList<Integer> listDish= new ArrayList<>();
		listDish.add(1);
		listDish.add(2);
		listDish.add(4);
		listDish.add(9);
		return listDish;
	}
    public  ArrayList<Integer> getCanMake(){
		return canMake;
	}
    public void setCanMake(int ...list) {// cài đặt các món ăn có thể làm
		for(int i: list) {
			this.canMake.add(i);
		}
	}
    //món ăn các đầu bếp đều biết làm 
    
	public void makeCake() {
		if(Material.butter<1) {// nếu vật liệu đã hết  sẽ thông báo với phục vụ 
//			System.out.print(this.getName()+" thông báo :không đủ nguyên liệu \n");
                        String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			notifyAllWaiter(notify);
		}else {
//			System.out.print(this.getName()+" đã làm xong bánh\n");
                        String notify= "đã làm xong bánh\n";
			notifyAllWaiter(notify);
			Material.butter--;
		}
	}
	public void makeCream() {
		if(Material.butter<1) {
			 String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			notifyAllWaiter(notify);
		}else {
			  String notify= "đã làm xong bánh\n";
			notifyAllWaiter(notify);
			Material.butter--;
		}
	}
	public void makeChicken() {
		if(Material.chicken<1) {
			 String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			notifyAllWaiter(notify);
		}else {
			  String notify= "đã làm xong bánh\n";
			notifyAllWaiter(notify);
			Material.chicken--;
		}
	}
	public void makeCoffee() {
		if(Material.coffee<1) {
			 String notify= this.getName()+" thông báo : không đủ nguyên liệu \n";
			notifyAllWaiter(notify);
		}else {
			  String notify= "đã làm xong bánh\n";
			notifyAllWaiter(notify);
			Material.coffee--;
		}
	}
	//món các đầu bếp khác có thể làm
	public void makeHamberger() {}
	public void makeJuice() {}
	public void makeMeat() {}
	public void makeMilktea() {}
	public void makeNoodles() {}
	public void makeSoda() {}
}
