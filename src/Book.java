public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }
}
