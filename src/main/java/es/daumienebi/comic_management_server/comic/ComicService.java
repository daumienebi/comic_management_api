package es.daumienebi.comic_management_server.comic;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ComicService {

	ComicRepository comicRepository;
	
	public ArrayList<Comic> findAllComics(){
		return (ArrayList<Comic>)comicRepository.findAll();
	}
	
	public Comic saveComic(Comic comic) {
		return comicRepository.save(comic);
	}
	
	//Optional incase no response in received
	public Optional<Comic> findComicById(Long id){
		return comicRepository.findById(id);
	}
	
	public boolean deleteComicById(Long id) {
		try {
			comicRepository.deleteById(id);
			return true; //if the comic gets deleted
		}catch(Exception e) {
			return false;
		}
	}
	
	public ArrayList<Comic> findByNameOrCollection(){
		return comicRepository.findByNameOrCollection();
	}
}
