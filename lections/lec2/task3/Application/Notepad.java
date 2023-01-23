package task3.Application;
import java.util.ArrayList;
import java.util.List;
import task3.Document.TextDocument;
import task3.Format.TextFormat;
public class Notepad {
    
    private List<TextDocument> documents;
    private int index;

    public Notepad(){
        documents = new ArrayList<>();
        index = - 1;
    }

    public void newFile(){
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path,TextFormat format){

        format.SaveAs(documents.get(index), path);
    }


    
}
