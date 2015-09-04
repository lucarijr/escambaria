package br.com.escambaria.model;

public class Item {

	private int id;
	private String desc;
	private String type;
	private String url;
	
	public Item(String desc, String type, String url) {
		this.desc = desc;
		this.type = type;
		this.url = url;
	}
	
	public Item(int id, String desc, String type, String url) {
		this.id = id;
		this.desc = desc;
		this.type = type;
		this.url = url;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
