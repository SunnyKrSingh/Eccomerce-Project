package com.ecm.common;

public enum SizeEnum {
	S("Small"), M("Medium") ,L("Large"), XL("Extra Large");
	private String id;

	private SizeEnum(String id) {
		this.id = id;

	}

	public String getId() {
		return id;
	}
}
