package com.manning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class ReadingListController {

	@Autowired
	private ReadingListRepository readingListRepository;
	
	@RequestMapping(value = "/{reader}",method=RequestMethod.GET)
	public String fingByReader(@PathVariable("reader")String reader,Model model){
		List<Book> readingList = readingListRepository.findByReader(reader);
		if (null!=readingList&&!readingList.isEmpty()) {
			model.addAttribute(readingList);
		}
		return "readingList";
	}
	
	@RequestMapping(value = "/{reader}",method=RequestMethod.POST)
	public String addToReadingList(@PathVariable("reader")String reader,Book book){
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/{reader}";
	}
}
