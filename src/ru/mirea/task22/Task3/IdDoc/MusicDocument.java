package ru.mirea.task22.Task3.IdDoc;

public class MusicDocument implements IDocument{

    @Override
    public String createNew() {
        return "Новая музыка записана";
    }

    @Override
    public String createOpen() {
        return "Музыка открыта для прослушивания";
    }
}
