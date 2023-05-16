package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotations {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public annotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "annotations [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Start");
	}
	@PreDestroy
	public void end() {
		System.out.println("END");
	}
}
