package MainExercise1;

public class Exercise1 {

    void printOddUpTo(int x) {

        if (x > 0){
            for(int i = 0; i <= x; i++){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

    }

    String getABCUpTo(char y){

        StringBuilder Alpha = new StringBuilder(" ");
        char ch;
        char CH = 'A';
       if (Character.isAlphabetic(y)) {
         if (Character.isUpperCase(y)) {
             for (CH = 'A'; CH <= y; CH++) {
                 Alpha.append((char) (CH));
             }

             String mystring = Alpha.toString();
         } else {
             for (ch = 'a'; ch <= y; ch++) {
                Alpha.append((char) (ch));
             }
         }
       }

        return Alpha.toString();
    }
}
