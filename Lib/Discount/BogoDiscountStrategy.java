package Lib.Discount;

import Lib.*;
/*
 *  กลยุทธ์ส่วนลด BOGO ( 1 แถม 1)
 */

public class BogoDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculatePrice(CartItem item) {
        int quantity = item.getQuantity();
        double price = item.getProduct().getPrice();
        int quantityTopay = (quantity / 2)+(quantity % 2);
        return price * quantityTopay;
    }
    
}
