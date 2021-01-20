
import Chef.ChefMain;
import DesignPattern.Feedback;
import DesignPattern.IMenu;
import DesignPattern.OrderFactory;
import Member.ManageMember;
import Member.Manager;
import Member.Owner;
import Member.Waiter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HL
 */
public class Main {
    private static ArrayList<String>  menuFood = new ArrayList<>();
    private static void  initMenu(){
    menuFood.add("Cake");//1
		menuFood.add("Cream");//2
		menuFood.add("MilkTea");//3
		menuFood.add("Coffee");//4
		menuFood.add("Soda");//5
		menuFood.add("Juice");//6
		menuFood.add("Meat");//7
		menuFood.add("Hamberger");//8
		menuFood.add("Chicken");//9
		menuFood.add("Noodles");//10
    }
    private static void printFirstNotification() {
		System.out.println("1. gọi món");
		System.out.println("2. phàn nàn dịch vụ");
	}
	private static void printComplainChoice() {
		System.out.println("1. thái độ phục vụ không tốt");
		System.out.println("2. món ăn không ngon");
		System.out.println("3. giá tiền có sai sót");
	}
       private static void printMenu() {// danh sách lựa chọn
		int i=0;
		for(i=0;i<menuFood.size();i++) {
			System.out.println((i+1)+":"+menuFood.get(i));
		}
	}
    
    public static void main(String[] args) {
        int choice = 0;
		int numberChosen = 0;
		//thiết lập menu
		initMenu();
		//phục vụ trong quán
		Waiter waiter = new Waiter();//hiện tại có một phục vụ 
		//quản lí đầu bếp 
		      ManageMember manage = new ManageMember();
		ChefMain chef1 = new ChefMain("đầu bếp 1");
		ChefMain chef2 = new ChefMain("đầu bếp 2");
                        ChefMain.add(waiter);//thêm bồi bàn vào để thông báo 
		manage.addChef(chef1);
		manage.addChef(chef2);
		//tạo ra các order 
		OrderFactory orderFoodFactory = new OrderFactory(manage);
		//bộ phận xử lí lỗi 
		Feedback manager = Manager.getInstance();
		Feedback owner = Owner.getInstance();
		waiter.setNextLevel(manager);
		manager.setNextLevel(owner);
		
		//chương trình chạy theo lựa chọn của khách hàng 
		Scanner scanner = new Scanner(System.in);
		while(true) {//khách đến liên tục 
			//xuất menu ra màn hình 
			printFirstNotification();
			System.out.println("xin mời chọn\n");
			int x = scanner.nextInt();
			switch(x) {
			case 1: {
				//order món 
				printMenu();
				do {
					System.out.println("xin mời chọn món, nhập 0 để kết thúc!\n");
					choice = scanner.nextInt();
					if(choice ==0||choice<0||choice>menuFood.size()) break;
					else {
						//thêm order vào bill 
						IMenu order = orderFoodFactory.getOrder(choice);
						waiter.addToBill(order);
						numberChosen++;
					}
				}
				while(choice!=0);
				if(numberChosen!=0) waiter.excuteBill();
				else System.out.print("cảm ơn đã tới nhà hàng\n");
				System.out.println("------------------------------");
				break;
				}
			case 2: {
				//xử lí phàn nàn 
				printComplainChoice();
				System.out.println("xin mời chọn\n");
				int complainChoice = scanner.nextInt();
				waiter.handleComplain(complainChoice);
				break;
			}
			default: 
				System.out.println("không hợp lệ");
		}
		}
    }
}
