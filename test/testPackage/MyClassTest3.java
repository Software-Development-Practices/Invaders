package testPackage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest3 {

    @Test
    @DisplayName("Add test")
    public void addition() {
        assertEquals(2,  2);
    }

}