public class Csv extends Filemanger {
  public Csv(String filename) {
    super(filename);
  }

  public void LogWithTime(Object data) {
    this.Write(java.time.LocalTime.now().toString() + data);
  }
}