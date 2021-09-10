package com.dernek.proje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dernek.proje.business.abstracts.NewsService;
import com.dernek.proje.dataAccess.abstracts.NewsDao;
import com.dernek.proje.entities.concretes.News;

@Service
public class NewsManager implements NewsService {

	private NewsDao newsDao;

	@Autowired
	public NewsManager(NewsDao newsDao) {
		super();
		this.newsDao = newsDao;
	}

	@Override
	public List<News> getAll() {
		return this.newsDao.findAll();
	}

}
