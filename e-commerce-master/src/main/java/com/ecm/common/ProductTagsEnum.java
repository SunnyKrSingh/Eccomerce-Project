package com.ecm.common;

public enum ProductTagsEnum {
	Sale("Sale!"), Sold_Out("Sold Out!"), Hot("HOT!");
    private String id;

    private ProductTagsEnum(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }
}
