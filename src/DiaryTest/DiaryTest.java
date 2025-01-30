package DiaryTest;

import Diary.Diary;
import Entry.Entry;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiaryTest {
    @Test
    public void testThatDiaryIsNotLockedAtStart() {
        Diary diary = new Diary("name","password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCreatesEntry() {
        Diary diary = new Diary("name","password");
        assertFalse(diary.isLocked());
        diary.createEntry("name","password");
        assertNotNull(diary);
    }
//
//    @Test
//    public void testThatDiaryDeletesEntry() {
//        Diary diary = new Diary("name","password");
//        diary.createEntry("name","password");
//        assertNull(diary.deleteEntry(1));
//    }

    @Test
    public void testThatDiaryIsLockedByUser() {
        Diary diary = new Diary("name","password");
        diary.createEntry("name","password");
        assertNotNull(diary);
        assertFalse(diary.isLocked());
        assertTrue(diary.lockDiary());
    }

    @Test
    public void testThatDiaryIsUnlockedByUser() {
        Diary diary = new Diary("name","password");
        diary.createEntry("name","password");
        assertNotNull(diary);
        diary.isLocked();
        assertFalse(diary.isLocked());
        diary.unlockDiary();
        assertFalse(diary.unlockDiary());
    }

    @Test
    public void testThatDiaryUpdatesEntry() {
        Diary diary = new Diary("name","password");
        diary.createEntry("name","password");
        assertNotNull(diary);

    }

    @Test
    public void testThatEntryIsCreatedByUser() {
        Diary diary = new Diary("name","password");
        Entry entries = new Entry(1,"title","content");
        assertNotNull(entries);

    }

    @Test
    public void testThatIdCanBeFoundInTheDiary() {
        Diary diary = new Diary("name","password");
        Entry entries = new Entry(1,"title","content");
        assertNotNull(entries);
        assertEquals(1,diary.findUserById(1));

    }
}
