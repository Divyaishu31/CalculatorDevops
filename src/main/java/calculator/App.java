package calculator;
import java.util.*;
//line added
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//line added
public class App {
    //line added
    private static final Logger logger = LogManager.getLogger(App.class);

    //line added
    //
    public static void main(String args[]) {
        int n;
        //double num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("=========================================================================================");
        System.out.println("                                 Scientific Calculator                                   ");
        System.out.println("=========================================================================================");
        while (true) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Enter 1,for Square Root\nEnter 2,for Factorial\nEnter 3,for Log base e\nEnter 4,for Power Function\nEnter 5,for EXit");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            n = scan.nextInt();


            if (n == 1) {
                System.out.println("Enter number for Square Root:");

                double a = scan.nextDouble();
                double res = Sqeroot(a);
                System.out.println("The Square root of " + a + " is " + res);

            } else if (n == 2) {
                System.out.println("Enter number for Factorial:");

                Long b = scan.nextLong();
                double res = Fact(b);
                if (res > 0) {
                    System.out.println("The Factorial of " + b + " is " + res);
                }

            } else if (n == 3) {
                System.out.println("Enter number for Log:");

                double a = scan.nextDouble();
                double res = Loge(a);
                System.out.println("The Log of " + a + " is " + res);


            } else if (n == 4) {
                System.out.println("Enter first number :");

                double a = scan.nextDouble();
                System.out.println("Enter second number :");

                double b = scan.nextDouble();

                double res = Powe(a, b);
                System.out.println("Power of " + a + "and " + b + " is " + res);
            } else if (n == 5) {
                System.out.println("Ending the Program");
                logger.info("Entered 5 to exit.");
                return;

            } else {
                System.out.println("PLease Enter Valid Option");
            }
            /*
            break;
                default: System.out.println("Exiting, Bye");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);*/
        }

    }


    static double Sqeroot(double a) {

        double res = Math.sqrt(a);
        logger.info("Square root of " + a + " is " + res);

        return res;
    }

    static long Fact(long b) {

        //double res = Math.sqrt(a);
        long res = 1;
        if (b < 0) {
            System.out.println("Enter number >= 0");
            logger.info("Number entered for Square root is negative.");
            return -1;
        } else {
            for (long i = b; i > 0; i--) {
                res = res * i;
            }
            logger.info("Factorial of " + b + " is " + res);
            return res;
        }
    }


    static double Loge(double a) {

        if (a <= 0) {
            return Double.NEGATIVE_INFINITY;
        }

        double res = Math.log(a);
        logger.info("Log of " + a + "is" + res);

        return res;
    }

    static double Powe(double a, double b) {

        double res = Math.pow(a, b);
        logger.info("Power of " + a + "and " + b + " is " + res);

        return res;
    }
}
