import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Equation {

    static void iMode(){
        double a = iModeInput("a");
        double b = iModeInput("b");
        double c = iModeInput("c");
        coreLogic(a, b, c);
    }

    static double iModeInput(String coef) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;
        String tmp = null;
        double cf = 0;
        while (!success) {
            try {
                System.out.print(coef + "= ");
                tmp = sc.nextLine();
                cf = Double.parseDouble(tmp);
                if( coef.equals("a") && cf == 0)  throw new Exception();
                success = true;
            } catch (Exception e) {
                System.out.println("Error. Expected a valid real number, got " + tmp + " instead. Please try again");
            }
        }
        return cf;
    }

        static void coreLogic(double  a, double b, double c){
            System.out.printf("Equation is: (%s) x^2 + (%s) x + (%s) = 0\n",a, b, c);
            double D = b*b - 4*a*c;
            if (D > 0){
                double x1 = ((-1) * b - Math.sqrt(D)) / (2 * a);
                double x2 = ((-1) * b + Math.sqrt(D)) / (2 * a);
                System.out.printf("There are 2 roots:\n x1 = %s\n x2 = %s\n ", x1 ,x2);
            } else if (D < 0) {
                System.out.println("There are no roots");

            }else{
                double x = ((-1)*b)/(2*a);
                System.out.printf("There is one root: x = %s\n ", x);
            }
        }
    }

