package DiariesTest;

import Diaries.Diaries;
import Diary.Diary;
import org.junit.Test;

import static org.junit.Assert.*;


public class DiariesTest {
static Diaries diaries;

    @Test
    public void testThatAddToTheDiariesList(){
        Diaries diaries = new Diaries();
        assertEquals(diaries.add("kirisitiyana", "is a man"),1);
    }

    @Test
    public void testThatDiaryIsFoundByUserName(){
        Diaries diaries = new Diaries();
        diaries.add("kirisitiyana", "is a man");
        assertEquals("Diary", diaries.findUserName("Diary"));
    }

//    @Test
//    public void testThatDiaryDeletedByUserName(){
//        Diaries diaries = new Diaries();
//        diaries.add("kirisitiyana", "is a man");
//        assertEquals("Diary", diaries.findUserName("Diary"));
//        diaries.delete("kirisitiyana","is a man");
//        assertEquals(0,Diary.diaries(0));
//    }
}
