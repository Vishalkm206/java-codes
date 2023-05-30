import java.util.Scanner;

public class marks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[3];
        double totalMarks = 0.0;
        double percentage = 0.0;
        
        try {
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                marks[i] = input.nextInt();
                if (marks[i] > 100) {
                    throw new Exception("Marks cannot be more than 100");
                }
                totalMarks += marks[i];
            }
            percentage = (totalMarks / (marks.length * 100)) * 100;
            System.out.println("Percentage: " + percentage + "%");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
