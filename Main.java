package com.company;
import java.util.ArrayList;
import java.util.List;




abstract class Human {                             // Создаём абстрактный класс с абстрактным методом
    String name;                                   // для класса Employer
     abstract void hello();
}


interface Action {                           // Создаём интерфейс для класса Candidate
    public void hello();
}

class Candidate extends Human {
    public String exp;

    public Candidate(String name, String exp) {
        this.name = name;
        this.exp = exp;
    }
    public  void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;                                        // Используем инкапсуляцию
    }
    public void setExp(String exp){

        this.exp = exp;
    }
    public String getExp(){

        return exp;
    }

    public void describeExperience() {
        if (exp.equals("self-learner")) {
            System.out.println("I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code");
        } else {
            System.out.println("I passed successfully getJavaJob exams and code reviews");
        }
    }

    @Override
    public void hello() {                                                   // Используем метод интерфейса
        System.out.println("Hi, my name is " + name + "\n" + exp);
    }
}


class Employer extends Human implements Action {

    public Employer() {
        this.name = name;
    }


    public void hello() {                               // Используем абстракцию
        System.out.println("Hi! Introduce yourself");
    }
}



public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();
        List<Candidate> candidates = new ArrayList<>();

            class Vasya extends Candidate{
                public Vasya() {
                    super("Vasya","self-learner");
                }
            }

            class Petya extends Candidate{
                public Petya() {
                    super("Petya","getJavaCourses");
                }
            }

            class Gabriel extends Candidate {
                public Gabriel() {
                    super("Gabriel","self-learner");
                }
            }

        candidates.add(new Candidate("Vasya","self-learner"));
        candidates.add(new Candidate("Petya","getJavaCourses"));
        candidates.add(new Candidate("Gabriel","self-learner"));

        for(Candidate candidate :candidates) {
                employer.hello();                           // Используем абстракцию
                candidate.hello();                          // Используем полиморфизм
                candidate.describeExperience();
            }
        }
    }






