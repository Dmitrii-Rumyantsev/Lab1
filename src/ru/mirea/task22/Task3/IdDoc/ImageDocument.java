package ru.mirea.task22.Task3.IdDoc;

public class ImageDocument implements IDocument {
    @Override
    public String createNew() {
        return "Новое фото создано";
    }

    @Override
    public String createOpen() {
        return "Фото открыто";
    }
}
