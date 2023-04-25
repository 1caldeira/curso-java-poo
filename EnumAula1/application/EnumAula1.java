package application;

import entities.Orderr;


import java.util.Date;

public class EnumAula1 {
    public static void main(String[] args) {
        Orderr orderr = new Orderr(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(orderr);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
