package es.daumienebi.comic_management_server.comic;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {

	//To be created automatically
	public ArrayList<Comic> findByNameOrCollection();
}
