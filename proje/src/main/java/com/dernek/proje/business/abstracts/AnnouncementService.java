package com.dernek.proje.business.abstracts;

import java.util.List;

import com.dernek.proje.entities.concretes.Announcement;

public interface AnnouncementService {
	List<Announcement> getAll();
}
