package es.daumienebi.comic_management_server.collection;
import javax.persistence.*;

@Entity
@Table(name = "collection")
public class Collection {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	
	private Long id;
	private String name;
	private String image;
	
	public Collection(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
