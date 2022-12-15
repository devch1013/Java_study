package org.example;
// 소속된 패키지 위치


import java.util.ArrayList;
import java.util.List;

// public, protect, protected, default
// 명시적 용도
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 객체
        Teacher teacher = new Teacher();
        teacher.name = "sas";
        teacher.age = 10;

        Student student1 = new Student("111",10);

        Student student2 = new Student("222",11);

        Class class1 = new Class();
        class1.teacher = teacher;
        class1.students[0] = student1;
        class1.students[1] = student2;

        // 상속



        // 객체 지향
        List<String> test = new ArrayList<>();
    }
    // main, arg, static 있어야 main
    // 모든 객체는 Object 객체로 향한다 -> 메모리 정해주는 객체
}
//class

class Teacher{
    String name;
    Integer age;

}


class Student{
    private String name;
    private Integer age;
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}

class Class{
    Teacher teacher;
    Student[] students = new Student[30];
}

// 객체를 객체답지 않게

