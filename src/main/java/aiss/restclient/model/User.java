package aiss.restclient.model;

public class User {
    private String id;
    private String name;
    private String user_link;
    private String picture_link;

    public User(String id, String name, String user_link, String picture_link){
        this.id = id;
        this.name = name;
        this.user_link = user_link;
        this.picture_link = picture_link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_link() {
        return user_link;
    }

    public void setUser_link(String user_link) {
        this.user_link = user_link;
    }

    public String getPicture_link() {
        return picture_link;
    }

    public void setPicture_link(String picture_link) {
        this.picture_link = picture_link;
    }
}
