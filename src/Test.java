public class Test {
  public FRCLogger logger = new FRCLogger("inputs.json");

  public Test() {
    logger.csv.LogWithTime("1.1, 1.1");
  }
}
