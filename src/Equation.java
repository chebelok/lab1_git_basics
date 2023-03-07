import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Equation {

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

