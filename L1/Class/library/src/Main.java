
public class Main {
    public static void main(String[] args) {
        Library a = new Library();
        Library b = new Library();

        a.fname = "Ali";
        a.bname = "Harry Potter";
        a.author = "J K Rowling";

        b.fname = "Hossein";
        b.bname = "Koori";
        b.author = "Jose Saramago";

        a.len();
        a.ret();
        b.len();
        b.ret();
    }
}