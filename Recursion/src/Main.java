public class Main {

    public static void main(String[] args) {

        //iterativeWalk(5);
        //recursionWalk(5);
        //System.out.println(factorial(7));
        System.out.println(power(2, 8));


    }

    private static int power(int base, int exponent) {

        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);



    }

    private static int factorial(int num) {

        if (num < 1) return 1;
        return num * factorial(num - 1);

    }

    private static void iterativeWalk(int steps) {
        for(int i = 0; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }

    private static void recursionWalk(int steps) {
        if (steps < 1) return; // base case
        System.out.println("You take a step!");
        recursionWalk(steps - 1); // recursive case



    }

}
