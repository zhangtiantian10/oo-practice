package practice07;

public class Teacher extends Person {

  private Klass klass;

  public Teacher(String name, int age) {
    super(name, age);
  }

  public Teacher(String name, int age, Klass klass) {
    super(name, age);
    this.klass = klass;
  }

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  String introduce() {
    String result = new Person(this.getName(), this.getAge()).introduce() + " I am a Teacher.";

    if (this.getKlass() == null) {
      return result + " I teach No Class.";
    }

    return result + " I teach Class 2.";
  }

  String introduceWith(Student student) {
    String result = new Person(this.getName(), this.getAge()).introduce() + " I am a Teacher.";

    if (student.getKlass().equals(this.getKlass())) {
      return result + " I teach " + student.getName() + ".";
    }

    return result + " I don't teach " + student.getName() + ".";
  }
}
