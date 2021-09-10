package com.dernek.proje.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dernek.proje.business.abstracts.AnnouncementService;
import com.dernek.proje.entities.concretes.Announcement;

@RestController
@RequestMapping("/api/announcement")
public class AnnouncementsController {
	
	private AnnouncementService announcementService;
	
	@Autowired
	public AnnouncementsController(AnnouncementService announcementService) {
		super();
		this.announcementService = announcementService;
	}

	@GetMapping("/getall")
	public List<Announcement> getAll(){
		return this.announcementService.getAll();
	}
}
