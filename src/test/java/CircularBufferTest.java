import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer not empty", result);

    }

    @Test
    public void create_new_buffer_with_default_size_should_be_10() {
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer not Full", result);

    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_until_full_and_write_Z_new_data_override_by_Z(){
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        cb.writeData("Z");
        assertTrue("Buffer not Full", result);
        assertEquals("Don't have Z","Z", cb.readData());

    }


}