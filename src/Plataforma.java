import java.util.ArrayList;

public class Plataforma implements Obsevable {
    private final ArrayList<StreamingObserver> observers = new ArrayList<>();
    private final ArrayList<Streaming> streamings = new ArrayList<>();

    @Override
    public void attach(StreamingObserver observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(StreamingObserver observer) {
        observers.remove(observer);
    }

    public void addStreaming(Streaming streaming) {
        streamings.add(streaming);
        alert();
    }

    @Override
    public void alert() {
        var last = streamings.get(streamings.size() - 1);
        for (StreamingObserver observer : observers)
            observer.update(last);
    }
}
