/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import Chef.ChefMain;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author HL
 */
public class ManageMember {
    //lớp quản lý nhân viên nhà hàng 
	ArrayList<ChefMain> listChef = new ArrayList<ChefMain>();
	public ManageMember() {
		// TODO Auto-generated constructor stub
	}
	//thêm đầu bếp 
	public void addChef(ChefMain chef) {
		this.listChef.add(chef);
	}
	// danh sách đầu bếp có thể thực hiện món ăn
	public ArrayList<ChefMain> getlistChefCanMake(int index) {
		ArrayList<ChefMain> listChefCanMake = new ArrayList<>();
		for(ChefMain chef: listChef) {
			if(chef.getCanMake().contains(index)) {
				listChefCanMake.add(chef);
			}
		}
		return listChefCanMake;
	}
            // chọn ngẫu nhiên đầu bếp
	public ChefMain getRandomChefCanMake(int index){
		Random random = new Random();
		ArrayList<ChefMain> listChefCanMake = getlistChefCanMake(index);
                System.out.println(listChefCanMake.size());
		int x = random.nextInt(listChefCanMake.size()+1);
                
		return listChefCanMake.get(x);
	}
}
