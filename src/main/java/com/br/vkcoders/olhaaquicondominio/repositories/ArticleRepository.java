package com.br.vkcoders.olhaaquicondominio.repositories;

import com.br.vkcoders.olhaaquicondominio.models.ArticleModel;
import org.springframework.data.jpa.repository.JpaRepository;

// <entity type, type of primary key>
public interface ArticleRepository extends JpaRepository<ArticleModel, String> {
}
