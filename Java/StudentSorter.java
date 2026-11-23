import java.util.List;
import java.util.ArrayList;


public class StudentSorter{
    public static List<Student> firstYearStudents = new ArrayList<>();
    public static List<Student> secondYearStudents = new ArrayList<>();
    public static List<Student> thirdYearStudents = new ArrayList<>();

    public static void SortStudentsByYears(List<Student> students){
        firstYearStudents.clear();
        secondYearStudents.clear();
        thirdYearStudents.clear();

        for (Student std : students){
            if(std.getCourseYear() == 1){
                firstYearStudents.add(std);
            }else if(std.getCourseYear() == 2){
                secondYearStudents.add(std);
            }else if(std.getCourseYear() == 3){
                thirdYearStudents.add(std);
            }else{
                System.out.println("Something went wrong!");
            }
        }
    }

    public static void main(String[] args){
    //this part is to import the data from Main
        Main.loadData();
        List<Student> students = Main.allStudents;
        List<Subject> subjects = Main.allSubjects;
    ////////////////////////////////////////////    
        
        SortStudentsByYears(students);
        System.out.println("First years: " + "\n");
        for(Student student : firstYearStudents){
            System.out.print(student + "\n");
        }
        System.out.println("-----------------------");
        
        System.out.println("Second years: " + "\n");
        for(Student student : secondYearStudents){
            System.out.print(student + "\n");
        }
        System.out.println("-----------------------");

        System.out.println("Third years: " + "\n");
        for(Student student : thirdYearStudents){
            System.out.print(student + "\n");
        }
        System.out.println("-----------------------");
    }        
}    

