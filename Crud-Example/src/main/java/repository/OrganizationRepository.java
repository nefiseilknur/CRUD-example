package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
