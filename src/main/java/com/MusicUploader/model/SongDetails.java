package com.MusicUploader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class SongDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long songId;

    private String songName;

    private Date dateUploaded = new Date();

    private String songSize;

}
