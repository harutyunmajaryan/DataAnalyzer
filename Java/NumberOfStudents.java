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
        //In this function I am going to create functions and get the number of students for each year, each course, each year and course and so on
        //This file still prints the sorted HashMap from StudentSorter file so I need to create the function!!!





    }
}
