package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders(){
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountPickedOrders(){
        countPickedOrders++;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    public String toString(){
        return "Количество собранных заказов: "+getCountPickedOrders()+" Количество доставленных заказов: "+getCountDeliveredOrders();
    }



}
