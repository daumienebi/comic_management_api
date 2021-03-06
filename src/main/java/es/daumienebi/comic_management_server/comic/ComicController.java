package es.daumienebi.comic_management_server.comic;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/comics")
public class ComicController {
	
	@Autowired
	ComicService comicService;
	
	@GetMapping()
	public ArrayList<Comic> findAllComics(){
		return comicService.findAllComics();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Comic> findComicById(@PathVariable("id") Long id){
		return comicService.findComicById(id);
	}
	
	@RequestMapping(path="/{id}",method = RequestMethod.DELETE)
	public boolean deleteComicById(@PathVariable("id") Long id) {
		return comicService.deleteComicById(id);
	}
	
	@PostMapping(name = "/comics")
	public Comic saveComic(@RequestBody Comic comic) {
		return comicService.saveComic(comic);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)
	public Comic updateComic(@RequestBody Comic newComic, @PathVariable Long id) {
		
		return comicService.updateComic(newComic);
	}
}
