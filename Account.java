package MainExercise2;

public class Account {


    private String name;
    private int number;
    protected double balance;

    public Account(String difName, int difNumber){
        name = difName;
        number = difNumber;
        balance = 0;

    }



    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

}
