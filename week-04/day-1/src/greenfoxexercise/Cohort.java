package greenfoxexercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  String name;
  List<Student> listOfStudents;
  List<Mentor> listOfMentors;

  public Cohort(){

  }

  public Cohort(String name) {
    this.name = name;
    this.listOfStudents = new ArrayList<>();
    this.listOfMentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.listOfStudents.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.listOfMentors.add(mentor);
  }

  public void info(){
    System.out.println("The " + name + " cohort has " + listOfStudents.size() + " students and " + listOfMentors.size() + " mentors.");
  }

}
