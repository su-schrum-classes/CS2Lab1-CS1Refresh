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
        Refresh.exercise2();
        assertEquals("4.795831523312719"+System.lineSeparator(), byteOutputStream.toString());
    }

    @Test
    void testExercise3() {
        Refresh.exercise3();
        assertEquals("1"+System.lineSeparator()+
                     "2"+System.lineSeparator()+
                     "3"+System.lineSeparator()+
                     "4"+System.lineSeparator()+
                     "5"+System.lineSeparator()+
                     "6"+System.lineSeparator()+
                     "7"+System.lineSeparator()+
                     "8"+System.lineSeparator()+
                     "9"+System.lineSeparator()+
                     "10"+System.lineSeparator(), byteOutputStream.toString());
    }

    @Test
    void testExercise4() {
        Refresh.exercise4();
        assertEquals("4560"+System.lineSeparator(), byteOutputStream.toString());
    }

    @Test
    void testExercise5() {
        Refresh.exercise5(1,2);
        Refresh.exercise5(1000,200);
        Refresh.exercise5(-100,50);
        Refresh.exercise5(12,23);
        Refresh.exercise5(-100.05,50.25);
        Refresh.exercise5(12.001,23.5);
        assertEquals("3.0"+System.lineSeparator()+
                     "1200.0"+System.lineSeparator()+
                     "-50.0"+System.lineSeparator()+
                     "35.0"+System.lineSeparator()+
                     "-49.8"+System.lineSeparator()+
                     "35.501"+System.lineSeparator(), byteOutputStream.toString());
    }

    @Test
    void testExercise6() {
        assertEquals(3.0,Refresh.exercise6(1,2));
        assertEquals(1200.0,Refresh.exercise6(1000,200));
        assertEquals(-50.0,Refresh.exercise6(-100,50));
        assertEquals(35.0,Refresh.exercise6(12,23));
        assertEquals(-49.8,Refresh.exercise6(-100.05,50.25));
        assertEquals(35.501,Refresh.exercise6(12.001,23.5));
    }

    @Test
    void testExercise7() {
        Refresh.exercise7();
        assertEquals("**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator(), byteOutputStream.toString());
        
    }

    @Test
    void testExercise8() {
        Refresh.exercise8(10,3);
        Refresh.exercise8(2,5);
        Refresh.exercise8(4,1);
        assertEquals("**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**********"+System.lineSeparator()+
                     "**"+System.lineSeparator()+
                     "**"+System.lineSeparator()+
                     "**"+System.lineSeparator()+
                     "**"+System.lineSeparator()+
                     "**"+System.lineSeparator()+
                     "****"+System.lineSeparator(), byteOutputStream.toString());
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
