import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class NumberOfStudents{
    public static void main(String[] args){
        Main.loadData();
        List<Student> students = Main.allStudents;
        List<Subject> subjects = Main.allSubjects;
        Map<String, List<Student>> map = StudentSorter.sortStudentsByYears(students, subjects);
        System.out.print(map);





    }
}