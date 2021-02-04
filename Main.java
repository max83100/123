package com.company;

import java.util.*;



interface Actionable {                           // Создаём интерфейс с абстрактным методом для класса Candidate
    void hello();
    void describeExperience();


}





class Candidate1 implements Actionable {
    String name;
    String experience;                                  //спользуем инкапсуляцию
    String learning;

    public Candidate1(String name, String experience,String learning) {
        this.name = name;
        this.experience = experience;
        this.learning = learning;
    }
    @Override
    public void hello() {
        System.out.println("Hi, my name is " + this.name + "\n" + this.learning);

    }

    @Override
    public void describeExperience() {
        System.out.println(this.experience);
    }

}

class Candidate2 extends Candidate1 implements Actionable {                     // используем наследование

    public Candidate2(String name, String experience, String learning) {
        super(name, experience, learning);
    }

    @Override
    public void hello() {
        System.out.println("Hi, my name is " + this.name + "\n" + this.learning);

    }
    @Override
    public void describeExperience() {
        System.out.println(this.experience);
    }

}

class Candidate3 extends Candidate1 implements Actionable {

    public Candidate3(String name, String experience, String learning) {
        super(name, experience, learning);
    }

    @Override
    public void hello() {
        System.out.println("Hi, my name is " + this.name + "\n" + this.learning);

    }
    @Override
    public void describeExperience() {
        System.out.println(this.experience);
    }

}

class Candidate4 extends Candidate1 implements Actionable {

    public Candidate4(String name, String experience, String learning) {
        super(name, experience, learning);
    }

    @Override
    public void hello() {
        System.out.println("Hi, my name is " + this.name + "\n" + this.learning);

    }
    @Override
    public void describeExperience() {
        System.out.println(this.experience);
    }

}


class Employer   {

    public void hello() {
        System.out.println("Hi! Introduce yourself");
    }
}



public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();
        Actionable vasya = new Candidate1("Vasya","I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code","self_learner");
        Actionable petya = new Candidate2("Petya","I passed successfully getJavaJob exams and code reviews","getJavaCourses");
        Actionable gabriel = new Candidate3("Gabriel","I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code","self_learner");
        Actionable spartakus = new Candidate4("Spartakus","I passed successfully getJavaJob exams and code reviews","getJavaCourses");
        List<Actionable> candidates = Arrays.asList(vasya,petya,gabriel,spartakus);

        for(Actionable candidate : candidates){
                employer.hello();
                candidate.hello();                          // Используем полиморфизм
                candidate.describeExperience();




            }
        }
    }






