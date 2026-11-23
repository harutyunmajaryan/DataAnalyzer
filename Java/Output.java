import java.util.Scanner;

public class Output{
    public static void main(String[] args){
        Main.loadData();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which data do you want to see? (student/subject): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("student")){
            for (Student student : Main.allStudents){
                System.out.print(student + "\n");
            }
        }else if(choice.equalsIgnoreCase("subject")){
            for (Subject subject : Main.allSubjects){
                System.out.print(subject + "\n");
            }
        }
        scanner.close();
    }
}