public interface Obsevable {
    void attach(StreamingObserver observer);
    void dettach(StreamingObserver observer);
    void alert();
}
