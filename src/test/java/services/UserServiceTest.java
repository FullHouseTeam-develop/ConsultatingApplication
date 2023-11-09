package services;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tinkoff.database.entity.MentorHasCatalogProfessions;
import org.tinkoff.database.repository.CatalogProfessionsRepository;
import org.tinkoff.services.UserService;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest(classes = UserService.class)
@RequiredArgsConstructor
public class UserServiceTest {

    @Autowired
    private CatalogProfessionsRepository catalogProfessionsRepository = new CatalogProfessionsRepository(){};

    private UserService userService = new UserService(catalogProfessionsRepository);
    @Test
    public void searchExpertsTest()
    {
        List<MentorHasCatalogProfessions> testList = userService.searchExperts("ничего");
       assertThat(testList).isNotNull();
    }
}
