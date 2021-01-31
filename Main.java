package com.company;
import java.util.ArrayList;
import java.util.List;



class Human{
     String name;

}

class CandidateExp1 {
    public static String selflearner() {

        return "I have been learning Java by myself, nobody examined how thorough is my knowledge and how good is my code";
    }
}
class CandidateExp2{
    public static String getJJ() {

        return "I passed successfully getJavaJob exams and code reviews";
    }
}



interface Candidate {                           // Создаём интерфейс с абстрактным методом для класса Candidate
    void hello();
    void describeExperience();


}



class Candidates extends Human implements Candidate  {
     private Experience experience;


    public Candidates(String name,Experience experience ) {
        this.name = name;                                       // используем наследование
        this.experience = experience;
    }



    public enum Experience {

        SELF ("self_learner"),
        GETJC ("getJavaCourses");

        private final String description;


        private Experience(String description) {                        // используем инкапсуляцию
            this.description = description;

        }

        public String getDescription() {
            return  description;
        }

    }

    public void describeExperience() {

            if (experience.getDescription().equals("self_learner")) {
                System.out.println(CandidateExp1.selflearner());

            }
            else {
                System.out.println(CandidateExp2.getJJ());

            }
    }


    @Override
    public void hello() {                                                      // Используем метод интерфейса
        System.out.println("Hi, my name is " + this.name + "\n" + experience.getDescription() );
    }


}


class Employer  {

    public void hello() {
        System.out.println("Hi! Introduce yourself");
    }
}



public class Main {

    public static void main(String[] args) {

        Employer employer = new Employer();
        List<Candidate> candidates = new ArrayList<>();

        candidates.add(new Candidates("Vasya", Candidates.Experience.SELF));
        candidates.add(new Candidates("Petya", Candidates.Experience.GETJC));
        candidates.add(new Candidates("Gabriel", Candidates.Experience.SELF));

        for(Candidate candidate :candidates) {
                employer.hello();
                candidate.hello();                          // Используем полиморфизм
                candidate.describeExperience();


            }
        }
    }






