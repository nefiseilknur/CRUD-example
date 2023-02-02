package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Invitation;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {
}
