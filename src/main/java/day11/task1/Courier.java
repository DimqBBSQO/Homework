package day11.task1;

public class Courier extends Warehouse implements Worker {
    private int solary;
    private int workDays;
    private int bonusSolary;
    public boolean isPayed = bonusSolary>0;
    private String bonus = "не выплачен";

    public Courier(){

    }

    public String toString(){
        return "Курьер отработал "+workDays+" дней и получил зарплату в размере "+solary+" рублей...Бонус "+bonus;
    }


    public int getSolary(){
        return solary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        solary = solary + 100;
        workDays++;
        incrementDeliveredOrders();
        if(workDays%10000 == 0){
            bonus();
        }
    }



    @Override
    public void bonus() {
        System.out.println(getCountDeliveredOrders());
        if(getCountDeliveredOrders()<10000){
            System.out.println("Бонус еще не доступен");
        }else {
            if(isPayed = false) {
                bonusSolary = bonusSolary + 50000;
                bonus = "выплачен";
            }else if(isPayed = true){
                System.out.println("Бонус уже был выплачен");
            }
        }

    }
}
