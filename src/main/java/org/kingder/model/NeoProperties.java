package org.kingder.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 10:01
 */
public class NeoProperties {
	@Value("${com.neo.title}")
	private String title;
	@Value("${com.neo.description}")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
