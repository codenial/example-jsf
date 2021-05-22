package com.example.jsf.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "request_follow_up")
public class RequestFollowUp {
	
	@Id
	@Column(name = "request_id")
	private String requestId;
	@OneToOne
	@JoinColumn(name = "prospect_id")
	private Prospect prospect;
	@Column(name = "request_open")
	private boolean isOpen;
	@Column(name = "request_created_at")
	private Date createdAt;
	@Column(name = "request_closed_at")
	private Date closedAt;
	@OneToMany
	@JoinColumn(referencedColumnName = "request_id")
	private List<RequestComment> comments;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Prospect getProspect() {
		return prospect;
	}
	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getClosedAt() {
		return closedAt;
	}
	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}
	public List<RequestComment> getComments() {
		return comments;
	}
	public void setComments(List<RequestComment> comments) {
		this.comments = comments;
	}
	
}
