import java.text.DecimalFormat;

public class Day2 {
    public static void main(String[] args) {
//        task1();
//        task3();
//        task4();
        //task5();
//        test();
//        task7();
//        task8();
//        task9();
//        task10();
        task11();
    }
//
//    public static void task1(){
//        float salary = 2000.55f;
//        float tax = 0;
//        if(salary < 1000) tax = salary * 0.5f;
//        if(salary >= 1000 && salary < 2000) tax = salary * 0.15f;
//        if(salary >= 2000 && salary < 3000) tax = salary * 0.17f;
//        if(salary >= 3000 && salary < 4000) tax = salary * 0.21f;
//        if(salary >= 4000) tax = salary * 0.25f;
//        float net = salary - tax;
//        System.out.println("The net value after tax is: " + net);
//    }
//
//    // splitting numbers
//    public static void task3() {
//        int x = 55;
//        x = x/10 + x%10;
//        System.out.println(x);
//    }
//
//    // splitting numbers
//    public static void task4() {
//        int x = 556;
//        x = x/100 + ((x%100) / 10) + (x % 10);
//        System.out.println(x);
//    }

    // recipet calculator
    public static void task5(){
        int bill = 20;
        int paid = 150;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        int currentValue = 0;
        if(paid > bill){
            int repay = Math.abs(bill - paid);
            if(repay > 50){
                fifty = repay / 50;
                System.out.println(50 + " = " + fifty);
                repay = repay - (50 * fifty);
                if(repay >= 20){
                    twenty = repay / 20;
                    System.out.println(20 + " = " + twenty);
                    repay = repay - (20 * twenty);
                }
                if(repay >= 10){
                    ten = repay / 10;
                    System.out.println(10 + " = " + ten);
                    repay = repay - (10 * ten);
                }
                if(repay >= 5){
                    five = repay / 5;
                    System.out.println(5 + " = " + five);
                    repay = repay - (5 * five);
                }
                if(repay >= 2){
                    two = repay / 2;
                    System.out.println(2 + " = " + two);
                    repay = repay - (2 * two);
                }
                if(repay >= 1){
                    one = repay / 1;
                    System.out.println(1 + " = " + one);
                    repay = repay - (1 * one);
                }
            }
            else{
                System.out.println(50 + " = " + "fifty");
            }
        }
    }

    public static void task7(){
        int x = 1;
        if(x > 10){
            System.out.println("A");
            if(x>20){
                System.out.println("C");
            }
        }
        else{
            System.out.println("B");
        }
    }

    // recipet calculator 2 with pennies included
    public static void test(){
        float bill = 20.50f;
        float paid = 150.10f;
        float repay = Math.abs(bill - paid);
        System.out.println(repay);
        double x = repay - Math.floor(repay);
        long tmp = Math.round(x);
        System.out.println(tmp);
    }

    public static void task8(){
        int No = 562;
        if(No > 1000){
            System.out.println("A");
            if(No > 5000){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
            System.out.println("E");
            if(No < 2000){
                System.out.println("F");
                System.out.println("G");
            }
        }
        else{
            if(No<500){
                System.out.println("1");
                System.out.println("2");
            }
            if(No>200) {
                System.out.println("3");
                if(No>300){
                    System.out.println("4");
            }
            }
            else{
                System.out.println("5");
            }
        }
        System.out.println("6");
    }

    public static void task9(){
        int x = 0;
        // print 1 to 10
        while(x <= 10){
            x++;
            System.out.println("Hello World!");
        }

        // Mulitple of 2
        int y = 0;
        while(y < 10){
            System.out.println("2 X " + y + " = " + (y*2));
            y++;
        }

        int z = 0;
        while(z <= 100){
            if(z % 2 == 0){
                System.out.println(z);
            }
            z++;
        }
    }

    public static void task10() {
        int counter = 0;
        int count = 0;
        while (counter < 10) {
            String printCount = "";
            while (count <= counter) {
                count++;
                if(count == 1){
                    printCount += " " + count;
                }
                else{
                    printCount += ", " + count;
                }
            }
            count = 0;
            System.out.println(printCount + ".");
            counter++;
        }
    }

    public static void task11(){
        int counter = 0;
        int count = 9;
        while (count > 0) {
            counter = 0;
            String printCount = "";
            while(counter <= count){
                counter++;
                // not to self check if value is the same
                printCount += counter + " ,";
            }
            System.out.println(printCount + ".");
            count = count - 1;
        }
    }


}
