package com.loustagram.loustagram.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private int id;

    private int userId;
    
    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String caption;

    @Column
    private String songUrl;

    @Column
    private String videoUrl;

    @Column
    private String locationUrl;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_comments", referencedColumnName = "id")
    List < Comment > comments = new ArrayList < > ();

    public Post(
        String imageUrl,
        String caption,
        String songUrl,
        String videoUrl,
        String locationUrl
    ) {
        super();
        this.imageUrl = imageUrl;
        this.caption = caption;
        this.songUrl = songUrl;
        this.videoUrl = videoUrl;
        this.locationUrl = locationUrl;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getUserId(){
        return this.userId;
    }

    public void setUserId(int id){
        this.userId = id;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public String getCaption(){
        return this.caption;
    }

    public void setCaption(String caption){
        this.caption = caption;
    }

    public String getSongUrl(){
        return this.songUrl;
    }

    public void setSongUrl(String songUrl){
        this.songUrl = songUrl;
    }

    public String getVideoUrl(){
        return this.videoUrl;
    }

    public void setVideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getLocationUrl(){
        return this.locationUrl;
    }

    public void setLocationUrl(String locationUrl){
        this.locationUrl = locationUrl;
    }
}
