package com.c2tc.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class LibraryService 
{
	
	@Autowired
	
	private LibraryRepository repository;
	
	public List<Library> listAll() 
	{
		return repository.findAll();
	}

	public Library get(Integer id) 
	{
		
		return repository.findById(id).get();
	}

	public void save(Library library) 
	{
		repository.save(library);
		
	}

	public void delete(Integer id) 
	{
		repository.deleteById(id);
		
	}
	
	

}
