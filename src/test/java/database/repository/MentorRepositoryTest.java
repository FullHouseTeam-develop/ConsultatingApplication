package database.repository;

import annotation.IntegrationTest;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.tinkoff.database.repository.MentorRepository;
import org.tinkoff.database.repository.UserRepository;

@IntegrationTest
@RequiredArgsConstructor
public class MentorRepositoryTest {
    private final MentorRepository mentorRepository;

    private static final Integer ivanId = 8;

    @Test
    void findById()
    {
    }

}
