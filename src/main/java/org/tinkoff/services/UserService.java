package org.tinkoff.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinkoff.database.entity.CatalogProfessions;
import org.tinkoff.database.entity.Mentor;
import org.tinkoff.database.entity.MentorHasCatalogProfessions;
import org.tinkoff.database.repository.CatalogProfessionsRepository;
import org.tinkoff.database.repository.MentorHasCatalogProfessionsRepository;
import org.tinkoff.database.repository.MentorRepository;
import org.tinkoff.database.repository.UserRepository;

import java.util.List;



@Service
public class UserService {
    private CatalogProfessionsRepository catalogProfessionsRepository;

    @Autowired
    public UserService(CatalogProfessionsRepository catalogProfessionsRepository)
    {
        this.catalogProfessionsRepository = catalogProfessionsRepository;
    }
    public List<MentorHasCatalogProfessions> searchExperts(String profession)
    {
        List<MentorHasCatalogProfessions> mentorsWithProfession = catalogProfessionsRepository.
                findByName(profession).get().getMentorHasCatalogProfessions();

        if(mentorsWithProfession == null)
        {
            throw new IllegalArgumentException("Does not have a mentors");
        }
        return mentorsWithProfession;
    }
}
