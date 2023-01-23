package task3;
import task3.Application.Notepad;
import task3.Format.Doc;
import task3.Format.Md;
import task3.Format.Txt;
public class Program {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.newFile();
        notepad.currDocument().addAllText("text1");
        notepad.currDocument().addAllText("text2");
        notepad.currDocument().addAllText("text3");
        notepad.SaveAs("file1", new Txt());
        notepad.SaveAs("file2", new Md());
        notepad.SaveAs("file3", new Doc());

    }
}
