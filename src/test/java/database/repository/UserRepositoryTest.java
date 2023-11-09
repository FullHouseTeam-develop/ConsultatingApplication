package database.repository;

import annotation.IntegrationTest;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.tinkoff.database.repository.UserRepository;

@IntegrationTest
@RequiredArgsConstructor
public class UserRepositoryTest {

    private final UserRepository userRepository;

    private static final Integer ivanId = 8;

    @Test
    void checkFindById() {
        var user = userRepository.findById(ivanId);
        System.out.println(user.get().getFullName());
    }

    @Test
    void checkFindByPassword() {
        var user = userRepository.findByPassword("asdsddas");
        System.out.println(user.get().getFullName());
    }
}
