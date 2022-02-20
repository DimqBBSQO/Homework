package day11.task1;

public class Picker extends Warehouse implements Worker {
    private int solary;
    private int workDays;
    private int bonusSolary;
    public boolean isPayed = bonusSolary>0;
    private String bonus = "не выплачен";

    public Picker(){

    }

    public int getSolary(){
        return solary;
    }

    public boolean getIsPayed(){
        return isPayed;
    }

    public String toString(){
        return "Сборщик отработал "+workDays+" дней и получил зарплату в размере "+solary+" рублей...Бонус "+bonus;
    }


    @Override
    public void doWork() {
        solary = solary + 80;
        workDays++;
        incrementCountPickedOrders();
                if(workDays%10000 == 0){
                    bonus();
                }
            }



    @Override
    public void bonus() {
        System.out.println(getCountPickedOrders());
        if(getCountPickedOrders()<10000){
            System.out.println("Бонус еще не доступен");
        }else {
            if(isPayed = false) {
                bonusSolary = bonusSolary + 70000;
                bonus = "выплачен";
            }else if(isPayed = true){
                System.out.println("Бонус уже был выплачен");
            }
        }

    }
}
