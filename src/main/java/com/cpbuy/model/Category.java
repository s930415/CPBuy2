package com.cpbuy.model;

public class Category {

	private Integer id;
	private Integer up_id;
	private String name;
	private String show;
	private Integer sort;
	private String icon;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setUp_id(Integer up_id) {
		this.up_id = up_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUp_id() {
		return up_id;
	}

	public void setUp_id2(Integer up_id) {
		this.up_id = up_id;
	}

}
