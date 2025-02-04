package Diary;

import Entry.Entry;

import java.util.ArrayList;

public class Diary {
    ArrayList<Entry> entries = new ArrayList<>();

    private String userName;
    private String password;
    private boolean isLocked = false;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }


    public void createEntry(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void deleteEntry(int id) {
    }

    public boolean lockDiary() {
        isLocked = true;
        return true;
    }

    public boolean unlockDiary() {
        if (isLocked) {
            isLocked = false;
        }
        return false;
    }


    public int findUserById(int id) {
        if (Entry.id != id) {
            throw new IllegalArgumentException("incorrect id");
        }
        return id;
    }
}
