// TeachersData.java
package com.example.classup.navneetCS0958.faculty;

public class TeachersData {
    private String name, email, post, image, key;

    public String getName() {
        return name;
    }

    public TeachersData() {

    }

    public TeachersData(String name, String email, String post, String image, String key) {
        this.name = name;
        this.email = email;
        this.post = post;
        this.image = image;
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
