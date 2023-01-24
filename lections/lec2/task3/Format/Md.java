package task3.Format;
import java.io.FileWriter;
import java.io.IOException;
import task3.Document.TextDocument;

public class Md extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try(FileWriter fileWriter = new FileWriter(path + ".md",false)){
            fileWriter.write("## <Md Format>\n");
            fileWriter.write(document.getData());
            fileWriter.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        
    }

    
}
