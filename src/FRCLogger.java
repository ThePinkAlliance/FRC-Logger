public class FRCLogger extends Filemanger {
  public Csv csv;

  public FRCLogger(String file) {
    super(file);

    csv = new Csv(file);
  }
}

class Csv extends Filemanger {
  public Csv(String filename) {
    super(filename);
  }

  public void LogWithTime(Object data) {
    this.Write(java.time.LocalTime.now().toString() + data);
  }
}