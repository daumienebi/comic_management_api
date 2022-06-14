package es.daumienebi.comic_management_server.collection;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.daumienebi.comic_management_server.comic.Comic;

@RestController
@RequestMapping(path = "/collections")
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
	
	@DeleteMapping(path="/{id}")
	public boolean deleteCollectionById(@PathVariable("id") Long id){
		return collectionService.deleteCollectionById(id);
	}
	/*
	@GetMapping()
	public ArrayList<Comic> findComics(){
		return collectionService.findComics();
	}
	*/
	
	//@RequestMapping(name = "/collections", method = RequestMethod.POST)
	@PostMapping(name = "collections",consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection saveCollection(@RequestBody Collection collection) {
		return collectionService.saveCollection(collection);
	}
}
