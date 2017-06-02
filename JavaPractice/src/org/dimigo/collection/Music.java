package org.dimigo.collection;

public class Music {
	public String title;
	public String singer;
	
	public Music(String title, String singer){
		this.title=title;
		this.singer=singer;
	}
	public String getTitle(){
		return title;
	}
	public String getSinger(){
		return singer;
	}
	public void setTitle(){
		this.title=title;
	}
	public void setSinger(){
		this.singer=singer;
	}
	
	public String toString() {
	
		return title+"("+singer+")";
	}
}
