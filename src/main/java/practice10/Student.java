package practice10;

public class Student extends Person{

  private Klass klass;

  public Student(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public Klass getKlass() {
    return klass;
  }

  public void setKlass(Klass klass) {
    this.klass = klass;
  }

  String introduce() {
    String result = new Person(this.getId(), this.getName(), this.getAge()).introduce() + " I am a Student.";

    if (this.equals(this.getKlass().getLeader())) {
      return result + " I am Leader of " + this.getKlass().getDisplayName() + ".";
    }
    return new Person(this.getId(), this.getName(), this.getAge()).introduce() + " I am a Student. I am at " + this.getKlass().getDisplayName()+ ".";
  }
}
