package com.musicApp.model.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long albumId;
    private String spotifyId;
    private String title;
    private LocalDate releaseDate;
    private LocalDate dateAdded;
    private LocalTime duration;
    private Genre genre;
    @ManyToOne
    private Artist artist;
    @OneToMany
    private Collection<Song> songs;

}
