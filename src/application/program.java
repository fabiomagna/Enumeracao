package application;

import entities.enums.OrderStatus;
import entitiess.Order;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);
    }



}
