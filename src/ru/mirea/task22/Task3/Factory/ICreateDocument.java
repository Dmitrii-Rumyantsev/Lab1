package ru.mirea.task22.Task3.Factory;

import ru.mirea.task22.Task3.IdDoc.IDocument;

public interface ICreateDocument {
    public IDocument CreateOpen();
    public IDocument CreateNew();
}
