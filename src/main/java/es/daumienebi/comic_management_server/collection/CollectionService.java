package es.daumienebi.comic_management_server.collection;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

	@Autowired
	CollectionRepository collectionRepository;
	
	public ArrayList<Collection> findAllCollections(){
		return (ArrayList<Collection>) collectionRepository.findAll();
	}
	
	public Optional<Collection> findCollectionById(Long id) {
		return collectionRepository.findById(id);
	}
	
	public Optional<Collection> findCollectionByName(String name) {
		return collectionRepository.findByName(name);
	}
	
	public Collection saveCollection(Collection collection) {
		return collectionRepository.save(collection);
	}
	
	public boolean deleteCollectionById(Long id) {
		try {
			collectionRepository.deleteById(id);
			return true; //if the collection gets deleted
		}catch(Exception e) {
			return false;
		}
	}
}
