public class getResult {

    private int phy, che, mat;
    private float total, per;
    private String name;

    public void results(int Phy, int Che, int Maths, String Name){
        int total = Phy + Che + Maths;
        int counter = 0;
        String courseRetakeName = "";
        if(checkIfPassed((Phy*100)/150)){

        }
        else{
            counter++;
            courseRetakeName = " Physics";
        }
        if(checkIfPassed((Che*100)/150)){

        }
        else{
            counter++;
            if(courseRetakeName != ""){
                courseRetakeName += " and Chemistry";
            }
            else{
                courseRetakeName += " Chemistry";
            }
        }
        if(checkIfPassed((Maths*100)/150)){

        }
        else{
            counter++;
            if(courseRetakeName != ""){
                courseRetakeName += " and Maths ";
            }
            else{
                courseRetakeName += " Maths";
            }
        }

        switch(counter){
            case 0:
                int percentage = (total*100)/450;
                System.out.println("Total For " + Name + ": " + total);
                System.out.println("Percentage For " + Name + ": " + percentage + "%");
                break;
            case 1:
                System.out.println("Retake exam on" + courseRetakeName);
                break;
            case 2:
                System.out.println("Repeat the course for" + courseRetakeName );
                break;
            case 3:
                System.out.println("go home, you failed " + courseRetakeName);
                break;
        }
    }

    public boolean checkIfPassed(int percentage){
        if(percentage >= 60){
            return true;
        }
        else{
            return false;
        }
    }

    public void inputGrade(int Phy, int Che, int Maths, String Name)
    {
        if(Phy >= 0 && Phy <= 150){
            phy = Phy;
            System.out.println("The marks " + Phy + " id valid for physics" );
        }
        else{
            System.out.println(Phy + " is an Invalid marks for physics, please make marks between 0 to 150");
        }
        if(Che >= 0 && Che <= 150){
            che = Che;
            System.out.println("The marks " + Che + " id valid for chemistry" );
        }
        else{
            System.out.println(Che + " is an Invalid marks for physics, please make marks between 0 to 150");
        }
        if(Maths >= 0 && Maths <= 150){
            mat = Maths;
            System.out.println("The marks " + Maths + " id valid for maths" );
        }
        else{
            System.out.println(Maths + " is an Invalid marks for physics, please make marks between 0 to 150");
        }

    }

    public void storDetails(int Phy, int Che, int Maths, String Name){
            phy = Phy;
            che = Che;
            mat = Maths;
            name = Name;
    }
}
