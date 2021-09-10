package com.dernek.proje.business.abstracts;

import java.util.List;

import com.dernek.proje.entities.concretes.News;

public interface NewsService {
	List<News> getAll();
}
