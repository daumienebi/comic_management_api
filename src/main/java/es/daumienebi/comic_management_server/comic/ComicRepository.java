package es.daumienebi.comic_management_server.comic;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long>{

	public ArrayList<Comic> findByName(String name);
}
