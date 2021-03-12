
public class FRCLogger extends Filemanger {
  public Csv csv;

  public FRCLogger(String file) {
    super(file);

    csv = new Csv(file);
  }
}