import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
    private BlockingQueue<Integer> buffer;

    public Buffer(int capacity) {
        buffer = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(int item) throws InterruptedException {
        buffer.put(item);
    }

    public int consume() throws InterruptedException {
        return buffer.take();
    }
}
