import java.util.Scanner;

public class Test {
    public static void main(String[] args){
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
          task6();
          talkToMe();
    }

//    public static void task1(){
//        int phy = 75;
//        int che = 92;
//        int mat = 100;
//        int total = phy+che+mat;
//        System.out.println(total);
//    }
//

//    public static void task2(){
//        int phy = 80;
//        int che = 80;
//        int mat = 100;
//        int total = phy+che+mat;
//        float per = (total * 100) / 450f;
//        System.out.println("Marks obtained: " + per);
//
//    }

//    public static void task3()
//    {
//        String product = "7up";
//        int qty = 5;
//        float price = 1.25f;
//        float amount = qty * price;
//        System.out.println("Product :" + product + "\nQuantity: " + qty + "\nPrice: " + price + "\nAmount: " + amount);
//    }

//    public static void task4(){
//        int temp = 25;
//        if(temp>30) System.out.println("It is warm");
//        if(temp<30) System.out.println("It is cold");
//    }

//    public static void task5(){
//        int temp = 45;
//        if(temp>30){
//            System.out.println("It");
//            System.out.println("is");
//            System.out.println("warm");
//        }
//        if(temp<30){
//            System.out.println("It");
//            System.out.println("is");
//            System.out.println("cold");
//        }
//    }

    public static void task6(){
        String name = "Ashok";
        int salary = 20000;
        float tax;
        float netSalary = 0;
        if(salary > 2000){
            tax = salary * 0.21f;
            netSalary = salary - tax;

        }
        if(salary < 2000){
            tax = salary * 0.19f;
            netSalary = salary - tax;
        }
        System.out.println(name + " Net Salary: " + netSalary);
    }

    public static String marcoPoloValue = "";

    public static void  talkToMe(){
        System.out.println("Marco:");
        Scanner scanner = new Scanner(System.in);
        String reply = scanner.nextLine();
        if(reply.toString().toLowerCase().equals("polo")) {
            marcoPoloValue = "polo";
            while(marcoPoloValue.toLowerCase().equals(("polo"))){
                if(marcoPoloValue.toLowerCase().equals("polo")){
                    recursionQuestion();
                }
                else{
                    System.out.println("you were meant to say polo");
                }
            }
        }
        else if(!(marcoPoloValue.equals("polo"))){
            System.out.println("you were meant to say polo");
        }
    }

    public static void recursionQuestion(){
        System.out.println("Marco");
        Scanner scanner2 = new Scanner(System.in);
        String reply2 = scanner2.nextLine();
        if(reply2.toString().toLowerCase().equals("polo")) {
            marcoPoloValue = "polo";
        }
        else{
            marcoPoloValue = "Marco";
            if(!(marcoPoloValue.equals("polo"))){
                System.out.println("you were meant to say polo");
            }
        }

    }

}
