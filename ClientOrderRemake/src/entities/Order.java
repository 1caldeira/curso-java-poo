package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;

    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public Order(){}
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total(){
        double sum;
        for(OrderItem it : items){
            sum += it.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: "+sdf.format(getMoment())+"\n");
        sb.append("Order status: "+getStatus()+"\n");
        sb.append("Client: "+client+"\n");
        sb.append("Order items: ");
        for (OrderItem item : items)({
                sb.append(item+"\n");
        }
        sb.append("Total price: "+String.format("%.2f", total())));
        return sb.toString();
        }


    }
}
