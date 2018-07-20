import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        getResult results = new getResult();
//        results.results(170,170, 170, "Ashok");
//        results.results(60,60, 60, "Lauren");
//        results.inputGrade(155, 55, 55, "Ashok");
        enterMarks();
    }

    public static void enterMarks(){
        getResult results = new getResult();
        System.out.println("Please enter the marks of the student");
        System.out.println("Student Name :");
        Scanner nameScanner = new Scanner(System.in);
        String sName = nameScanner.nextLine();
        System.out.println("Physics Mark :");
        Scanner phyScanner = new Scanner(System.in);
        int Pmark = Integer.parseInt(phyScanner.nextLine());
        Pmark = checkMarksAndUpdate(Pmark);
        System.out.println("Chemistry Mark :");
        Scanner cheScanner = new Scanner(System.in);
        int Cmark = Integer.parseInt(cheScanner.nextLine());
        Cmark = checkMarksAndUpdate(Cmark);
        System.out.println("Maths Mark :");
        Scanner matScanner = new Scanner(System.in);
        int Mmark = Integer.parseInt(matScanner.nextLine());
        Mmark = checkMarksAndUpdate(Mmark);
        // If i wanna store but CBA
        //results.storDetails(Pmark, Cmark, Mmark,  sName);
        results.results(Pmark, Cmark, Mmark,  sName);
    }

    public static int checkMarksAndUpdate(int marks){
        while(!(marks >= 0 && marks <= 150)){
            System.out.println("Mark is invalid please enter again: ");
            Scanner markScanner = new Scanner(System.in);
            int MarkMark = Integer.parseInt(markScanner.nextLine());
            if(MarkMark >= 0 && MarkMark <= 150){
                return MarkMark;
            }
        }
        return marks;
    }

}
