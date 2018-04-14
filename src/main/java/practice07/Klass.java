package practice07;

public class Klass {
  private Integer number;

  public Klass(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  String getDisplayName() {
    return "Class " + number;
  }
}
