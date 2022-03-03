package homework_8;

import java.util.Random;
import java.util.Scanner;


public class Test {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void eligibleToVote() {

        System.out.println("input age :");
        int age = scanner.nextInt();
        if (age >= 18) System.out.println("Person is eligible to vote");
        else if (age >= 0) System.out.println("Person is not eligible to vote");
        else System.err.println("ERROR");
    }

    public static void isEven() {
        System.out.println("input number :");
        int num = scanner.nextInt();
        if (num % 2 == 0 && num > 0) System.out.println("Number is even");
        else System.out.println("Number is not even");

    }

    public static void printRandom() {
        System.out.println("input number :");

        Random random = new Random();
        int low = 2;
        int high = 7;
        int result = (int) (Math.random() * ((high - low)) + low + 1);
        System.out.println(" Random 2 to 7 : " + result);
    }

    public static void multiple5() {
        int n = scanner.nextInt();
        if (n % 5 == 0) System.out.print("Number is multiple of 5");
        else System.out.print("Number is not multiple of 5");
    }

    public static void printAbs() {
        String sign = "Zero";
        String abs = "";
        System.out.println("input number :");
        double n = scanner.nextDouble();
        if (n > 0) {
            sign = "Positive";
        } else if (n < 0) {
            sign = "Negative";
        }

        if (Math.abs(n) > 1000000) {
            abs = "large";
        } else if (Math.abs(n) < 1 && Math.abs(n) != 0) {
            abs = "small";
        }


        System.out.println(sign + " " + abs);
    }

    public static void iceCream() {
        System.out.print("input number :");
        int n = scanner.nextInt();
        if (n == 0 || n == 1 || n == 2 || n == 4 || n == 7) {
            System.out.print("No");
        } else {
            System.out.println("Yes");
            int count = 0;
            int res = n;
            while (res % 3 != 0) {
                res -= 5;
                count++;
            }
            System.out.println(n + " = " + count + " * 5 + " + res / 3 + " * 3");

        }
    }

    public static void greatestNumber() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c >= a && c >= b) {
            System.out.println("greatest number " + c);
        } else if (b >= a) {
            System.out.println("greatest number " + b);
        } else {
            System.out.println("greatest number " + a);
        }
    }

    public static void weekday() {
        int n = scanner.nextInt();
        if (n > 0 && n < 8) {
            if (n == 1) {
                System.out.println("Sunday");
            }
            if (n == 2) {
                System.out.println("Monday");
            }
            if (n == 3) {
                System.out.println("Tuesday");
            }
            if (n == 4) {
                System.out.println("Wednesday");
            }
            if (n == 5) {
                System.out.println("Thursday");
            }
            if (n == 6) {
                System.out.println("Friday");
            }
            if (n == 7) {
                System.out.println("Saturday");
            }
        } else {
            System.err.println("ERROR");
        }
    }

    public static void leapYear() {
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else System.out.println("Not a Leap Year");
            } else System.out.println("Leap Year");
        } else System.out.println("Not a Leap Year");
    }

    public static void randomFilter() {

        Random random = new Random();
        int low = -10000;
        int high = 10000;
        int result = (int) (Math.random() * ((high - low)) + low + 1);
        System.out.println(result);
        System.out.println((result > -10000 && result < 10000) && (result % 3 == 0 || result % 5 == 0));
    }

    public static void multipleOf7() {
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        if ((a > 0 && b > 0) && (a % 7 == 0 || b % 7 == 0)) {
            if (a > b) {
                if (b % 2 == 0) {
                    for (int i = b + 1; i <= a; i += 2) {
                        System.out.print(i + " ");
                    }
                } else for (int i = b; i <= a; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                if (a % 2 == 0) {
                    for (int i = a; i <= b; i += 2) {
                        System.out.print(i + " ");
                    }
                } else for (int i = a + 1; i <= b; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean quarterOfPoint(int x1, int y1, int x2, int y2) {

        if (x1 == 0 || y1 == 0 || x2 == 0 || y2 == 0) {
            System.out.println("Not in the same quarter");
            return true;
        } else if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0) {
            System.out.println("1 quarter");
            return true;
        } else if (x1 < 0 && y1 > 0 && x2 < 0 && y2 > 0) {
            System.out.println("2 quarter");
            return true;
        } else if (x1 < 0 && y1 < 0 && x2 < 0 && y2 < 0) {
            System.out.println("3 quarter");
            return true;
        } else if (x1 > 0 && y1 < 0 && x2 > 0 && y2 < 0) {
            System.out.println("4 quarter");
            return true;
        } else return false;
    }

    public static void degenerateTriangle() {
        System.out.println("Input a side");
        int a = scanner.nextInt();
        System.out.println("Input b side");
        int b = scanner.nextInt();
        System.out.println("Input c side");
        int c = scanner.nextInt();
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("triangle is degenerate");
        } else {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("triangle is not degenerate");
            } else {
                System.out.println("triangle is degenerate");
            }
        }


    }

    public static void equalsNumbers() {
        System.out.println("Input number 1");
        int num1 = scanner.nextInt();
        System.out.println("Input number 2");
        int num2 = scanner.nextInt();
        System.out.println("Input number 3");
        int num3 = scanner.nextInt();
        if ((num1 == num2 && num1 != num3) || (num1 == num3 && num1 != num2) || (num2 == num3 && num1 != num3)) {
            System.out.println(2);
        } else if (num1 == num2) {
            System.out.println(3);
        } else {
            System.out.println("Numbers is not equals ");
        }
    }

    public static void quadraticEquation() {
        System.out.println("Input a ");
        double a = scanner.nextDouble();
        System.out.println("Input b ");
        double b = scanner.nextDouble();
        System.out.println("Input c ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Not quadratic equation");
        } else {
            double D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("quadratic equation has no real solution");
            } else if (D == 0) {
                double x = -b / 2 * a;
                System.out.println("quadratic equation has 1 real solution x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("quadratic equation has 2 real solution x1 = " + x1 + " x2 = " + x2);
            }
        }

    }

    public static void nonDecreasingOrder() {
        System.out.println("Input number 1");
        int a = scanner.nextInt();
        System.out.println("Input number 2");
        int b = scanner.nextInt();
        System.out.println("Input number 3");
        int c = scanner.nextInt();

//        if (num1 <= num2 && num2 <= num3 ) System.out.println(num1 + "\n" + num2 + "\n" + num3);
//        if (num1 <=  num3 && num3 <= num2 ) System.out.println(num1 + "\n" + num3 + "\n" + num2);
//        if (num2 <= num1 && num1 <= num3 ) System.out.println(num2 + "\n" + num1 + "\n" + num3);
//        if (num2 <= num3 && num3 <= num1 ) System.out.println(num2 + "\n" + num3 + "\n" + num1);
//        if (num3 <= num1 && num1 <= num2 ) System.out.println(num3 + "\n" + num1 + "\n" + num2);
//        if (num3 <= num2 && num2 <= num1 ) System.out.println(num3 + "\n" + num2 + "\n" + num1);

        if (a <= b) {
            if (b <= c) {
                System.out.println(a + "\n" + b + "\n" + c);
            } else {
                if (a > c) {
                    System.out.println(c + "\n" + a + "\n" + b);
                } else {
                    System.out.println(a + "\n" + c + "\n" + b);
                }
            }
        } else {
            if (a <= c) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else {
                if (b > c) {
                    System.out.println(c + "\n" + b + "\n" + a);
                } else {
                    System.out.println(b + "\n" + c + "\n" + a);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //eligibleToVote();
//        isEven();
//        printRandom();
//        multiple5();
//        greatestNumber();
//        iceCream();
//        printAbs();
//        weekday();
//        leapYear();
//        randomFilter();
        //       multipleOf7();

//        System.out.println("Input x1");
//        int x1 = scanner.nextInt();
//        System.out.println("Input y1");
//        int y1 = scanner.nextInt();
//        System.out.println("Input x2");
//        int x2 = scanner.nextInt();
//        System.out.println("Input y2");
//        int y2 = scanner.nextInt();
//
//
//        boolean bool = quarterOfPoint(x1, y1, x2, y2);
//        System.out.println(bool);
//        degenerateTriangle();
//        equalsNumbers();
 //       quadraticEquation();
        // nonDecreasingOrder();
    }
}
