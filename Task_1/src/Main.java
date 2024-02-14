import Controller.Tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Students Grades Tracker!");
        Scanner in = new Scanner(System.in);
        Tracker tracker = new Tracker();
        int choice;

        do {
            System.out.println("Please select an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Get student grade");
            System.out.println("3. Get the highest grade");
            System.out.println("4. Get the lowest grade");
            System.out.println("5. Get the average grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:");

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the student: ");
                    String name = in.nextLine();
                    System.out.print("Enter the id of the student: ");
                    String id = in.next();
                    System.out.print("Enter the grade of the student: ");
                    Float grade = in.nextFloat();
                    tracker.addStudent(name, id, grade);
                    break;
                case 2:
                    System.out.print("Enter the id of the student: ");
                    id = in.next();
                    tracker.getGradebyId(id);
                    break;
                case 3:
                    tracker.printHighest();
                    break;
                case 4:
                    tracker.printLowest();
                    break;
                case 5:
                    Float average = tracker.getAverage();
                    System.out.println("The average grade is: " + average);
                    break;
                case 6:
                    System.out.println("Thank you for using the Students Grades Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);

    }
}