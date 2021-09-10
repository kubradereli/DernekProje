package com.dernek.proje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dernek.proje.business.abstracts.AnnouncementService;
import com.dernek.proje.dataAccess.abstracts.AnnouncementDao;
import com.dernek.proje.entities.concretes.Announcement;

@Service
public class AnnouncementManager implements AnnouncementService {

	private AnnouncementDao announcementDao;
	
	@Autowired
	public AnnouncementManager(AnnouncementDao announcementDao) {
		super();
		this.announcementDao = announcementDao;
	}

	@Override
	public List<Announcement> getAll() {
		return this.announcementDao.findAll();
	}

}
