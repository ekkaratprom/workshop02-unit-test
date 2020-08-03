public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer ;
    private int readPointer;
    private int writePointer;

    //Default constructor
    public CircularBuffer() {
        this.buffer = new String[10];;
    }

    public boolean isEmpty() {
        return bufferSize==10;
    }

    public void writeData(String input) {
        bufferSize--;
        if(writePointer == 10){
            writePointer = 0;
        }
        this.buffer[((writePointer++) % this.buffer.length -1 ) + 1 ] = input ;


    }

    public boolean isFull() {
        return bufferSize==0;
    }

    public String readData() {
        return this.buffer[((readPointer++) % this.buffer.length - 1 ) + 1 ]  ;
    }

    public void setBufferSize(int input) {
        this.bufferSize = input;
    }
}
