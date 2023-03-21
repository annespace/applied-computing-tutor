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
          String returnValue = "";
          try(Scanner scan = new Scanner(file))
          {
               while (scan.hasNextLine()){
                    returnValue += scan.nextLine() + "\n";
               }
          } catch (Exception e){
               System.out.println(" 💀 file not found");
          }
          return returnValue;
     }

     @Override
     public boolean writeFile(String filename, String textToSave) {
          return false;
     }
    
}
