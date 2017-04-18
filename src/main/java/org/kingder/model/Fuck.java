package org.kingder.model;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/14 10:23
 */
public class Fuck {
	private final long id;
	private final String content;

	public Fuck(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
