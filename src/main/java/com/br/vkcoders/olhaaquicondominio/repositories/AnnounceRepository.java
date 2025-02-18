package com.br.vkcoders.olhaaquicondominio.repositories;

import com.br.vkcoders.olhaaquicondominio.models.AnnounceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnounceRepository extends JpaRepository<AnnounceModel, Long> {
}
