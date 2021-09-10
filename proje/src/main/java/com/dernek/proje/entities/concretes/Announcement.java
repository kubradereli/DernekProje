package com.dernek.proje.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="activities")
public class Announcement extends Activity{

	@Column(name="news_link")
	private String newsLink;

	public Announcement() {}
	
	public Announcement(int id, String topic, String content, Date validityDate, String newsLink) {
		super(id, topic, content, validityDate);
		this.newsLink = newsLink;
	}
}
