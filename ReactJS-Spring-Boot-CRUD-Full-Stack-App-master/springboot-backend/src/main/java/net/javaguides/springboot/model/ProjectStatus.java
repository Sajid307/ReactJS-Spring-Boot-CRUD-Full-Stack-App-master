package net.javaguides.springboot.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class ProjectStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	@Column(name = "start_date")
	private Date pStartDate;
	@Column(name = "end_date")
	private Date pEndDate;
	@Column(name = "project_status")
	private String pStatus;
	
	@ManyToOne
	private List<Employee> empLoyee;
	
	public ProjectStatus() {
		
	}
	public ProjectStatus(Date pStartDate, Date pEndDate, String pStatus) {
		super();
		this.pStartDate = pStartDate;
		this.pEndDate = pEndDate;
		this.pStatus = pStatus;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public Date getpStartDate() {
		return pStartDate;
	}
	public void setpStartDate(Date pStartDate) {
		this.pStartDate = pStartDate;
	}
	public Date getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(Date pEndDate) {
		this.pEndDate = pEndDate;
	}
	public String getpStatus() {
		return pStatus;
	}
	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}
	
	
	
}
