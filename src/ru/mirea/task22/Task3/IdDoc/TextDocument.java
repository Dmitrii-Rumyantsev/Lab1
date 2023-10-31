package ru.mirea.task22.Task3.IdDoc;

public class TextDocument  implements IDocument{
    @Override
    public String createNew() {
        return "Новый текст создан";
    }

    @Override
    public String createOpen() {
        return "Текст открыт";
    }
}
