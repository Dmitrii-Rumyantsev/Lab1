package ru.mirea.task22.Task3;
import ru.mirea.task22.Task3.Factory.ICreateDocument;
import ru.mirea.task22.Task3.Factory.ImageDocumentFactory;
import ru.mirea.task22.Task3.Factory.MusicDocumentFactory;
import ru.mirea.task22.Task3.Factory.TextDocumentFactory;
import ru.mirea.task22.Task3.IdDoc.IDocument;


public class TestIDFactory {
    public static void main(String[] args) {
        ICreateDocument iCreateDocument = creatAndOpenFile("music");
        IDocument iDocument = iCreateDocument.CreateNew();

        System.out.println(iDocument.createNew());
        System.out.println(iDocument.createOpen());


        ICreateDocument iCreateDocument2 = creatAndOpenFile("image");
        IDocument iDocument2 = iCreateDocument2.CreateNew();


        System.out.println(iDocument2.createNew());
        System.out.println(iDocument2.createOpen());


        ICreateDocument iCreateDocument3 = creatAndOpenFile("text");
        IDocument iDocument3 = iCreateDocument3.CreateNew();

        System.out.println(iDocument3.createNew());
        System.out.println(iDocument3.createOpen());

    }
    public static ICreateDocument creatAndOpenFile(String types){
        if (types.equalsIgnoreCase("music")){
            return new MusicDocumentFactory();
        }
        else if (types.equalsIgnoreCase("image")){
            return new ImageDocumentFactory();
        }
        else if (types.equalsIgnoreCase("text")){
            return new TextDocumentFactory();
        }
        else {
            throw new RuntimeException(types + "Добавьти классы");
        }
    }
}
