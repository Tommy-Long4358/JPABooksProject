package csulb.cecs323.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "WritingGroup")
@DiscriminatorValue("WritingGroup")
public class Writing_Groups extends Authoring_Entities {

	@Column(length = 80)
	private String headWriter;

	@Column
	private int yearFormed;

	public String getHeadWriter() {
		return headWriter;
	}

	public int getYearFormed() {
		return yearFormed;
	}

	public void setHeadWriter(String headWriter) {
		this.headWriter = headWriter;
	}

	public void setYearFormed(int yearFormed) {
		this.yearFormed = yearFormed;
	}
}
