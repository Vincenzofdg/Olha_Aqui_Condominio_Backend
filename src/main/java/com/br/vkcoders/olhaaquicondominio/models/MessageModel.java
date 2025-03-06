package com.br.vkcoders.olhaaquicondominio.models;

import com.br.vkcoders.olhaaquicondominio.records.MessageRecord;
import com.br.vkcoders.olhaaquicondominio.utils.CustomId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "message")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MessageModel {

    @Id
    @Column(nullable = false, updatable = false, unique = true, length = 50)
    private String id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 30)
    private String surname;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String message;

    public MessageModel(MessageRecord payload) {
        this.id = CustomId.generateId();
        this.name = payload.name();
        this.surname = payload.surname();
        this.email = payload.email();
        this.message = payload.message();
    }
}
