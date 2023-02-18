package Entities;

public class Student {
    public String name;
    public double p1;
    public double p2;
    public double p3;

    public double finalGrade = p1+p2+p3;


    public String toString(){
        if (finalGrade>=60){
            return String.format("%.2f",(finalGrade))+"\nPASS";
        } else{
            return String.format("%.2f",(finalGrade))+"\nFAILED\nMISSING "+String.format("%.2f",(60-finalGrade))+" POINTS";
        }

    }

}
