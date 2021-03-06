package com.manning;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ReadingListRepository extends JpaRepository<Book, Long> {
	
	public List<Book> findByReader(String reader);

}
