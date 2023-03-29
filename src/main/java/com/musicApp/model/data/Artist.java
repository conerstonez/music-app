package com.musicApp.model.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long artistId;
    private String spotify;
    private String name;
    private LocalDate dateAdded;
    @OneToMany
    private Collection<Song> songs;
    @OneToMany
    private Collection<Album> albums;

}
