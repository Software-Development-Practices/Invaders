package testPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testPackage.TestFile;

public class MyClassTest {

    @Test
    @DisplayName("지금은 성공하지만 병합되면 실패할 테스트")
    public void addition() {
        int _num = TestFile.getNum();

        assertEquals(2, _num + 2);
    }

}