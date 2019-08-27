package chap3;


public class Student {
    private String studentId;
    private String studentName;
    private String faculty;
    private String major;
    
    //default constructor
    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
        
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String faculty) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
    }

    public Student(String studentId, String studentName, String faculty, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }
    public static void main(String[] args) {
        //instatic object 5 objs s1 s2 s3 s4 s5
        Student s1 = new Student();
        showAtribute(s1);
        System.out.println("----------------------");
        Student s2 = new Student("2608");
        showAtribute(s2);
        Student s3 = new Student("2587","Beck");
        showAtribute(s3);
        Student s4 = new Student("2588","jack","vo");
        showAtribute(s4);
        Student s5 = new Student("2589","frank","sci","it");
        showAtribute(s5);
    }

    private static void showAtribute(Student s1) {
        System.out.println("Id :"+s1.studentId);
        System.out.println("Name :"+s1.studentName);
        System.out.println("fculty :"+s1.faculty);
        System.out.println("Major :"+s1.major);
    }
    
}//end class
