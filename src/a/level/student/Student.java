package a.level.student;

import java.io.Serializable;

public class Student implements Person, Cloneable, Serializable {

    public static String SERIAL_ID = "1111111111111111";
    private static double IS_GOOD_THRESHOLD = 5.0;

    private String name;
    private String lastName;
    private Integer age;
    private Double rating;

    public Student() {

    }

    public Student(String name, String lastName, Integer age, Double rating) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
    }

    public Student(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rating = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public boolean isGoodStudent() {
        return this.rating > IS_GOOD_THRESHOLD;
    }
}
