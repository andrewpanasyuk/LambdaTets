package lambda;

interface Executable1 {
    int execute(int a);
}

interface Executable2 {
    double execute(double a, double c);
}

class Runner1 {
    private int c;
    private double d1;
    private double d2;

    public int run(Executable1 ex) {
        return ex.execute(c);
    }

    public double runDouble(Executable2 ex) {
        return ex.execute(d1, d2);
    }
}

public class LambdaTest_2 {
    public static void main(String[] args) {
        int vel = 500;
        Runner1 runner = new Runner1();


        int b = runner.run(new Executable1() {
            @Override
            public int execute(int x) {
                return x + 5;
            }
        });
        System.out.println("b = " + b);

        int a = runner.run((y) -> 2 + 1);
        int aa = runner.run(y -> y + 1);
        System.out.println("a = " + a);
        System.out.println("aa = " + aa);

        final double xx = 555.55;
        double yy = 666.66;
        double d = runner.runDouble((x, y) -> xx + yy);
        System.out.println("d = " + d);


    }
}
