import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FRCLogger {
  private final String baseDir = "/home/lvuser";
  private File file;
  private FileWriter writer;
  private BufferedWriter bw;

  public Csv csv;

  public FRCLogger(String FileName) {
    this.file = new File(baseDir + FileName);
    this.csv = new Csv(FileName);

    try {
      writer = new FileWriter(file);
      bw = new BufferedWriter(writer);
    } catch (IOException err) {
      throw new Error(err);
    }
  }

  public boolean Create() {
    try {
      if (file.exists())
        return false;

      return file.createNewFile();
    } catch (IOException err) {
      throw new Error(err);
    }
  }

  public boolean DestructiveCreate() {
    try {
      return file.createNewFile();
    } catch (IOException err) {
      throw new Error(err);
    }
  }

  public void Close() {
    try {
      bw.close();
      writer.close();
    } catch (IOException err) {
      throw new Error(err);
    }
  }

  public void Write(Object Data) {
    try {
      bw.write(String.valueOf(Data));
    } catch (IOException err) {
      throw new Error(err);
    }
  }
}

class Csv {
  private FRCLogger logger;

  public Csv(String filename) {
    logger = new FRCLogger(filename);
  }

  public void LogWithTime(Object data) {
    logger.Write(java.time.LocalTime.now().toString() + data);
  }
}