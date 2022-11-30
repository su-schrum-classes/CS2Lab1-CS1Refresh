import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.io.*;
import refresh.Refresh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class RefreshTest {

    PrintStream outputConsole;
    ByteArrayOutputStream byteOutputStream;

    @BeforeEach
    void backupConsole() {
        // Create a stream to hold the output
        byteOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteOutputStream);
        // IMPORTANT: Save the old System.out!
        outputConsole = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
    }

    @AfterEach
    void restoreConsole() {
        // Put things back
        System.out.flush();
        System.setOut(outputConsole);
    }

    @Test
    void testExercise1() {
        Refresh.exercise1();
        assertEquals("Hello World!"+System.lineSeparator(), byteOutputStream.toString());
    }
	
    @Test
    void testExercise2() {
        
    }

    @Test
    void testExercise3() {
        
    }

    @Test
    void testExercise4() {
        
    }

    @Test
    void testExercise5() {
        
    }

    @Test
    void testExercise6() {
        
    }

    @Test
    void testExercise7() {
        
    }

    @Test
    void testExercise8() {
        
    }

    @Test
    void testExercise9() {
        
    }

    @Test
    void testExercise10() {
        
    }

    @Test
    void testExercise11() {
        
    }

    @Test
    void testExercise12() {
        
    }

    @Test
    void testExercise13() {
        
    }

    @Test
    void testExercise14() {
        
    }

    @Test
    void testExercise15() {
        
    }

    @Test
    void testExercise16() {
        
    }

    @Test
    void testExercise17() {
        
    }

    @Test
    void testExercise18() {
        
    }

    @Test
    void testExercise19() {
        
    }

    @Test
    void testExercise20() {
        
    }

    @Test
    void testExercise21() {
        
    }

}
