public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }
}
