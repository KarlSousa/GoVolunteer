package com.goa.spotfix.govolunteer;

/**
 * Created by N B Panth on 09-06-2018.
 */

public class User {
    private String email;
    private String username;
    private String photoUrl;
  /*
    private int created;
    private int joined;
    */

    public User(){

    }

    public User(String email,String username,String photoUrl)
    {
        this.email = email;
        this.username = username;
        this.photoUrl = photoUrl;
        //this.created = created;
        //this.joined = joined;
    }
     public String getEmail() {return email;}

     public void setEmail(String email) {this.email = email;}

    public String getUsername() {return username;}

    public void setUsername(String email) {this.username = username;}

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

  /*  public int getCreated() {return created;}

    public void setCreated(int created) {this.created = created;}

    public int getJoined() {return created;}

    public void setCreated(int created) {this.created = created;}*/


}
