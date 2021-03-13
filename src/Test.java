public class Test {
  public String[] rows = { "f", "d" };
  public FRCLogger logger = new FRCLogger("inputs.json", rows);

  public Test() {
    logger.csv.LogWithTime("1.1, 1.1");
  }
}
