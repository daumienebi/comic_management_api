package es.daumienebi.comic_management_server.collection;

import java.util.Optional;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

import es.daumienebi.comic_management_server.comic.Comic;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

	public Optional<Collection> findByName(String name);
	
	//public ArrayList<Comic> findComics();
}
