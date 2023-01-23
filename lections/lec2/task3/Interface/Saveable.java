package task3.Interface;
import task3.Document.TextDocument;

public interface Saveable {

    void SaveAs(TextDocument document, String path);//передаем формат файла и путь к этому файлу

}

