package com.dernek.proje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dernek.proje.entities.concretes.News;

public interface NewsDao extends JpaRepository<News, Integer>{

}
