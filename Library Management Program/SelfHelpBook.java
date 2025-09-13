package lib;

public class SelfHelpBook extends Book {
    private String s_focus_area;

    public SelfHelpBook(String b_title,String b_author,String b_isbn,String s_focus_area){
        super(b_title,b_author,b_isbn);
        this.s_focus_area=s_focus_area;
    }

    @Override
    public void display_info(){
        System.out.println("SelfHelpBook-Title:"+b_title+",Focus:"+s_focus_area);
    }
}
