package ru.mirea.task22.Task3.Factory;

import ru.mirea.task22.Task3.IdDoc.IDocument;
import ru.mirea.task22.Task3.IdDoc.TextDocument;

public class TextDocumentFactory implements ICreateDocument {
    @Override
    public IDocument CreateOpen() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }
}
