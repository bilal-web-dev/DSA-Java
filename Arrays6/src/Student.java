public class Student {

    private int stdId;
    private String stdName;

    public double totQuiz1;
    public double totQuiz2;
    public double totQuiz3;
    public double totQuiz4;
    public double totAsg1;
    public double totAsg2;
    public double totAsg3;
    public double totAsg4;
    public double obtQuiz1;
    public double obtQuiz2;
    public double obtQuiz3;
    public double obtQuiz4;
    public double obtAsg1, obtAsg2, obtAsg3, obtAsg4;
    public double midTotal;
    public double midObt;
    public double finalTotal;
    public double finalObt;
    public double avgQuiz, avgAsg, avgMid, avgFinal;
    public double totalMarks;

    // Functions

    public double calculateAssignmentMarks() {
        return avgAsg = ((obtAsg1 + obtAsg2 + obtAsg3 + obtAsg4) / (totAsg1 + totAsg2 + totAsg3 + totAsg4)) * 10;
    }

    public double calculateQuizMarks() {
        return avgQuiz = ((obtQuiz1 + obtQuiz2 + obtQuiz3 + obtQuiz4) / (totQuiz1 + totQuiz2 + totQuiz3 + totQuiz4))
                * 15;
    }

    public double calculateMidsMarks() {
        return avgMid = ((midObt) / (midTotal)) * 25;
    }

    public double calculateTotalMarks() {
        return totalMarks = ((avgQuiz) + (avgMid) + (avgAsg) + (avgFinal));
    }

    public double calculateFinalMarks() {
        return avgFinal = ((finalObt) / (finalTotal)) * 50;
    }

    public void calculateResult() {
        if (totalMarks >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    // Getter Setter
    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    // Constructor
    public Student(int stdId, String stdName) {
        setStdId(stdId);
        setStdName(stdName);

    }

}
