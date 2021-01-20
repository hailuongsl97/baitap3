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
public class Manager extends Feedback {
    // có 1 quản lý nên sử dung singleton 
    
    private static Manager manager;

    public static Manager getInstance() {
        if (manager == null) {
            manager = new Manager();
        }
        return manager;
    }

    @Override
    public void handleComplain(int level) {
        if (level == 2) {
            System.out.println("Quản lý xin lỗi vì không hài lòng khách hàng");
        } else if (this.nextLevel != null) {
            this.nextLevel.handleComplain(level);
        }
    }

}
