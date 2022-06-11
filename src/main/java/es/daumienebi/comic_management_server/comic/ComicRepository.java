package es.daumienebi.comic_management_server.comic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {

}
