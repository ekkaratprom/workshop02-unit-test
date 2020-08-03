import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi();
        assertEquals("Hello World",result);

    }

    @Test
    public void sayHi_should_with_ekkarat_return_Hello_World_Ekkarat(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("ekkarat");
        assertEquals("Hello Ekkarat",result);

    }

    @Test
    public void sayHi_should_with_big_return_Hello_World_Big(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("big");
        assertEquals("Hello Big",result);

    }

}