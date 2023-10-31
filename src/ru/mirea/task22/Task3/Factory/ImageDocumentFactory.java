package ru.mirea.task22.Task3.Factory;

import ru.mirea.task22.Task3.IdDoc.IDocument;
import ru.mirea.task22.Task3.IdDoc.ImageDocument;

public class ImageDocumentFactory implements ICreateDocument {


    @Override
    public IDocument CreateOpen() {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateNew() {
        return new ImageDocument();
    }
}
