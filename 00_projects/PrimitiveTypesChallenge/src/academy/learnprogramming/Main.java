package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByte = 53;
        short myShort = 28434;
        int myInt = 135_356_747;
        int sum = myByte + myShort + myInt;
        System.out.println("sum: " + sum);

        long calcLong = 50_000L + (sum * 10L);
        System.out.println("calcLong: " + calcLong);

        short shortTotal = (short) (1000 + 10 *
                (myByte + myShort + myInt ));
        System.out.println("shortTotal: " + shortTotal);
    }
}
