package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyClassTest {
    int num = 0;

    @Test
    @DisplayName("Add Test")
    public void addition() {
        assertEquals(2, num + 2);
    }

}