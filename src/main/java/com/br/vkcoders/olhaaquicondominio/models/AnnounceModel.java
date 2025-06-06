package com.br.vkcoders.olhaaquicondominio.models;

import com.br.vkcoders.olhaaquicondominio.records.AnnounceRecord;
import com.br.vkcoders.olhaaquicondominio.utils.CustomId;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "advertising")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AnnounceModel {

    @Id
    @Column(nullable = false, updatable = false, unique = true, length = 50)
    private String id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 50)
    private String auth;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 20)
    private String whatsapp;

    @Column(nullable = false, length = 50)
    private String tag;

    @Column(length = 500)
    private String image;

    @Column(nullable = false, length = 50)
    private String target;

    private Boolean highlighted;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public AnnounceModel(AnnounceRecord payload) {
        String generateId = CustomId.generateId();

        this.id = generateId;
        this.title = payload.title();
        this.auth = payload.auth();
        this.phone = payload.phone();
        this.whatsapp = payload.whatsapp();
        this.tag = payload.tag();
        this.target = payload.target() != null ? payload.target() : "condominium";
        this.highlighted = payload.highlighted() != null ? payload.highlighted() : false;
        this.image = "/images/announce/" + generateId + ".jpg";
    }
}
