import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) Equation.iMode(); else Equation.fMode(args);

    }
}