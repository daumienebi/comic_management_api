package es.daumienebi.comic_management_server.comic;
import java.time.LocalDate;

import javax.persistence.*;

public class Comic {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate adquisition_date;
	private String image;
	private int collection_id;
	private String state;
	private int number;
	
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
	public LocalDate getAdquisition_date() {
		return adquisition_date;
	}
	public void setAdquisition_date(LocalDate adquisition_date) {
		this.adquisition_date = adquisition_date;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCollection_id() {
		return collection_id;
	}
	public void setCollection_id(int collection_id) {
		this.collection_id = collection_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}