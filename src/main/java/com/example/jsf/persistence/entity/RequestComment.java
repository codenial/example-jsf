package com.example.jsf.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "request_comments")
public class RequestComment {

	@Id
	@GeneratedValue(generator="commentSequence") 
	@SequenceGenerator(name="commentSequence",sequenceName="comment_sequence", allocationSize=1)
	@Column(name = "comment_id")
	private long commentId;
	@Column(name = "request_id")
	private String requestId;
	@Column(name = "comment_text")
	private String comment;
	@Column(name = "published_at")
	private Date publishedAt;
	@Column(name = "published_by")
	private String publishedBy;
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Date getPublishedAt() {
		return publishedAt;
	}
	
	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getPublishedBy() {
		return publishedBy;
	}

	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
