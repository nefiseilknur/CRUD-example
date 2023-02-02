package entity;

import enums.InvitationStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="invitations")
public class Invitation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "invitation")
	private Long invitationId;
	@OneToOne
	private User user;
	@Column(name = "message")
	private String invitationMsg;
	@Column(name = "invitation_statu")
	private InvitationStatus invitationStatus;

	
	

}
	
	
