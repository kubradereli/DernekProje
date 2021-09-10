package com.dernek.proje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dernek.proje.entities.concretes.Activity;

public interface ActivityDao extends JpaRepository<Activity, Integer>{

}
