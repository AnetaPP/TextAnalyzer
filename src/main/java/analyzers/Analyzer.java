package analyzers;

public interface Analyzer<T> {

    T analyze (String text);
    //String format (T analyze);
}
