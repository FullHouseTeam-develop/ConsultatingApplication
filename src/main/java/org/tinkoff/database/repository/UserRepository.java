package org.tinkoff.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tinkoff.database.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("select u from User u " +
//            "where u.fullName like %:fullName%")
    Optional<User> findById(Integer id);
    Optional<User> findByPassword(String password);
}
