package practice09;

public class Klass {
  private Integer number;
  private Student leader;

  public Klass(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public void assignLeader(Student student) {
    if (student.getKlass().equals(this)) {
      this.leader = student;
    } else {
      System.out.println("It is not one of us.");
    }
  }

  public Student getLeader() {
    return leader;
  }

  String getDisplayName() {
    return "Class " + number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Klass klass = (Klass) o;

    return number == klass.number;
  }

  @Override
  public int hashCode() {
    return number;
  }

  public void appendMember(Student student) {
    student.setKlass(this);
  }
}
