package entity;

import enums.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "normalized_name")
	private String normalizedName = fullName.toLowerCase();
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	@ManyToOne
	@Column(name="organization")
	private Organization organization;
}
	
	   
	

