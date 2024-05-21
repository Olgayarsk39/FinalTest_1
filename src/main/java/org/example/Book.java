package org.example;

public class Book  extends AbstractLibrary {
    private String title;
    private int page;
    public Book(String author, String inventoryNumber, String title, int page){
        super(author, inventoryNumber);
        this.title = title;
        this.page = page;
    }

    public  String getTitle(){
        return  title;
    }

    public int getPage(){
        return page;
    }

    @Override
    public String toString() {
        return "Книга { " +
                "название ='" + title + '\'' +
                ", количество страниц =" + page +
                '}' + "\n";
    }
}
