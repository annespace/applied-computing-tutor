/** 
* 
* @author Anne Cho
*/

//Saving a file to disk
public class Start {

     public static void main(String[] args) throws Exception {

          FileManager fileManager = new FileManager();
          String data = "hello 😺 \n how are you? 🐌 \n hope you're doing well 🦭";
          System.out.println(fileManager.writeFile("file.txt", data));
          System.out.println(fileManager.readFile("file.txt"));

     }
     
}
