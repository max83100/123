package com.company;

import java.util.*;

class Human{
    String name;
    String learning;
}

interface Actionable {                           // Создаём интерфейс с абстрактным методом для класса Candidate
    void hello();
    void describeExperience();


}





class Candidate  extends Human implements Actionable  {                                       // используем наследование


    public String getName(){
        return name;                                                                            // используем инкапсуляцию
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



class Employer   {

    public void hello() {
        System.out.println("Hi! Introduce yourself");
    }
}



public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();
        Candidate vasya = new Candidate();
        vasya.setName("Vasya");
        vasya.setLearning("self_learner");

        Candidate petya = new Candidate();
        petya.setName("Petya");
        petya.setLearning("getJavaCourses");

        Candidate gabriel = new Candidate();
        gabriel.setName("Gabriel");
        gabriel.setLearning("self_learner");

        Candidate spartakus = new Candidate();
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






