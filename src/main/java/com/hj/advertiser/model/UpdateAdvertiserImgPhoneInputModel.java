package com.hj.advertiser.model;

import java.io.Serializable;

public class UpdateAdvertiserImgPhoneInputModel implements Serializable {
	private static final long serialVersionUID = 2198552330705175503L;
	private Long advertiserId;
	private String bdUid;
	private String imgTel;
	
	public Long getAdvertiserId() {
		return advertiserId;
	}
	public void setAdvertiserId(Long advertiserId) {
		this.advertiserId = advertiserId;
	}
	public String getBdUid() {
		return bdUid;
	}
	public void setBdUid(String bdUid) {
		this.bdUid = bdUid;
	}
	public String getImgTel() {
		return imgTel;
	}
	public void setImgTel(String imgTel) {
		this.imgTel = imgTel;
	}

}
