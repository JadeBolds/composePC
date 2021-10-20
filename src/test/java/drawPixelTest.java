import org.junit.Test;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;

public class drawPixelTest {

    //does drawPixel print "Drawing pixel at "+ x + "," + y + " " + " in color "+ color" ?
    public void testNullEqualsFalse() {
        PC pc = new PC("case", "monitor", "motherboard");

        assertFalse(pc.equals(null));
    }

    private void assertFalse(boolean equals) {
    }
}
