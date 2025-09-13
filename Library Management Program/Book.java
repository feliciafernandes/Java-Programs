package lib;

public class Book implements Issueable {
    protected String b_title;
    protected String b_author;
    protected String b_isbn;
    protected boolean b_available;

    public Book(String b_title,String b_author,String b_isbn){
        this.b_title=b_title;
        this.b_author=b_author;
        this.b_isbn=b_isbn;
        this.b_available=true;
    }

    @Override
    public void issue(){
        if(b_available){
            b_available=false;
            System.out.println("Book issued:"+b_title);
        }else{
            System.out.println("Book already issued:"+b_title);
        }
    }

    @Override
    public void return_book(){
        if(!b_available){
            b_available=true;
            System.out.println("Book returned:"+b_title);
        }
    }

    @Override
    public boolean is_available(){
        return b_available;
    }

    public String get_title(){
        return b_title;
    }

    public String get_isbn(){
        return b_isbn;
    }

    public void display_info(){
        System.out.println("Title of the book is:"+b_title+".\nAuthor of the book is:"+b_author+".\nISBN:"+b_isbn+".");
    }
}
