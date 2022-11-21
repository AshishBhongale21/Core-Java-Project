package com.jspider.musicplayer.entity;

public class Songs {
	
	private int id;
	private String name;
	private String movie;
	private String singer;
	private String lyricist;
	private double duration;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMovie() {
		return movie;
	}
	public String getSinger() {
		return singer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public double getDuration() {
		return duration;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Songs [id=" + id + ", name=" + name + ", movie=" + movie + ", singer=" + singer + ", lyricist="
				+ lyricist + ", duration=" + duration + "]";
	}
	

}
