package lib;

public class TextBook extends Book {
    private String t_subject;

    public TextBook(String b_title,String b_author,String b_isbn,String t_subject){
        super(b_title,b_author,b_isbn);
        this.t_subject=t_subject;
    }

    @Override
    public void display_info(){
        System.out.println("TextBook-Title:"+b_title+",Subject:"+t_subject);
    }
}
