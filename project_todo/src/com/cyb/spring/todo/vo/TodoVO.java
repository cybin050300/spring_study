package com.cyb.spring.todo.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("todoVO")
public class TodoVO {

	private String Tno;
	private String Title;
	private String Writer;
	private Date DueDate;
	private String Finished;

	public TodoVO() {

	}

	public TodoVO(String Tno, String Title, String Writer, Date DueDate, String Finished) {
		this.Tno = Tno;
		this.Title = Title;
		this.Writer = Writer;
		this.DueDate = DueDate;
		this.Finished = Finished;
	}
	@Override
	public String toString() {
		return "TodoVO [Tno=" + Tno + ", Title=" + Title + ", Writer=" + Writer + ", DueDate=" + DueDate + ", Finished="
				+ Finished + "]";
	}

	public String getTno() {
		return Tno;
	}

	public void setTno(String tno) {
		Tno = tno;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}

	public String getFinished() {
		return Finished;
	}

	public void setFinished(String finished) {
		Finished = finished;
	}



}
