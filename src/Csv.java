public class Csv extends Filemanger {
  public String CompressedRows;
  public Boolean InitalWrite = false;

  public Csv(String filename, String[] rows) {
    super(filename);

    for (int i = 0; i != rows.length; i++) {
      String row = rows[i];

      // this is what the expected output is " row one,"
      row = " " + row + ",";

      // adds the currently formated row to compressed rows
      CompressedRows += row;
    }
  }

  public void LogWithTime(Object data) {
    if (!this.InitalWrite && this.CompressedRows != null) {
      this.Write(this.CompressedRows);
      this.InitalWrite = true;
    }

    this.Write(java.time.LocalTime.now().toString() + "," + data + "\n");
  }
}