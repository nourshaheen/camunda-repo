package com.camunda.bpm.camunda_bpm.dto;

public class PostDto {

	private Long id;
	private Long userId;
	private String title;
	private String body;

	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostDto(Long id, Long userId, String title, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
