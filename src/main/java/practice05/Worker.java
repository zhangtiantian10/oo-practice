package practice05;

public class Worker extends Person {
  public Worker(String name, int age) {
    super(name, age);
  }

  String introduce() {
    return new Person(this.getName(), this.getAge()).introduce() + " I am a Worker. I have a job.";
  }
}