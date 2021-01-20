/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import DesignPattern.Feedback;


/**
 *
 * @author HL
 */
public class Owner  extends Feedback{

    private static Owner owner;
    public static Owner getInstance() {
		if(owner ==null) {
			owner = new Owner();
		}
		return owner;
	}

    @Override
    public void handleComplain(int level) {
        if(level >=3)
        {
            System.out.println("Chủ tiệm xin lỗi vì không hài lòng khách hàng");
        
        }
    }
    
   
    
}
