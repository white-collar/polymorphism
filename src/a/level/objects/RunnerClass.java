package a.level.objects;

import a.level.student.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RunnerClass {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        System.out.println(newClass.getName());

        NewClass newClass1 = new NewClass("My new name value");
        System.out.println("1:" + newClass1.getName());
        newClass1.setName("My updated name value");
        System.out.println("2:" + newClass1.getName());

        NewClass newClass2 = new NewClass("Follow the white rabbit");
        System.out.println(newClass2.getName());

        // == vs. equals
        int a = 6;
        int b = 6;
        System.out.println(a == b);

        String hello = new String("Hello");
        String hello1 = new String("Hello world");
        System.out.println(hello.equals(hello1));

        System.out.println(Student.SERIAL_ID);
        Student student = new Student("James", "Bond", 45, 8.99);
        student.setRating(9.45);
        student.setName("James Henry");
        student.setLastName("007");
        student.setAge(25);

        Student student1 = new Student("Sherlock", "Holmes", 41, 10.0);

        Student student2 = new Student("Mister", "Bean", 50, 1.99);

        Bachelor bachelor = new Bachelor(student2, "Course work name");

//        Master master = new Master();

        System.out.println("===========================================");

        System.out.println(student.isGoodStudent());
        System.out.println(bachelor.isGoodStudent());
      //  System.out.println(master.isGoodStudent());
        Person person = new Student("Student name", "Student lastname", 25, 7.00);
        Person person1 = new Bachelor((Student) person, "bachelor course work name");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);

        Random randomno = new Random();
        int key = randomno.nextInt(2);
        Person personToPrint = persons.get(key);

        Printer printer = new Printer();
        System.out.println("::::" + key);
        printer.printHowPersonIsGood(personToPrint);
    }

}
