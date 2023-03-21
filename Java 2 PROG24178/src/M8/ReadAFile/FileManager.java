import java.io.File;
import java.util.Scanner;

/** 
* 
* @author Anne Cho
*/

public class FileManager implements IFile {

     @Override
     public String readFile(String filename) throws Exception {
          File file = new File(filename);
          Scanner scan = new Scanner(file);
          String returnValue = "";
          while(scan.hasNextLine()){
               returnValue += scan.nextLine() + "\n";
          }
          scan.close();
          return returnValue;
     }

     @Override
     public boolean writeFile(String filename, String textToSave) {
          return false;
     }

     
}
