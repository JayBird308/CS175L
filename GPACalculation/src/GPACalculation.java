import java.util.Scanner;
public class GPACalculation {
	
    static final double A = 4.00;
    static final double Aminus = 3.70;
    static final double Bplus = 3.33;
    static final double B = 3.00;
    static final double Bminus = 2.70;
    static final double Cplus = 2.30;
    static final double C = 2.00;
    static final double Cminus = 1.70;
    static final double Dplus = 1.30;
    static final double D = 1.00;
    static final double Dminus = 0.70;
    static final double F = 0.00;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qualityEarned = 0;
        double totalCredits = 0;
            



        String classInfo;
        for(int i=0;i<50;i++)
        {
            System.out.println("Enter your class grade information ('Course,credits,grade') or press Q to calculate and stop program: ");
            classInfo = scan.next();
            if (classInfo.equals("Q"))
            {
                break;
            }
            double gradePoints = 0;

            String [] input = classInfo.split(",");
            String course = input [0];
            String credits = input [1];
            String grade = input[2];
            switch(grade){
                case "A":
                    gradePoints = A;
                    break;
            }
            switch(grade) {
            	case "A-":
            		gradePoints = Aminus;
            		break;
            }
            switch(grade) {
            case "B+":
            	gradePoints = Bplus;
            	break;
            }
            switch(grade) {
            	case "B":
            		gradePoints = B;
            		break;
            }
            switch(grade) {
            	case "B-":
            		gradePoints = Bminus;
            		break;
            }
            switch(grade) {
            	case "C+":
            		gradePoints = Cplus;
            		break;
            }
            switch(grade) {
        	case "C":
        		gradePoints = C;
        		break;
            }
            switch(grade) {
        	case "C-":
        		gradePoints = Cminus;
        		break;
            }
            switch(grade) {
            	case "D+":
            		gradePoints = Dplus;
            		break;
            }
            switch(grade) {
            	case "D":
            		gradePoints = D;
            		break;
            }
            switch(grade) {
            	case"D-":
            		gradePoints = Dminus;
            		break;
            }
            switch(grade) {
            	case "F":
            		gradePoints = F;
            		break;
            }
            int creditsInt = Integer.parseInt(credits);
            qualityEarned+=gradePoints*creditsInt;


            totalCredits+=creditsInt;

            System.out.println(course + " " + credits + " " + grade);


        }
        System.out.println("Total Credits");
        System.out.println(totalCredits);


        double cumGpa = qualityEarned/totalCredits;
        System.out.println("Cumulative GPA:");
        System.out.println(cumGpa);

    }
}