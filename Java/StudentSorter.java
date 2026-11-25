import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class StudentSorter {
    // list for years by subject
    // Gonna use HashMap to reduce the work and time + its easier to use for this case
    public static Map<String, List<Student>> map = new HashMap<>();

    public static void sortStudentsByYears(List<Student> students, List<Subject> subjects) {
        map.clear();
        String courseName;
        int year;
        
        for (Student student : students) {

            String courseKey = null;
            courseName = student.getCourseName();
            year = student.getCourseYear();

            if (courseName.equalsIgnoreCase("Math") && year == 1) {
                courseKey = "math1";
            } else if (courseName.equalsIgnoreCase("Math") && year == 2) {
                courseKey = "math2";
            } else if (courseName.equalsIgnoreCase("Math") && year == 3) {
                courseKey = "math3";
            } else if (courseName.equalsIgnoreCase("Computer Science") && year == 1) {
                courseKey = "cs1";
            } else if (courseName.equalsIgnoreCase("Computer Science") && year == 2) {
                courseKey = "cs2";
            } else if (courseName.equalsIgnoreCase("Computer Science") && year == 3) {
                courseKey = "cs3";
            } else if (courseName.equalsIgnoreCase("Physics") && year == 1) {
                courseKey = "phy1";
            } else if (courseName.equalsIgnoreCase("Physics") && year == 2) {
                courseKey = "phy2";
            } else if (courseName.equalsIgnoreCase("Physics") && year == 3) {
                courseKey = "phy3";
            } else if (courseName.equalsIgnoreCase("Architecture") && year == 1) {
                courseKey = "arch1";
            } else if (courseName.equalsIgnoreCase("Architecture") && year == 2) {
                courseKey = "arch2";
            } else if (courseName.equalsIgnoreCase("Architecture") && year == 3) {
                courseKey = "arch3";
            } else if (courseName.equalsIgnoreCase("Economics") && year == 1) {
                courseKey = "econ1";
            } else if (courseName.equalsIgnoreCase("Economics") && year == 2) {
                courseKey = "econ2";
            } else if (courseName.equalsIgnoreCase("Economics") && year == 3) {
                courseKey = "econ3";
            } else if (courseName.equalsIgnoreCase("Business") && year == 1) {
                courseKey = "bsn1";
            } else if (courseName.equalsIgnoreCase("Business") && year == 2) {
                courseKey = "bsn2";
            } else if (courseName.equalsIgnoreCase("Business") && year == 3) {
                courseKey = "bsn3";
            } else if (courseName.equalsIgnoreCase("Fine Arts") && year == 1) {
                courseKey = "fa1";
            } else if (courseName.equalsIgnoreCase("Fine Arts") && year == 2) {
                courseKey = "fa2";
            } else if (courseName.equalsIgnoreCase("Fine Arts") && year == 3) {
                courseKey = "fa3";
            } else if (courseName.equalsIgnoreCase("History") && year == 1) {
                courseKey = "hist1";
            } else if (courseName.equalsIgnoreCase("History") && year == 2) {
                courseKey = "hist2";
            } else if (courseName.equalsIgnoreCase("History") && year == 3) {
                courseKey = "hist3";
            } else if (courseName.equalsIgnoreCase("Electrical and Electronic Engineering") && year == 1) {
                courseKey = "eee1";
            } else if (courseName.equalsIgnoreCase("Electrical and Electronic Engineering") && year == 2) {
                courseKey = "eee2";
            } else if (courseName.equalsIgnoreCase("Electrical and Electronic Engineering") && year == 3) {
                courseKey = "eee3";
            } else if (courseName.equalsIgnoreCase("Mechanical Engineering") && year == 1) {
                courseKey = "me1";
            } else if (courseName.equalsIgnoreCase("Mechanical Engineering") && year == 2) {
                courseKey = "me2";
            } else if (courseName.equalsIgnoreCase("Mechanical Engineering") && year == 3) {
                courseKey = "me3";
            }

            if (courseKey != null) {
                if (!map.containsKey(courseKey)) {
                    map.put(courseKey, new ArrayList<>());
                }
                map.get(courseKey).add(student);
            }
        }
        
        List<String> availableKeys = List.of("math1","math2","math3",
                                             "cs1", "cs2", "cs3",
                                             "phy1", "phy2","phy3",
                                             "arch1","arch2","arch3",
                                             "econ1","econ2","econ3",
                                             "bsn1","bsn2","bsn3",
                                             "fa1","fa2","fa3",
                                             "hist1","hist2","hist3",
                                             "eee1","eee2","eee3",
                                             "me1","me2","me3");


        List<String> keysToRemove = new ArrayList<>();
        //creating an empty array of keys that needs ot be removed if it doesnt match the available keys

        for(String key : map.keySet())
            if(availableKeys.contains(key)){
                continue;
            }else if(!availableKeys.contains(key)){
                keysToRemove.add(key);
            }
        
        for (String key : keysToRemove){
            map.remove(key);
        }
        System.out.print(map);
    }

    public static void main(String[] args){
    //this part is to import the data from Main
        Main.loadData();
        List<Student> students = Main.allStudents;
        List<Subject> subjects = Main.allSubjects;     
        sortStudentsByYears(students, subjects);
    }        
}    

