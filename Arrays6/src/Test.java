import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter Students: ");
        int n = input.nextInt();

        Student std[] = new Student[n];

        for (int s = 0; s < std.length; s++) {
            System.out.println("Enter Student ID and Name");
            std[s] = new Student(input.nextInt(), inputString.nextLine());

            System.out.println("Enter Total Quiz Marks (1 to 4): ");
            std[s].totQuiz1 = input.nextDouble();
            std[s].totQuiz2 = input.nextDouble();
            std[s].totQuiz3 = input.nextDouble();
            std[s].totQuiz4 = input.nextDouble();

            System.out.println("Enter Obtained Quiz Marks (1 to 4): ");
            std[s].obtQuiz1 = input.nextDouble();
            std[s].obtQuiz2 = input.nextDouble();
            std[s].obtQuiz3 = input.nextDouble();
            std[s].obtQuiz4 = input.nextDouble();

            std[s].calculateQuizMarks();

            System.out.println("Enter Total Assignment Marks (1 to 4): ");
            std[s].totAsg1 = input.nextDouble();
            std[s].totAsg2 = input.nextDouble();
            std[s].totAsg3 = input.nextDouble();
            std[s].totAsg4 = input.nextDouble();

            System.out.println("Enter Obtained Assignment Marks (1 to 4): ");
            std[s].obtAsg1 = input.nextDouble();
            std[s].obtAsg2 = input.nextDouble();
            std[s].obtAsg3 = input.nextDouble();
            std[s].obtAsg4 = input.nextDouble();

            std[s].calculateAssignmentMarks();

            System.out.println("Enter Total MidTerm Marks");
            std[s].midTotal = input.nextDouble();
            System.out.println("Enter Obtained MidTerm Marks");
            std[s].midObt = input.nextDouble();

            std[s].calculateMidsMarks();

            System.out.println("Enter Total FinalTerm Marks");
            std[s].finalTotal = input.nextDouble();
            System.out.println("Enter Obtained FinalTerm Marks");
            std[s].finalObt = input.nextDouble();

            std[s].calculateFinalMarks();
            std[s].calculateTotalMarks();

            System.out.println("Total Marks for " + std[s].getStdName() + " is: " + std[s].totalMarks + "%");
            System.out.print("Student status: ");
            std[s].calculateResult();
        }
    }

}