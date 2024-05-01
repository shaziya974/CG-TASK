package com.c2tc.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController 
{
	
	@Autowired
	private LibraryService service;
	
	
	@GetMapping("/liraray")
	public List<Library> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/library/{id}")
	public ResponseEntity<Library> get (@PathVariable Integer id)
	{
		Library library = service.get(id);
		return new ResponseEntity<Library>(library, HttpStatus.OK);
	}
	@PostMapping("/library")
	public void add(@RequestBody Library library)
	{
		service.save(library);
	}
	
	@PutMapping("/library/{id}")
	public ResponseEntity<?> update (@RequestBody Library library,@PathVariable Integer Id)
	{
		try 
		{
			Library existLibrary = service.get(Id);
			service.save(library);
			return new ResponseEntity<Library>(library, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
				
	}
	
	@DeleteMapping("/library/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}


}
