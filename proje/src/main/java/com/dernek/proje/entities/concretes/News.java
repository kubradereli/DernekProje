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
public class News extends Activity {
	
	@Column(name="image")
	private String image;
	
	public News() {}

	public News(int id, String topic, String content, Date validityDate, String image) {
		super(id, topic, content, validityDate);
		this.image = image;
	}
}
