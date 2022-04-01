package csulb.cecs323.model;

import javax.persistence.*;

@Entity(name = "Books")
@NamedNativeQuery(
		name="ReturnBooks",
		query=	"SELECT * " +
				"FROM BOOKS " +
				"WHERE ISBN = ? ",
		resultClass = Books.class
)
@NamedNativeQuery(
		name="ReturnAllBooks",
		query = "SELECT * " +
				"FROM   BOOKS ",
		resultClass = Books.class
)
public class Books {

	@Id
	@Column(nullable = false, length = 17)
	private String ISBN;

	@Column(nullable = false, length = 80)
	private String title;

	@Column(name = "YEAR_PUBLISHED", nullable = false)
	private int yearPublished;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AUTHORING_ENTITY_NAME", nullable = false)
	private Authoring_Entities author;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PUBLISHER_NAME", nullable = false)
	private Publishers publisher;

	public Books() {}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public Authoring_Entities getAuthor() {
		return author;
	}

	public Publishers getPublisher() {
		return publisher;
	}

	public void setISBN(String isbn) {
		this.ISBN = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void setAuthor(Authoring_Entities author) {
		this.author = author;
	}

	public void setPublisher(Publishers publisher) {
		this.publisher = publisher;
	}
}
