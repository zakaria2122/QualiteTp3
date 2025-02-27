import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
        assertNotNull(b);
    }
}