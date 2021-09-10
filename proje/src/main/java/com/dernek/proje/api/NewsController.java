package com.dernek.proje.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dernek.proje.business.abstracts.NewsService;
import com.dernek.proje.entities.concretes.News;

@RestController
@RequestMapping("/api/news")
public class NewsController {
	
	private NewsService newsService;
	
	@Autowired
	public NewsController(NewsService newsService) {
		super();
		this.newsService = newsService;
	}

	@GetMapping("/getall")
	public List<News> getAll(){
		return this.newsService.getAll();
	}
}
