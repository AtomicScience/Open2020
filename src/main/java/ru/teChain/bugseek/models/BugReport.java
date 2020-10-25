package ru.teChain.bugseek.models;

import java.util.List;

public class BugReport {
    private int id ;
    private int idTester;
    private String category;
    private String commentary;
    private String Done;
    private List<String> pathImages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTester() {
        return idTester;
    }

    public void setIdTester(int idTester) {
        this.idTester = idTester;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getDone() {
        return Done;
    }

    public void setDone(String done) {
        Done = done;
    }

    public List<String> getPathImages() {
        return pathImages;
    }

    public void setPathImages(List<String> pathImages) {
        this.pathImages = pathImages;
    }






}
