package cloneable;

public class Student extends Person implements Cloneable {

  // 1. Implements Cloneable
  // 2. Override clone() (see below)
  // 3. Create a variable johnTheClone with using clone() method on john
  // Ty, Szabi!

  String previousOrganization;
  int skippedDays;

  public static void main(String[] args) throws CloneNotSupportedException {
    Student john = new Student("John", 20, "male", "BME");

    Student johnTheClone = (Student) john.clone();

    john.name = "Johnny";

  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    this.previousOrganization = "Google";
    this.skippedDays = 0;

  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old" + gender + " from " + previousOrganization
            + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {

    skippedDays += numberOfDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();

  }
}