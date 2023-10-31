package ru.mirea.task22.Task3.Factory;

import ru.mirea.task22.Task3.IdDoc.IDocument;
import ru.mirea.task22.Task3.IdDoc.MusicDocument;

public class MusicDocumentFactory implements ICreateDocument {
    @Override
    public IDocument CreateOpen() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }
}
