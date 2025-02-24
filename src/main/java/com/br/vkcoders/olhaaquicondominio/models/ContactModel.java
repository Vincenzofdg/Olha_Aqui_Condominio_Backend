package com.br.vkcoders.olhaaquicondominio.models;

import com.br.vkcoders.olhaaquicondominio.records.ContactRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContactModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String whatsapp;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 100)
    private String website;

    public ContactModel(ContactRecord payload) {
        this.whatsapp = payload.whatsapp();
        this.phone = payload.phone();
        this.email = payload.email();
        this.website = payload.website();
    }
}
