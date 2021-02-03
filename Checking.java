package MainExercise2;

public class Checking extends Account {

    Checking(String name, int number) {
        super(name, number);
    }

    public void deposit(double depo) {
        double sum = getBalance() + depo;

    }



    public void withdraw(double wid) {
        double sum = getBalance() - wid;
    }
}
