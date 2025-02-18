package com.br.vkcoders.olhaaquicondominio.models;

import com.br.vkcoders.olhaaquicondominio.records.AnnounceRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "advertising")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AnnounceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 50)
    private String auth;

    @Column(nullable = false, length = 50)
    private String tag;

    @Column(length = 500)
    private String image;

    private Boolean highlighted;

    public AnnounceModel(AnnounceRecord payload) {
        this.title = payload.title();
        this.auth = payload.auth();
        this.tag = payload.tag();
        this.highlighted = payload.highlighted() != null ? payload.highlighted() : false;
        this.image = payload.image();
    }
}
