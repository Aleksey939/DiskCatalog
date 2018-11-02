package org.entity;

public class Disk {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String Title;
    private  String Album;
    public Disk() {
    }
    public Disk(String title, String album) {
        Title = title;
        Album = album;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "Title='" + Title + '\'' +
                ", Album='" + Album + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }
    public String getDisk() {
        String getDisk="'"+Title+"','"+Album+"'";
        System.out.println(getDisk);
        return "'"+Title+"','"+Album+"'";

    }

    public void setTask(String title,String album) {
        this.Title = title;
        this.Album = album;
    }
}



