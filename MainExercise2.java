package MainExercise2;

public class MainExercise2 {

    public static void main(String[] args) {

        Checking checkAcc = new Checking("Winston", 1234);
        System.out.println("Checking Account number: "+ checkAcc.getNumber() + "\nChecking Account Holder: "+ checkAcc.getName());
        System.out.println("Checking Account balance: "+ checkAcc.getBalance()+ "\nChecking Account balance: "+(checkAcc.balance = 152.15));


    }


}
