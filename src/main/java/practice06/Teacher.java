package practice06;

public class Teacher extends Person {

  private Integer klass;

  public Teacher(String name, int age) {
    super(name, age);
  }

  public Teacher(String name, int age, int klass) {
    super(name, age);
    this.klass = klass;
  }

  public Integer getKlass() {
    return klass;
  }

  public void setKlass(int klass) {
    this.klass = klass;
  }

  String introduce() {
    String result = new Person(this.getName(), this.getAge()).introduce() + " I am a Teacher.";

    if (this.getKlass() == null) {
      return result + " I teach No Class.";
    }

    return result + " I teach Class 2.";
  }
}
