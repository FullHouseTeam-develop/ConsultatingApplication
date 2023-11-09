package org.tinkoff.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tinkoff.database.entity.CatalogProfessions;

@Repository
public interface MentorHasCatalogProfessionsRepository extends JpaRepository<CatalogProfessions, Integer> {

}
