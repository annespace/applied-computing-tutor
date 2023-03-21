/** 
* 
* @author Anne Cho
*/

public interface IFile {

     String readFile(String filename) throws Exception;
     boolean writeFile(String filename, String textToSave);

}