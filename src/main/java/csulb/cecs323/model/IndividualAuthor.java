package csulb.cecs323.model;

import javax.persistence.*;

import java.util.Set;

@Entity(name = "IndividualAuthor")
@DiscriminatorValue("IndividualAuthor")
public class IndividualAuthor extends Authoring_Entities {

	@ManyToMany(mappedBy = "teamMembers")
	private Set<AdHocTeam> teamMemberships;

	public Set<AdHocTeam> getTeamMemberships() {
		return teamMemberships;
	}

	public void setTeamMemberships(Set<AdHocTeam> teamMemberships) {
		this.teamMemberships = teamMemberships;
	}
}
