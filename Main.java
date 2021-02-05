package com.company;

import java.util.*;



interface Actionable {                           // Создаём интерфейс с абстрактным методом для класса Candidate
    void hello();
    void describeExperience();


}





class Candidate1 implements Actionable {
   private String name;
    private String learning;

    public String getName(){
        return name;
    }
    public String getLearning(){                            // используем инкапсуляцию
        return learning;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setLearning(String newLearning){
         learning = newLearning;
    }


    @Override
    public void hello() {
        System.out.println("Hi, my name is " + getName() + "\n" + getLearning());

    }

    @Override
    public void describeExperience() {
        System.out.println("I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code");
    }

}

class Candidate2 extends Candidate1 implements Actionable {                     // используем наследование


    @Override
    public void hello() {
        System.out.println("Hi, my name is " + getName() + "\n" + getLearning());

    }
    @Override
    public void describeExperience() {
        System.out.println("I passed successfully getJavaJob exams and code reviews");
    }

}

class Candidate3 extends Candidate1 implements Actionable {



    @Override
    public void hello() {
        System.out.println("Hi, my name is " + getName() + "\n" + getLearning());

    }
    @Override
    public void describeExperience() {
        System.out.println("I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code");
    }

}

class Candidate4 extends Candidate1 implements Actionable {



    @Override
    public void hello() {
        System.out.println("Hi, my name is " + getName() + "\n" + getLearning());

    }
    @Override
    public void describeExperience() {
        System.out.println("I passed successfully getJavaJob exams and code reviews");
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
        Candidate1 vasya = new Candidate1();
        vasya.setName("Vasya");
        vasya.setLearning("self_learner");

        Candidate2 petya = new Candidate2();
        petya.setName("Petya");
        petya.setLearning("getJavaCourses");
        Candidate3 gabriel = new Candidate3();
        gabriel.setName("Gabriel");
        gabriel.setLearning("self_learner");
        Candidate4 spartakus = new Candidate4();
        spartakus.setName("Spartakus");
        spartakus.setLearning("getJavaCourses");

        List<Actionable> candidates = Arrays.asList(vasya,petya,gabriel,spartakus);
        for(Actionable candidate : candidates){
                employer.hello();
                candidate.hello();                          // Используем полиморфизм
                candidate.describeExperience();




            }
        }
    }






