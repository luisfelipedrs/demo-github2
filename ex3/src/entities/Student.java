package entities;

public class Student {

    public String name;
    public double p1;
    public double p2;
    public double p3;

    public String finalGrade(){
        if((p1 + p2 + p3) > 60){
            return String.format("%s%.2f%n%s", "FINAL GRADE = ", (p1 + p2 + p3), "PASS");
        }
        return String.format("%s%.2f%n", "FINAL GRADE = ", (p1 + p2 + p3))
                + "FAILED"
                + String.format("%n%s%.2f%s", "MISSING ", 60 - (p1 + p2 + p3), " POINTS");
    }
}
