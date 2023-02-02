package entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "organizations")
public class Organization extends BaseEntity {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "organization_name")
	private String organizationName;
	@Column(name = "normalized_organization_name")
	private String normalizedOrganizationName;
	@Column(name = "registry_number")
	private String registryNumber;
	@Column(name = "contact_email")
	private String contactEmail;
	@Column(name = "year_founded")
	private Date yearFounded;
	@Column(name = "phone")
	private Long phone;
	@Column(name = "company_size")
	private Long companySize;
}
