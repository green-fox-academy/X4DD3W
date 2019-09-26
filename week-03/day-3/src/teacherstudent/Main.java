package teacherstudent;

public class Main {

  public static void main(String[] args) {

    // Instantiate a Student and Teacher object
    Student bobby = new Student();
    Teacher lizzy = new Teacher();

    // Call the student's question() method and the teacher's teach() method
    bobby.question(lizzy);
    lizzy.teach(bobby);

  }

}
