package lambda;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable ex) {
        ex.execute();
    }
}

class ExecuteImpl implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello ver_1");
    }
}

public class LambdaTest_1 {

    public static void main(String[] args) {
//        ver_1
       Runner runner = new Runner();
       runner.run(new ExecuteImpl());
//       ver_2
              runner.run(new Executable() {
                  @Override
                  public void execute() {
                      System.out.println("Hello ver_2");
                  }
              });

//              ver_3
        runner.run(() -> System.out.println("hello ver_3"));
    }
}
