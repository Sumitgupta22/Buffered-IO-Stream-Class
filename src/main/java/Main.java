// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
class Buffer_io{
  void output_file(String filename, String text) throws IOException{
    FileOutputStream fos = new FileOutputStream(filename);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    String s=text;
    byte b[]=s.getBytes();
    bos.write(b);
    bos.close();
    fos.close();
    System.out.println("File written");
    }

void input_file(String filename) throws IOException{
    FileInputStream fos = new FileInputStream(filename);
    BufferedInputStream bos = new BufferedInputStream(fos);
    int i;
  while((i=bos.read())!=-1){
    System.out.print((char)i);
  }
    }
}
public class Main {
  public static void main(String[] args) {
    try{
      Buffer_io obj=new Buffer_io();
      obj.output_file("myfile.txt","Hello , guys welcome to program");
      obj.input_file("myfile.txt");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}