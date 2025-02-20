package EcomUserAuthServiceFinal.EcomUserAuthServiceFinal.repository;

import EcomUserAuthServiceFinal.EcomUserAuthServiceFinal.entity.Role;
import EcomUserAuthServiceFinal.EcomUserAuthServiceFinal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
}
