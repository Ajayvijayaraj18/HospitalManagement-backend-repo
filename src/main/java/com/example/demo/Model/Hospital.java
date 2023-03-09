package com.example.demo.Model;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospitalinfo")
public class Hospital {
@Id
@Column(name="id")
private int id;
@Column(name="pname")
private String pname;
@Column(name="dname")
private String dname;
@Column(name="disname")
private String disname;
@Column(name="time")
private Float time;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getDisname() {
	return disname;
}

public void setDisname(String disname) {
	this.disname = disname;
}

public Float getTime() {
	return time;
}

public void setTime(Float time) {
	this.time = time;
}

@Override
public String toString() {
	return "Hospital [id=" + id + ", pname=" + pname + ", dname=" + dname + ", disname=" + disname + ", time=" + time
			+ "]";
}

public Hospital() {
	
}

}
