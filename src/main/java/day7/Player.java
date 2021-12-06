package day7;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayer = 0;
    private static int numberOfPlayers = 0;


    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayer<6){
            numberOfPlayers++;
            countPlayer++;
        }else {
        numberOfPlayers++;
        }
    }


    public int getStamina () {
        return stamina;
    }

    public int getCountPlayer () {
        return countPlayer;
    }


    public void run(){
        if(stamina>0) {
            stamina--;
        }else{
            countPlayer--;
        }
    }


    public static void info(){
        if(countPlayer<6){
            System.out.println("Команды не полные, на поле еще есть "+(6-countPlayer)+ " мест"+" всего было создано "+numberOfPlayers+" игроков");
        }else {
            System.out.println("Команды полные, мест нет. На поле "+countPlayer+" игроков"+" всего было создано "+numberOfPlayers+" игроков");
        }
    }

}
