package lib;

public class Novel extends Book {
    private String n_genre;

    public Novel(String b_title,String b_author,String b_isbn,String n_genre){
        super(b_title,b_author,b_isbn);
        this.n_genre=n_genre;
    }

    @Override
    public void display_info(){
        System.out.println("Novel-Title:"+b_title+",Genre:"+n_genre);
    }
}
