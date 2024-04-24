import model.StudentList;
import entity.Student;

import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu(){
        System.out.println("1.Add new Student to the list");
        System.out.println("2.Delete a student from a list");
        System.out.println("3.Search by name");
        System.out.println("4.Search by id");
        System.out.println("5.Print student info descending order of mark");
        System.out.println("6.Exit");
    }
    public static void main(String[] args) {
        list = new StudentList();
        menu();
        while(true){
            int choice;
            System.out.println("#: ");
            choice = input.nextInt();
            if(choice == 1){
                addStudent();
                menu();
            }else if(choice == 2){
                deleteStudent();
                menu();
            }else if(choice == 3){
                searchByName();
                menu();
            }else if(choice == 4){
                searchById();
                menu();
            } else if (choice == 5) {
                printSorted();
                menu();
            } else if (choice == 6) {
                System.exit(0);
            }
        }

    }

    private static void printSorted() {
        list.showList();
        list.sortByMark();
    }

    private static void searchById() {
        int id ;
        System.out.println("Enter student id: ");
        id = input.nextInt();
        list.findById(id);
    }

    private static void searchByName() {
        System.out.println("Enter student name: ");
        String name = input.next();
        list.findByName(name);
    }

    public static void addStudent(){


        System.out.println("Enter student id: ");
        int id = input.nextInt();
        System.out.println("Enter student first name: ");
        String fn = input.next();
        System.out.println("Enter student last name: ");
        String ln = input.next();
        System.out.println("Enter student mark: ");
        double mark = input.nextDouble();
        Student s = new Student(id, fn, ln, mark);
        list.add(s);
    }
    public static void deleteStudent(){
        System.out.println("Enter student id: ");
        int id = input.nextInt();
        list.remove(id);
    }
}
