import java.util.function.Predicate;

public interface Printable {
    void print();

    static void printItems (Printable[] printable, Predicate<Printable> predicate) {
        for(Printable item: printable) {
            if(predicate.test(item)) {
                item.print();
            }
        }
    }
}
