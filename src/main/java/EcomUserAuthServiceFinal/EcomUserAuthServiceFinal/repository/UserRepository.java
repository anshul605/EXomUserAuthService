package EcomUserAuthServiceFinal.EcomUserAuthServiceFinal.repository;

import EcomUserAuthServiceFinal.EcomUserAuthServiceFinal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmailId(String emailId);
    Optional<User> findByToken(String token);
}
