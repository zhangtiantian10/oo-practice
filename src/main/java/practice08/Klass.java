package practice08;

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
    this.leader = student;
  }

  public Student getLeader() {
    return leader;
  }

  String getDisplayName() {
    return "Class 2";
  }
}
