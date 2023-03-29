package com.musicApp.model.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long songId;
    private String spotifyId;
    private String title;
    private LocalTime duration;
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private Album album;
}
