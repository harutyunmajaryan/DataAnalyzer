import java.util.ArrayList;
import java.util.List;

class Subject {
    private final String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student {
    private final String studentName;
    private final String studentSurname;
    private final String courseName;
    private final int courseYear;
    private final int id;

    public Student(String studentName, String studentSurname, String courseName, int courseYear, int id) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.courseName = courseName;
        this.courseYear = courseYear;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Student Name: " + studentName + "\n"
                + "Student Surname: " + studentSurname + "\n"
                + "Course Name: " + courseName + "\n"
                + "Course Year: " + courseYear + "\n";
    }
}

public class Main {
    public static List<Subject> allSubjects = new ArrayList<>();
    public static List<Student> allStudents = new ArrayList<>();

    public static void loadData() {
        allSubjects.clear();
        allStudents.clear();

        allSubjects.add(new Subject("Math"));
        allSubjects.add(new Subject("Computer Science"));
        allSubjects.add(new Subject("Physics"));
        allSubjects.add(new Subject("Architecture"));
        allSubjects.add(new Subject("Economics"));
        allSubjects.add(new Subject("Business"));
        allSubjects.add(new Subject("Fine Arts"));
        allSubjects.add(new Subject("History"));
        allSubjects.add(new Subject("Electrical and Electronic Engineering"));
        allSubjects.add(new Subject("Mechanical Engineering"));

        allStudents.add(new Student("Harutyun", "Majaryan", "Computer Science", 2, 14902312));
        allStudents.add(new Student("Mark", "Belikyan", "Computer Science", 2, 14902231));
        allStudents.add(new Student("Charlie", "Soriso", "Computer Science", 2, 14902211));
        allStudents.add(new Student("Elena", "Petrova", "Math", 2, 14902313));
        allStudents.add(new Student("Liam", "OConnor", "Physics", 1, 14902314));
        allStudents.add(new Student("Sofia", "Rossi", "Architecture", 3, 14902315));
        allStudents.add(new Student("Noah", "Kowalski", "Economics", 2, 14902316));
        allStudents.add(new Student("Maya", "Patel", "Business", 1, 14902317));
        allStudents.add(new Student("Lucas", "Silva", "Fine Arts", 2, 14902318));
        allStudents.add(new Student("Chloe", "Dubois", "History", 3, 14902319));
        allStudents.add(new Student("Ethan", "Bennett", "Electrical and Electronic Engineering", 2, 14902320));
        allStudents.add(new Student("Amara", "Okafor", "Mechanical Engineering", 2, 14902321));
        allStudents.add(new Student("Mateo", "Gomez", "Math", 1, 14902322));
        allStudents.add(new Student("Hannah", "Lindqvist", "Computer Science", 3, 14902323));
        allStudents.add(new Student("Zain", "AlMansoor", "Physics", 2, 14902324));
        allStudents.add(new Student("Freya", "Andersen", "Architecture", 1, 14902325));
        allStudents.add(new Student("Oliver", "Hughes", "Economics", 3, 14902326));
        allStudents.add(new Student("Nadia", "Khoury", "Business", 2, 14902327));
        allStudents.add(new Student("Daniel", "Novak", "Fine Arts", 1, 14902328));
        allStudents.add(new Student("Aria", "Chen", "History", 2, 14902329));
        allStudents.add(new Student("Samuel", "Mensah", "Electrical and Electronic Engineering", 3, 14902330));
        allStudents.add(new Student("Zoe", "Papadopoulos", "Mechanical Engineering", 1, 14902331));
        allStudents.add(new Student("Isaac", "Cohen", "Math", 3, 14902332));
        allStudents.add(new Student("Mila", "Horvat", "Computer Science", 1, 14902333));
        allStudents.add(new Student("Caleb", "Stewart", "Physics", 3, 14902334));
        allStudents.add(new Student("Leila", "Haddad", "Architecture", 2, 14902335));
        allStudents.add(new Student("Owen", "Murphy", "Economics", 1, 14902336));
        allStudents.add(new Student("Tessa", "VanDerBerg", "Business", 3, 14902337));
        allStudents.add(new Student("Tariq", "Farooq", "Fine Arts", 3, 14902338));
        allStudents.add(new Student("Grace", "McAllister", "History", 1, 14902339));
        allStudents.add(new Student("Julian", "Reyes", "Electrical and Electronic Engineering", 1, 14902340));
        allStudents.add(new Student("Ananya", "Nair", "Mechanical Engineering", 3, 14902341));
        allStudents.add(new Student("Finn", "Gallagher", "Math", 2, 14902342));
        allStudents.add(new Student("Clara", "Becker", "Computer Science", 2, 14902343));
        allStudents.add(new Student("Gabriel", "Costa", "Physics", 2, 14902344));
        allStudents.add(new Student("Sienna", "Clarke", "Architecture", 3, 14902345));
        allStudents.add(new Student("Yusuf", "Demir", "Economics", 2, 14902346));
        allStudents.add(new Student("Ruby", "Fraser", "Business", 2, 14902347));
        allStudents.add(new Student("Adrian", "Molina", "Fine Arts", 2, 14902348));
        allStudents.add(new Student("Eva", "Kral", "History", 2, 14902349));
    }

    public static void main(String[] args) {
        loadData();
    }
}