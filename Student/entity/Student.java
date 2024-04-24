package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String firstname;
    private String lastname ;
    private double mark;

    public Student(){
    }

    public Student(int id, String firstname, String lastname, double mark) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mark = mark;
    }
    public void scanInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student id: ");
        this.id = scan.nextInt();
        System.out.println("Enter student firstname: ");
        this.firstname = scan.next();
        System.out.println("Enter student lastname: ");
        this.lastname = scan.next();
        System.out.println("Enter student mark: ");
        this.mark = scan.nextDouble();

    }

    public void printInfo(){
        System.out.printf("%3d|%10s%10s|%5f\n",
                getId(),
                getFirstName(),
                getLastName(),
                getMark());
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public double getMark() {
        return mark;
    }
}

