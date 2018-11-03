import com.mateuszw.Singleton;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton instance = Singleton.getInstance();
        Singleton shouldBeTheSameInstance = Singleton.getInstance();
        assertEquals(instance, shouldBeTheSameInstance);
    }
}
