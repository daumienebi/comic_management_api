package es.daumienebi.comic_management_server.collection;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

	public Optional<Collection> findByName(String name);
}
