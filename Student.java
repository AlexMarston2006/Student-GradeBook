/*
    I will practice academic and personal integrity and excellence of
character and expect the same from others.
*/
public class Student {
    
    // data members 
    private int data;
    private Student next;
    private String courseNumber;
    private int ID;
    private String firstName;
    private String lastName;
    private int[] examGrades;
    private double finalGrade;
    private char letterGrade;
    private static int numStudents;
    
    // constructors with data members
    public Student(int data, Student next, String courseNumber, int ID, String firstName, String lastName, int[] examGrades, double finalGrade, char letterGrade) {
        this.data = data;
        this.next = next;
        this.courseNumber = courseNumber;
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.examGrades = examGrades;
        this.finalGrade = finalGrade;
        this.letterGrade = letterGrade;
    }

    public Student(String courseNumber, int ID, String firstName, String lastName, int[] examGrades, double finalGrade, char letterGrade) {
        this.courseNumber = courseNumber;
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.examGrades = examGrades;
        this.finalGrade = finalGrade;
        this.letterGrade = letterGrade;
    }
    
    
    // access, set coursenumber 
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    // access, set ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    // access, set first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // access, set last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // access, set exam grades
    public int[] getExamGrades() {
        return examGrades;
    }

    public void setExamGrades(int[] examGrades) {
        this.examGrades = examGrades;
    }
    
    // access, set final grade
    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    // access, set letter grade
    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
    
    // access, set number of students
    public static int getNumStudents() {
        return numStudents;
    }

    public static void setNumStudents(int numStudents) {
        Student.numStudents = numStudents;
    }
    
    
    // constructors
    public Student() {
        data = 0;
        next = null;
    }

    public Student(int data) {
        this.data = data;
        next = null;
    }

    public Student(int data, Student next) {
        this.data = data;
        this.next = next;
    }

    // ACCESSORS
    public int getData() {
        return data;
    }

    public Student getNext() {
        return next;
    }

    // MUTATORS
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Student next) {
        this.next = next;
    }
}
