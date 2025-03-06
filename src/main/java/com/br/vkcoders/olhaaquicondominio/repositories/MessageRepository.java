package com.br.vkcoders.olhaaquicondominio.repositories;

import com.br.vkcoders.olhaaquicondominio.models.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel, String> {
}
