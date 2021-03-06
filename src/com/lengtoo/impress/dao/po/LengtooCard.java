package com.lengtoo.impress.dao.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xuming 2014-4-24 21:38:45
 * 
 * Email:xuming@coldworks.com
 */

public class LengtooCard implements Serializable{
	
	private static final long serialVersionUID = 201406241656L;
	
	private int cardid;
	private String big_imgurl;
	private String small_imgurl;
	private int and_origin_x;
	private int and_origin_y;
	private int origin_x;
	private int origin_y;
	private int and_width;
	private int and_height;
	private int width;
	private int height;
	private int origin_width;
	private int origin_height;
	private int small_width;
	private int small_height;
	private int and_origin_width;
	private int and_origin_height;
	private String default_text;
	private String upload_ip;
	private Date createdate;
	private int ontop;
	private int onshow;
	public LengtooCard() {
	}

	public LengtooCard(int cardid, String bigImgurl, String smallImgurl,
			int andOriginX, int andOriginY, int originX, int originY,
			int andWidth, int andHeight, int width, int height,
			int originWidth, int originHeight, int smallWidth, int smallHeight,
			int andOriginWidth, int andOriginHeight, String defaultText,
			String uploadIp, Date createdate, int ontop, int onshow) {
		super();
		this.cardid = cardid;
		big_imgurl = bigImgurl;
		small_imgurl = smallImgurl;
		and_origin_x = andOriginX;
		and_origin_y = andOriginY;
		origin_x = originX;
		origin_y = originY;
		and_width = andWidth;
		and_height = andHeight;
		this.width = width;
		this.height = height;
		origin_width = originWidth;
		origin_height = originHeight;
		small_width = smallWidth;
		small_height = smallHeight;
		and_origin_width = andOriginWidth;
		and_origin_height = andOriginHeight;
		default_text = defaultText;
		upload_ip = uploadIp;
		this.createdate = createdate;
		this.ontop = ontop;
		this.onshow = onshow;
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public String getBig_imgurl() {
		return big_imgurl;
	}

	public void setBig_imgurl(String bigImgurl) {
		big_imgurl = bigImgurl;
	}

	public String getSmall_imgurl() {
		return small_imgurl;
	}

	public void setSmall_imgurl(String smallImgurl) {
		small_imgurl = smallImgurl;
	}

	public int getAnd_origin_x() {
		return and_origin_x;
	}

	public void setAnd_origin_x(int andOriginX) {
		and_origin_x = andOriginX;
	}

	public int getAnd_origin_y() {
		return and_origin_y;
	}

	public void setAnd_origin_y(int andOriginY) {
		and_origin_y = andOriginY;
	}

	public int getOrigin_x() {
		return origin_x;
	}

	public void setOrigin_x(int originX) {
		origin_x = originX;
	}

	public int getOrigin_y() {
		return origin_y;
	}

	public void setOrigin_y(int originY) {
		origin_y = originY;
	}

	public int getAnd_width() {
		return and_width;
	}

	public void setAnd_width(int andWidth) {
		and_width = andWidth;
	}

	public int getAnd_height() {
		return and_height;
	}

	public void setAnd_height(int andHeight) {
		and_height = andHeight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getOrigin_width() {
		return origin_width;
	}

	public void setOrigin_width(int originWidth) {
		origin_width = originWidth;
	}

	public int getOrigin_height() {
		return origin_height;
	}

	public void setOrigin_height(int originHeight) {
		origin_height = originHeight;
	}

	public int getSmall_width() {
		return small_width;
	}

	public void setSmall_width(int smallWidth) {
		small_width = smallWidth;
	}

	public int getSmall_height() {
		return small_height;
	}

	public void setSmall_height(int smallHeight) {
		small_height = smallHeight;
	}

	public int getAnd_origin_width() {
		return and_origin_width;
	}

	public void setAnd_origin_width(int andOriginWidth) {
		and_origin_width = andOriginWidth;
	}

	public int getAnd_origin_height() {
		return and_origin_height;
	}

	public void setAnd_origin_height(int andOriginHeight) {
		and_origin_height = andOriginHeight;
	}

	public String getDefault_text() {
		return default_text;
	}

	public void setDefault_text(String defaultText) {
		default_text = defaultText;
	}

	public String getUpload_ip() {
		return upload_ip;
	}

	public void setUpload_ip(String uploadIp) {
		upload_ip = uploadIp;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public int getOntop() {
		return ontop;
	}

	public void setOntop(int ontop) {
		this.ontop = ontop;
	}

	public int getOnshow() {
		return onshow;
	}

	public void setOnshow(int onshow) {
		this.onshow = onshow;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + and_height;
		result = prime * result + and_origin_height;
		result = prime * result + and_origin_width;
		result = prime * result + and_origin_x;
		result = prime * result + and_origin_y;
		result = prime * result + and_width;
		result = prime * result
				+ ((big_imgurl == null) ? 0 : big_imgurl.hashCode());
		result = prime * result + cardid;
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((default_text == null) ? 0 : default_text.hashCode());
		result = prime * result + height;
		result = prime * result + onshow;
		result = prime * result + ontop;
		result = prime * result + origin_height;
		result = prime * result + origin_width;
		result = prime * result + origin_x;
		result = prime * result + origin_y;
		result = prime * result + small_height;
		result = prime * result
				+ ((small_imgurl == null) ? 0 : small_imgurl.hashCode());
		result = prime * result + small_width;
		result = prime * result
				+ ((upload_ip == null) ? 0 : upload_ip.hashCode());
		result = prime * result + width;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LengtooCard other = (LengtooCard) obj;
		if (and_height != other.and_height)
			return false;
		if (and_origin_height != other.and_origin_height)
			return false;
		if (and_origin_width != other.and_origin_width)
			return false;
		if (and_origin_x != other.and_origin_x)
			return false;
		if (and_origin_y != other.and_origin_y)
			return false;
		if (and_width != other.and_width)
			return false;
		if (big_imgurl == null) {
			if (other.big_imgurl != null)
				return false;
		} else if (!big_imgurl.equals(other.big_imgurl))
			return false;
		if (cardid != other.cardid)
			return false;
		if (createdate == null) {
			if (other.createdate != null)
				return false;
		} else if (!createdate.equals(other.createdate))
			return false;
		if (default_text == null) {
			if (other.default_text != null)
				return false;
		} else if (!default_text.equals(other.default_text))
			return false;
		if (height != other.height)
			return false;
		if (onshow != other.onshow)
			return false;
		if (ontop != other.ontop)
			return false;
		if (origin_height != other.origin_height)
			return false;
		if (origin_width != other.origin_width)
			return false;
		if (origin_x != other.origin_x)
			return false;
		if (origin_y != other.origin_y)
			return false;
		if (small_height != other.small_height)
			return false;
		if (small_imgurl == null) {
			if (other.small_imgurl != null)
				return false;
		} else if (!small_imgurl.equals(other.small_imgurl))
			return false;
		if (small_width != other.small_width)
			return false;
		if (upload_ip == null) {
			if (other.upload_ip != null)
				return false;
		} else if (!upload_ip.equals(other.upload_ip))
			return false;
		if (width != other.width)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "LengtooCard [and_height=" + and_height + ", and_origin_height="
				+ and_origin_height + ", and_origin_width=" + and_origin_width
				+ ", and_origin_x=" + and_origin_x + ", and_origin_y="
				+ and_origin_y + ", and_width=" + and_width + ", big_imgurl="
				+ big_imgurl + ", cardid=" + cardid + ", createdate="
				+ createdate + ", default_text=" + default_text + ", height="
				+ height + ", onshow=" + onshow + ", ontop=" + ontop
				+ ", origin_height=" + origin_height + ", origin_width="
				+ origin_width + ", origin_x=" + origin_x + ", origin_y="
				+ origin_y + ", small_height=" + small_height
				+ ", small_imgurl=" + small_imgurl + ", small_width="
				+ small_width + ", upload_ip=" + upload_ip + ", width=" + width
				+ "]";
	}

}
