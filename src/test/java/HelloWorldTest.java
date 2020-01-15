import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test(){
       assertThat("Hello World").isEqualTo("Hello World");
    }

    @Test
    public void should_be_mocked() {
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        assertThat(helloWorld.beenCalled()).isEqualTo("Hello World");
    }
    @Test
    public void cases( ){
        assertEquals(new GameNumber(1).toString(),"1");
        assertEquals(new GameNumber(3).toString(),"Fizz");
        assertEquals(new GameNumber(5).toString(),"Buzz");
        assertEquals(new GameNumber(15).toString(),"FizzBuzz");
    }


}
