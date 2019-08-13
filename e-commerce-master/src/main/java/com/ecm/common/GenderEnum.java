package com.ecm.common;

public enum GenderEnum {
	Men("Men"), Women("Women"), Unisexual("Unisexual");
	private String id;

	private GenderEnum(String id) {
		this.id = id;

	}

	public String getId() {
		return id;
	}
}
