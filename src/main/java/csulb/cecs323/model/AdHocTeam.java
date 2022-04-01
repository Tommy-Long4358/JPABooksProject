package csulb.cecs323.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "AdHocTeam")
@DiscriminatorValue("AdHocTeam")
public class AdHocTeam extends Authoring_Entities {

	@ManyToMany
	@JoinTable(
			name = "AD_HOC_TEAMS_MEMBER",
			joinColumns = @JoinColumn(name = "AD_HOC_TEAMS_EMAIL"),
			inverseJoinColumns = @JoinColumn(name = "INDIVIDUAL_AUTHORS_EMAIL")
	)
	private Set<IndividualAuthor> teamMembers;

	public Set<IndividualAuthor> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(Set<IndividualAuthor> teamMembers) {
		this.teamMembers = teamMembers;
	}
}
