/*
: I will practice academic and personal integrity and excellence of
character and expect the same from others.
Alexander Marston
1314670
Section CSC3280-002 
amarston@mocs.flsouthern.edu
Program 2
9/21/26

 */

import java.util.*;

public class Main {

    public static int ADDRECORD(int numStudents, FSCcourseRoster[] courses, String courseNumber, int studentID, String firstName, String lastName, int grade1, int grade2, int grade3) {
        // this method will add a student's record to desired course

        // used to determine if course is found 
        boolean courseFound = false;

        // set exam grades
        int examGrades[] = {grade1, grade2, grade3};
        // get final grade
        double finalGrade = (grade1 * (0.3)) + (grade2 * (0.3)) + (grade3 * (0.4));

        // get letter grade
        char letterGrade;
        if (finalGrade >= 90) {
            letterGrade = 'A';
        } else if (finalGrade >= 80) {
            letterGrade = 'B';
        } else if (finalGrade >= 70) {
            letterGrade = 'C';
        } else if (finalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // add all information to student object
        Student currentStudentAdded = new Student(courseNumber, studentID, firstName, lastName, examGrades, finalGrade, letterGrade);

        // add object to correct course roster
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getCourseNumber().equals(courseNumber)) {
                // we found the course, so let's add it
                courses[i].insert(currentStudentAdded);
                // print that the student has been added, and the students information
                System.out.printf("    %s %s (ID# %d) has been added to %s.\n", firstName, lastName, studentID, courseNumber);
                // print final grade and letter grade
                System.out.printf("    Final Grade: %.2f (%c).", finalGrade, letterGrade);
                // space lines out
                System.out.println();
                // update course found
                courseFound = true;
                // update num of students
                numStudents++;
                // stop looking for a course
                break;

            }

        }
        // if course does not exist
        if (!courseFound) {
            System.out.printf("     ERROR: cannot add student. Course \"%s\" does not exist.\n", courseNumber);

        }
        // space lines out
        System.out.println();
        // return num of students
        return numStudents;
    }

    public static void DELETERECORD(int studentId, FSCcourseRoster[] courses) {
        // this will delete a students record from a course
        // this uses their ID to find and delete their node
        
        // used to determine if record even exsists
        boolean recordFound = false;

        // loop over all courses and nodes in all courses
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].searchID(studentId)) {
                // get the desired student object
                Student student = courses[i].findNode(studentId);

                // get student first name
                String firstName = student.getFirstName();
                // get last name
                String lastName = student.getLastName();
                // get course number
                String courseNumber = student.getCourseNumber();

                // print the student was deleted from that course
                System.out.printf("    %s %s (ID# %d) has been deleted from %s.\n", firstName, lastName, studentId, courseNumber);
                // delete the student's node
                courses[i].delete(studentId);
                // we found the student
                recordFound = true;

            }
        }
        // if student does not exsist 
        if (!recordFound) {
            System.out.printf("    ERROR: cannot delete student. ID# %d does not exist.\n", studentId);
        }
        // space lines out
        System.out.println();
    }

    public static void SEARCHBYID(int studentID, FSCcourseRoster[] courses) {
        // this method will find the student's node using their ID

        // used to determine if record even exists
        boolean idFound = false;
        
        // loop over all courses
        for (int i = 0; i < courses.length; i++) {
            // check current course for student's ID as in they're in the course
            if (courses[i].searchID(studentID)) {
                // get the desired student object
                Student student = courses[i].findNode(studentID);

                // get student first name
                String firstName = student.getFirstName();
                // get last name
                String lastName = student.getLastName();
                // get course number
                String courseNumber = student.getCourseNumber();
                int[] examGrades = student.getExamGrades();
                // first exam grade
                int exam1Grade = examGrades[0];
                // second exam grade
                int exam2Grade = examGrades[1];
                // final exam grade
                int finalExamGrade = examGrades[2];
                // final grade
                double finalGrade = student.getFinalGrade();
                // letter grade
                char letterGrade = student.getLetterGrade();

                // print all of this information
                // print student name and id
                System.out.printf("Student Record for %s %s (ID# %d):\n", firstName, lastName, studentID);
                // print course number
                System.out.printf("    Course: %s\n", courseNumber);
                // print exam 1 grade
                System.out.printf("        Exam 1:       %d\n", exam1Grade);
                // print exam 2 grade
                System.out.printf("        Exam 2:       %d\n", exam2Grade);
                // print final exam grade
                System.out.printf("        Final Exam:   %d\n", finalExamGrade);
                // print final grade
                System.out.printf("        Final Grade:  %.2f\n", finalGrade);
                // print letter grade
                System.out.printf("        Letter Grade: %c\n", letterGrade);
                // space lines
                System.out.println();
                // update that we found the student
                idFound = true;
            }
        }
        // if id not found
        if (!idFound) {
            System.out.printf("     ERROR: there is no record for student ID# %d.\n", studentID);
            // space lines
            System.out.println();
        }
    }

    public static void SEARCHBYNAME(FSCcourseRoster[] courses, String firstName, String lastName) {
        // this method will find the student node based on their first and last name

        // used to determine if record exists
        boolean studentFound = false;
        // loop over all courses
        for (int i = 0; i < courses.length; i++) {

            // get the student object
            Student student = courses[i].findNodeByName(firstName, lastName);

            // check if student is not null
            if (!(student == null)) {
                // we found the student
                // get student ID
                int studentID = student.getID();
                // get course number
                String courseNumber = student.getCourseNumber();
                int[] examGrades = student.getExamGrades();
                // first exam grade
                int exam1Grade = examGrades[0];
                // second exam grade
                int exam2Grade = examGrades[1];
                // final exam grade
                int finalExamGrade = examGrades[2];
                // final grade
                double finalGrade = student.getFinalGrade();
                // letter grade
                char letterGrade = student.getLetterGrade();

                // print all of this information
                // print student name and id
                System.out.printf("Student Record for %s %s (ID# %d):\n", firstName, lastName, studentID);
                // print course number
                System.out.printf("    Course: %s\n", courseNumber);
                // print exam 1 grade
                System.out.printf("        Exam 1:       %d\n", exam1Grade);
                // print exam 2 grade
                System.out.printf("        Exam 2:       %d\n", exam2Grade);
                // print final exam grade
                System.out.printf("        Final Exam:   %d\n", finalExamGrade);
                // print final grade
                System.out.printf("        Final Grade:  %.2f\n", finalGrade);
                // print letter grade
                System.out.printf("        Letter Grade: %c\n", letterGrade);
                // space lines
                System.out.println();
                // update that we found the student
                studentFound = true;
            }

        }
        // if student not found
        if (!studentFound) {
            System.out.printf("     ERROR: there is no record for student \"%s %s\".\n", firstName, lastName);
            // space lines
            System.out.println();
        }
    }

    public static void displayStatsForAClass(String courseNumber, FSCcourseRoster[] courses) {
        // this method will display the stats for the entered course
        // including number of students, high and lowest score
        // average score and what percent of class got each letter grade
        
        // all information printed
        
        // number of students
        int numOfStudents = 0;
        // average score
        double averageScore = 0;
        // highest score
        double highestScore = 0;
        // lowest score
        double lowestScore = 100;
        // total a grade
        int numAGrades = 0;
        // total b grade
        int numBGrades = 0;
        // total c grade
        int numCGrades = 0;
        // total d grade
        int numDGrades = 0;
        // total f grade
        int numFGrades = 0;
        // total final scores used for average
        double totalFinalScore = 0.00;
        // a grade percent of class
        double aGradePercent = 0;
        // b grade percent of class
        double bGradePercent = 0;
        // c grade percent of class
        double cGradePercent = 0;
        // d grade percent of class
        double dGradePercent = 0;
        // f grade percent of class
        double fGradePercent = 0;
        
        // loop over all courses
        for (int i = 0; i < courses.length; i++) {
            // check if current course equals entered course number
            if (courses[i].getCourseNumber().equals(courseNumber)) {
                // get head for that linked list (course)
                Student student = courses[i].getHead();

                // makle sure there is at least one student
                if (student != null) {
                    // set initial high and low score
                    highestScore = student.getFinalGrade();
                    lowestScore = student.getFinalGrade();

                    // get every student's information
                    while (student != null) {
                        // increase number of students
                        numOfStudents++;
                        // add final grade to total for average
                        totalFinalScore += student.getFinalGrade();

                        // check if final grade is the current high score
                        if (student.getFinalGrade() > highestScore) {
                            // update highest score
                            highestScore = student.getFinalGrade();
                        }
                        // check if final grade is current low score
                        if (student.getFinalGrade() < lowestScore) {
                            // update lowest score
                            lowestScore = student.getFinalGrade();
                        }

                        // check letter grade to icrease number of a specific letter grade
                        if (student.getLetterGrade() == 'A') {
                            // increase A grade count
                            numAGrades++;
                        } else if (student.getLetterGrade() == 'B') {
                            // increase B grade count
                            numBGrades++;
                        } else if (student.getLetterGrade() == 'C') {
                            // increase C grade count
                            numCGrades++;
                        } else if (student.getLetterGrade() == 'D') {
                            // increase D grade count
                            numDGrades++;
                        } else if (student.getLetterGrade() == 'F') {
                            // increase F grade count
                            numFGrades++;
                        }

                        // move on to next student
                        student = student.getNext();
                    }
                }

            }
        }

        // make sure there are students in the course
        // to calculate average, and percent of class values
        if (numOfStudents > 0) {
            // average score
            averageScore = totalFinalScore / numOfStudents;
            // percent of class for a
            aGradePercent = ((double) numAGrades / numOfStudents) * 100;
            // percent of class for b
            bGradePercent = ((double) numBGrades / numOfStudents) * 100;
            // percent of class for c
            cGradePercent = ((double) numCGrades / numOfStudents) * 100;
            // percent of class for d
            dGradePercent = ((double) numDGrades / numOfStudents) * 100;
            // percent of class for f
            fGradePercent = ((double) numFGrades / numOfStudents) * 100;
        } else {
            // if there are no students, make sure high and low are 0
            lowestScore = 0.00;
            highestScore = 0.00;

        }
        // print summary statement
        System.out.printf("Statistical Results of %s:\n", courseNumber);
        // print number of students in that course
        System.out.printf("    Total number of student records: %d \n", numOfStudents);
        // print average score
        System.out.printf("    Average Score: %.2f\n", averageScore);
        // print highest score
        System.out.printf("    Highest Score: %.2f\n", highestScore);
        // print lowest score
        System.out.printf("    Lowest Score:  %.2f\n", lowestScore);
        // print number of A grades and calculate percent of class
        System.out.printf("    Total 'A' Grades: %d (%.2f%% of class)\n", numAGrades, aGradePercent);
        // print number of B grades and calculate percent of class
        System.out.printf("    Total 'B' Grades: %d (%.2f%% of class)\n", numBGrades, bGradePercent);
        // print number of C grades and calculate percent of class
        System.out.printf("    Total 'C' Grades: %d (%.2f%% of class)\n", numCGrades, cGradePercent);
        // print number of D grades and calculate percent of class
        System.out.printf("    Total 'D' Grades: %d (%.2f%% of class)\n", numDGrades, dGradePercent);
        // print number of F grades and calculate percent of class
        System.out.printf("    Total 'F' Grades: %d (%.2f%% of class)\n", numFGrades, fGradePercent);
        // space lines out
        System.out.println();

    }

    public static void displayStatsAll(FSCcourseRoster[] courses) {
        // this method will print the stats across all courses
        // includes number of students, highest and lowest score
        // average score, and what percent of students got each letter grade

        // all variables
        
        // number of students
        int numOfStudents = 0;
        // average score
        double averageScore = 0;
        // highest score
        double highestScore = 0;
        // lowest score
        double lowestScore = 100;
        // total a grade
        int numAGrades = 0;
        // total b grade
        int numBGrades = 0;
        // total c grade
        int numCGrades = 0;
        // total d grade
        int numDGrades = 0;
        // total f grade
        int numFGrades = 0;
        // total final scores used for average
        double totalFinalScore = 0.00;
        // a grade percent of class
        double aGradePercent = 0;
        // b grade percent of class
        double bGradePercent = 0;
        // c grade percent of class
        double cGradePercent = 0;
        // d grade percent of class
        double dGradePercent = 0;
        // f grade percent of class
        double fGradePercent = 0;
        
        // loop over all courses
        for (int i = 0; i < courses.length; i++) {
            // get first student in current course
            Student student = courses[i].getHead();

            // keep looping through current course until student points to null
            while (student != null) {
                // increase number of students
                numOfStudents++;
                // add final grade to total for average
                totalFinalScore += student.getFinalGrade();

                // check if final grade is the current high score
                if (student.getFinalGrade() > highestScore) {
                    // update highest score
                    highestScore = student.getFinalGrade();
                }
                // check if final grade is current low score
                if (student.getFinalGrade() < lowestScore) {
                    // update lowest score
                    lowestScore = student.getFinalGrade();
                }

                // check letter grade to icrease number of a specific letter grade
                if (student.getLetterGrade() == 'A') {
                    // increase A grade count
                    numAGrades++;
                } else if (student.getLetterGrade() == 'B') {
                    // increase B grade count
                    numBGrades++;
                } else if (student.getLetterGrade() == 'C') {
                    // increase C grade count
                    numCGrades++;
                } else if (student.getLetterGrade() == 'D') {
                    // increase D grade count
                    numDGrades++;
                } else if (student.getLetterGrade() == 'F') {
                    // increase F grade count
                    numFGrades++;
                }

                // move on to next student
                student = student.getNext();
            }

        }
        // make sure there are students in the course
        // to calculate average, and percent of class values
        if (numOfStudents > 0) {
            // average score
            averageScore = totalFinalScore / numOfStudents;
            // percent of class for a
            aGradePercent = ((double) numAGrades / numOfStudents) * 100;
            // percent of class for b
            bGradePercent = ((double) numBGrades / numOfStudents) * 100;
            // percent of class for c
            cGradePercent = ((double) numCGrades / numOfStudents) * 100;
            // percent of class for d
            dGradePercent = ((double) numDGrades / numOfStudents) * 100;
            // percent of class for f
            fGradePercent = ((double) numFGrades / numOfStudents) * 100;
        } else {
            // if there are no students, make sure high and low are 0
            lowestScore = 0.00;
            highestScore = 0.00;

        }
        // print summary statement
        System.out.println("Statistical Results for All Courses:");
        // print number of students in that course
        System.out.printf("    Total number of student records: %d \n", numOfStudents);
        // print average score
        System.out.printf("    Average Score: %.2f\n", averageScore);
        // print highest score
        System.out.printf("    Highest Score: %.2f\n", highestScore);
        // print lowest score
        System.out.printf("    Lowest Score:  %.2f\n", lowestScore);
        // print number of A grades and calculate percent of class
        System.out.printf("    Total 'A' Grades: %d (%.2f%% of class)\n", numAGrades, aGradePercent);
        // print number of B grades and calculate percent of class
        System.out.printf("    Total 'B' Grades: %d (%.2f%% of class)\n", numBGrades, bGradePercent);
        // print number of C grades and calculate percent of class
        System.out.printf("    Total 'C' Grades: %d (%.2f%% of class)\n", numCGrades, cGradePercent);
        // print number of D grades and calculate percent of class
        System.out.printf("    Total 'D' Grades: %d (%.2f%% of class)\n", numDGrades, dGradePercent);
        // print number of F grades and calculate percent of class
        System.out.printf("    Total 'F' Grades: %d (%.2f%% of class)\n", numFGrades, fGradePercent);
        // space lines out
        System.out.println();
    }

    public static void displayStudentsForAClass(String courseNumber, FSCcourseRoster[] courses) {
        // this method will read in the course number
        // and then print the information of all students in that course
        // this includes first and last name, id
        // scores for each exam, exam average, and letter grade
        
        // loop over all courses
        for (int i = 0; i < courses.length; i++) {
            // check if entered course is current course we're looking at
            if (courses[i].getCourseNumber().equals(courseNumber)) {
                // get head for that linked list (course)
                Student student = courses[i].getHead();

                // check if class is empty
                if (student == null) {
                    // print error message
                    System.out.printf("    ERROR: there are no student records for %s.", courseNumber);
                } // at least one student in course
                else {
                    // print basic message
                    System.out.printf("Course Roster for %s:\n", courseNumber);
                    while (student != null) {
                        // get student ID
                        int studentID = student.getID();
                        // get first name
                        String firstName = student.getFirstName();
                        // get last name
                        String lastName = student.getLastName();
                        int[] examGrades = student.getExamGrades();
                        // first exam grade
                        int exam1Grade = examGrades[0];
                        // second exam grade
                        int exam2Grade = examGrades[1];
                        // final exam grade
                        int finalExamGrade = examGrades[2];
                        // final grade
                        double finalGrade = student.getFinalGrade();
                        // letter grade
                        char letterGrade = student.getLetterGrade();

                        // print all of this information
                        // print student name and id
                        System.out.printf("    %s %s (ID# %d):\n", firstName, lastName, studentID);

                        // print exam 1 grade
                        System.out.printf("        Exam 1:       %d\n", exam1Grade);
                        // print exam 2 grade
                        System.out.printf("        Exam 2:       %d\n", exam2Grade);
                        // print final exam grade
                        System.out.printf("        Final Exam:   %d\n", finalExamGrade);
                        // print final grade
                        System.out.printf("        Final Grade:  %.2f\n", finalGrade);
                        // print letter grade
                        System.out.printf("        Letter Grade: %c\n", letterGrade);

                        // move on to next student
                        student = student.getNext();
                    }
                }

            }
        }
        // space lines out
        System.out.println();
    }

    public static void displayStudentsForAll(FSCcourseRoster[] courses) {
        // this will print the infomation for all students
        // this will call the displayStudentsForAClass method
        // print command entered
        System.out.println("Command: DISPLAYSTUDENTS (ALL)");

        // loop over all courses
        for (int i = 0; i < courses.length; i++) {
            String courseNumber = courses[i].getCourseNumber();
            // get head for current course
            Student student = courses[i].getHead();
            // make sure at least a student in current course
            if (student != null) {
                // print information for all students in current course
                displayStudentsForAClass(courseNumber, courses);
            }

        }
        // space lines out
        System.out.println();
    }

    public static void main(String[] args) {
        

        // welcome message
        System.out.println("Welcome to the FSC Grade Book.");
        // space lines out
        System.out.println();

        // scanner object
        Scanner in = new Scanner(System.in);

        // keep track of num of students
        int numStudents = 0;

        // number of students
        int numOfStudents = 0;

        // read number of courses
        int numCourses = Integer.parseInt(in.nextLine());
        // create a course roaster with the size of numCourses
        // add each course as its own linked list linked list
        FSCcourseRoster[] courses = new FSCcourseRoster[numCourses];
        for (int i = 0; i < numCourses; i++) {
            // create new linked list for the current course
            courses[i] = new FSCcourseRoster();
            // set the course number in the linked list
            courses[i].setCourseNumber(in.nextLine());
        }

        // print courses added
        System.out.println("The following course(s) have been added to the database:");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("    %s\n", courses[i].getCourseNumber());
        }
        // space lines
        System.out.println();
        
        // get inital command user entered
        String userInputCommand = in.nextLine();

        // read in user commands
        while (true) {
            // able to read specific input data
            String[] splitInput = userInputCommand.split(" ");
            // call appropiate method
            
            // if command is to add a record 
            if (splitInput[0].equals("ADDRECORD")) {
                // print command user entered
                System.out.println("Command: ADDRECORD");

                // ger course number
                String courseNumber = splitInput[1];
                // get student id 
                int studentID = Integer.parseInt(splitInput[2]);
                // get first name
                String firstName = splitInput[3];
                // get last name
                String lastName = splitInput[4];
                // get first grade
                int grade1 = Integer.parseInt(splitInput[5]);
                // get second grade
                int grade2 = Integer.parseInt(splitInput[6]);
                // get third grade
                int grade3 = Integer.parseInt(splitInput[7]);

                // call add record method
                numOfStudents = ADDRECORD(numOfStudents, courses, courseNumber, studentID, firstName, lastName, grade1, grade2, grade3);
            
                // if command is to delete the record
            } else if (splitInput[0].equals("DELETERECORD")) {
                // print command user entered
                System.out.println("Command: DELETERECORD");
                // get student id
                int studentID = Integer.parseInt(splitInput[1]);

                // called delete record method
                DELETERECORD(studentID, courses);
                
                // if command is to search by ID
            } else if (splitInput[0].equals("SEARCHBYID")) {
                // print command entered
                System.out.println("Command: SEARCHBYID");
                // get student id
                int studentID = Integer.parseInt(splitInput[1]);

                // call search by id method
                SEARCHBYID(studentID, courses);
                
                // if command is to search by name
            } else if (splitInput[0].equals("SEARCHBYNAME")) {
                // print command entered
                System.out.println("Command: SEARCHBYNAME");
                // get first name
                String firstName = splitInput[1];
                // get last name
                String lastName = splitInput[2];
                // call search by name method
                SEARCHBYNAME(courses, firstName, lastName);
            
                // if command is to display stats
            } else if (splitInput[0].equals("DISPLAYSTATS")) {
                // if command is to display stats for all courses
                if (splitInput[1].equals("ALL")) {
                    // print command entered
                    System.out.println("Command: DISPLAYSTATS (ALL)");
                    // call display all stats method
                    displayStatsAll(courses);
                    
                    // if command is to display stats for a single course
                } else {

                    // read course number
                    String courseNumber = splitInput[1];
                    // print command entered
                    System.out.printf("Command: DISPLAYSTATS (%s)\n", courseNumber);
                    // call display stats for one courses method
                    displayStatsForAClass(courseNumber, courses);
                }
                
                // if command is to display students
            } else if (splitInput[0].equals("DISPLAYSTUDENTS")) {
                // if command is display all students
                if (splitInput[1].equals("ALL")) {
                    // call display all students method
                    displayStudentsForAll(courses);
                // if command is display a students for a single course
                } else {
                    // read course number
                    String courseNumber = splitInput[1];
                    // message printing command and course entered
                    System.out.printf("Command: DISPLAYSTUDENTS (%s)\n", courseNumber);
                    // call display students for one course method
                    displayStudentsForAClass(courseNumber, courses);

                }
                // if command is quit
            } else if (splitInput[0].equals("QUIT")) {
                // stop checking for commands
                break;
            }
            // read next input (command)
            userInputCommand = in.nextLine();
        }
        // print goodbye message
        // there is two the's in this sentence 
        // according to input output, there is a typo in expected output
        // in code lab where there is two the's
        System.out.println("Thank you for using the the FSC Grade Book.");
        // space lines
        System.out.println();

        System.out.println("Goodbye.");

    }
}
