package com.dernek.proje.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="activities")
public class Activity {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="content")
	private String content;
	
	@Column(name="validity_date")
	private Date validityDate;
	
	public Activity() {}
	
	public Activity(int id, String topic, String content, Date validityDate) {
		super();
		this.id = id;
		this.topic = topic;
		this.content = content;
		this.validityDate = validityDate;
	}
}
