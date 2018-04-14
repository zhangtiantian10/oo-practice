package practice10;

import java.util.Set;

import static java.util.stream.Collectors.joining;

public class Teacher extends Person {

  private Set<Klass> classes;

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public Teacher(int id, String name, int age, Set<Klass> classes) {
    super(id, name, age);
    this.classes = classes;
  }

  public Set<Klass> getClasses() {
    return classes;
  }

  public void setClasses(Set<Klass> classes) {
    this.classes = classes;
  }

  String introduce() {
    String result = new Person(this.getId(), this.getName(), this.getAge()).introduce() + " I am a Teacher.";

    if (this.classes == null || this.classes.isEmpty()) {
      return result + " I teach No Class.";
    }

    String classesStr = this.classes.stream()
      .map(klass -> String.valueOf(klass.getNumber()))
      .collect(joining(", "));

    return result + " I teach Class " + classesStr + ".";
  }

  String introduceWith(Student student) {
    String result = new Person(this.getId(), this.getName(), this.getAge()).introduce() + " I am a Teacher.";

    if (classes.contains(student.getKlass())) {
      return result + " I teach " + student.getName() + ".";
    }

    return result + " I don't teach " + student.getName() + ".";
  }

  public boolean isTeaching(Student student) {
    return this.classes.stream().anyMatch(c -> c.isIn(student));
  }
}
