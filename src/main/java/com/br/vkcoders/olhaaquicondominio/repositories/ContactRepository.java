package com.br.vkcoders.olhaaquicondominio.repositories;

import com.br.vkcoders.olhaaquicondominio.models.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactModel, String> {
}
