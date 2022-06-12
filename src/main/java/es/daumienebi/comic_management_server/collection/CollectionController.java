package es.daumienebi.comic_management_server.collection;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/collectios")
public class CollectionController {

	@Autowired
	CollectionService collectionService;
	
	@GetMapping()
	public ArrayList<Collection> findAllCollections(){
		return collectionService.findAllCollections();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Collection> findCollectionById(@PathVariable("id") Long id){
		return collectionService.findCollectionById(id);
	}
	
	@PostMapping("/collections")
	public Collection saveCollection(@RequestBody Collection collection) {
		return collectionService.saveCollection(collection);
	}
}
