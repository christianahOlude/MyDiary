package Diaries;

import Diary.Diary;

import java.util.ArrayList;

public class Diaries {
    private static final ArrayList<Diary>diaries = new ArrayList<>();

//    public static int diaries(int i) {
//    }


    public int add(String title, String content) {
        Diary newDiary = new Diary(title, content);
        diaries.add(newDiary);
        return diaries.size();
    }

    public String findUserName(String Diary) {
        Diary newDiary = new Diary("name","password");
        return Diary;
    }

    public void delete(String name, String password) {
        Diary newDiary = new Diary(name, password);
        diaries.remove(newDiary);

    }
}
