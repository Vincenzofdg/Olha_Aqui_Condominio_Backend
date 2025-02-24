package com.br.vkcoders.olhaaquicondominio.models;

import com.br.vkcoders.olhaaquicondominio.records.LawRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "law")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class LawModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 250)
    private String description;

    @Column(nullable = false, length = 100)
    private String link;

    @Column(nullable = false, length = 50)
    private String source;

    public LawModel(LawRecord payload) {
        this.title = payload.title();
        this.description = payload.description();
        this.link = payload.link();
        this.source = payload.source();
    }
}
