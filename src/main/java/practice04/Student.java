package practice04;

public class Student extends Person{

  private int klass;

  public Student(String name, int age, int klass) {
    super(name, age);
    this.klass = klass;
  }

  public int getKlass() {
    return klass;
  }

  public void setKlass(int klass) {
    this.klass = klass;
  }

  String introduce() {
    return new Person(this.getName(), this.getAge()).introduce() + " I am a Student. I am at Class " + this.getKlass() + ".";
  }
}
