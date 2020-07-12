import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files;

public class activity42 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            //get the file Object
            File fileUtil = Files.getFile("src/session4/newfile.txt");
            //Read file
            System.out.println("Data in file: " + Files.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = Files.getFile(destDir, "newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}