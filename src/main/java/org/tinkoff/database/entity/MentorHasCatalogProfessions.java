package org.tinkoff.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mentor_has_catalog_professions")
public class MentorHasCatalogProfessions {

    @EmbeddedId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_professions_id")
    private CatalogProfessions catalogProfessions;

    @EmbeddedId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_mentor_id")
    private Mentor mentor;

    public void setCatalogProfessions(CatalogProfessions catalogProfessions) {
        this.catalogProfessions = catalogProfessions;
        this.catalogProfessions.getMentorHasCatalogProfessions().add(this);
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
        this.mentor.getMentorHasCatalogProfessions().add(this);
    }
}
