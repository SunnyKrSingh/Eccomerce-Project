package com.ecm.common;

public enum OrderTypeEnum {
	Cart("Cart"), WishList("Wish  List");
    private String id;

    private OrderTypeEnum(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }
}
