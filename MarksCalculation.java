public class MarksCalculation {
    static int sub1 = 85;
    static int sub2 = 90;
    static int sub3 = 80;
    public static int totalMarks(){
        int total = sub1+sub2+sub3;
        System.out.println("Total Marks : " + total);
        return total;    
    }
    public static double  averageMarks(){
        double avg = totalMarks();
        System.out.println("Average Marks :" + avg/3);
        return avg;
    }
    public static void main(String[] args) {
        totalMarks();
        averageMarks();
    }
    
}
