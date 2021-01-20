/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import DesignPattern.Feedback;
import DesignPattern.IMenu;
import DesignPattern.IObserver;
import java.util.ArrayList;

/**
 *
 * @author HL
 */
public class Waiter extends Feedback implements IObserver{

    
    ArrayList<IMenu> bill = new ArrayList<>();
	//số lượng món đã thêm vào bill
	public void addToBill(IMenu order) {
		//thêm hóa đơn 
		bill.add(order);
	}
    
    @Override
    public void handleComplain(int level) {
       if(level == 1){
            System.out.println("Phục vụ xin lỗi vì không hài lòng khách hàng");
        }else if(this.nextLevel!=null){
            this.nextLevel.handleComplain(level);
        }

    }
	public void excuteBill() {
		System.out.print("phục vụ đã mang yêu cầu gửi cho nhà bếp \n");
		//thực hiện toàn bộ hóa đơn 
		for(IMenu order : bill) {
			order.execute();
		}
		//xóa toàn bộ hóa đơn đã làm xong
		bill.clear();
	}
    @Override
    public void listen(String status) {
             System.out.println(("Phục vụ chuyển lại lời : "+status));
		System.out.print("-->> \n");
    }
    
}
