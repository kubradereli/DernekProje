package com.dernek.proje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dernek.proje.entities.concretes.Announcement;

public interface AnnouncementDao extends JpaRepository<Announcement, Integer>{

}
