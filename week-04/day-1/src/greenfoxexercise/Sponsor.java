package greenfoxexercise;

public class Sponsor extends Person {

  /* String name;
   int age;
   String gender;*/
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    hiredStudents = 0;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }

  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " years old " + gender + ", who represents " + company
            + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }

}
