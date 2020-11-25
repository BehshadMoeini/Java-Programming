public class Library {

    public String fname;
    public String bname;
    public String author;

    public void len () {
        System.out.println(fname + " Lended " + bname + " By " + author + ".");
    }
    public void ret () {
        System.out.println(fname + " Returned " + bname + " By " + author + ".");
    }
}