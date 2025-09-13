package lib;

public class Main {
    public static void main(String[] args){
        TextBook tb=new TextBook("Thinking in Java","Bruce Eckel","111","Object Oriented Programming");
        SelfHelpBook sh=new SelfHelpBook("Atomic Habits","James Clear","222","Habits");
        Novel novel=new Novel("Swami and Friends","R.K. Narayan","333","Childhood");

        tb.display_info();
        sh.display_info();
        novel.display_info();

        System.out.println("\nChecking if it is avaiable...");
        System.out.println("Atomic Habits available?"+sh.is_available());

        sh.issue();
        System.out.println("Is it available after issue?"+sh.is_available());

        sh.return_book();
        System.out.println("Is it available after return?"+sh.is_available());
    }
}
