public class Day3 {

    public static void main(String[] args) {
//        task1();
//        task2();
        test();
    }

    // foor loop doing multiple of 2
    public static void task1(){
        System.out.println("Times table of: 2");
        System.out.println("-----------------");
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "x 2 = " + i * 2);
        }
    }

    // FOR LOOP OF MULTIPLES
    public static void task2(){
        for(int i = 1; i <= 20; i++){
            Mutiply(i);
        }


    }
    // for loop to mutiply task 3
    public static void Mutiply(int mutiplyBy){
        System.out.println("");
        System.out.println("Times table of: " + mutiplyBy);
        System.out.println("-----------------");
        for(int a = 1; a <= 10; a++){
            System.out.println(a + " x " + mutiplyBy + " = " +  a * mutiplyBy);
        }
    }

    public static void test(){
        int i = 1;
        switch(i){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("This is not a valid month");
        }
    }
}
