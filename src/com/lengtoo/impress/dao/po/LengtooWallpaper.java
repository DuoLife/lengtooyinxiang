/**
* <p>Title: LengtooWallpaper.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-22
* @version 1.0
*/
package com.lengtoo.impress.dao.po;

import java.util.Date;

/**
 * <p>Title: LengtooWallpaper.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-22
 * Email: vip6ming@126.com
 */
public class LengtooWallpaper {

private static final long serialVersionUID = 201406241657L;
	
	private int wallpaperid;
	private String big_imgurl;
	private String small_imgurl;
	private int width;
	private int height;
	private int small_width;
	private int small_height;
	private String default_text;
	private String upload_ip;
	private Date createdate;
	private int ontop;
	private int onshow;
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
	public int getWallpaperid() {
		return wallpaperid;
	}
	public void setWallpaperid(int wallpaperid) {
		this.wallpaperid = wallpaperid;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((big_imgurl == null) ? 0 : big_imgurl.hashCode());
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((default_text == null) ? 0 : default_text.hashCode());
		result = prime * result + height;
		result = prime * result + onshow;
		result = prime * result + ontop;
		result = prime * result + small_height;
		result = prime * result
				+ ((small_imgurl == null) ? 0 : small_imgurl.hashCode());
		result = prime * result + small_width;
		result = prime * result
				+ ((upload_ip == null) ? 0 : upload_ip.hashCode());
		result = prime * result + wallpaperid;
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
		LengtooWallpaper other = (LengtooWallpaper) obj;
		if (big_imgurl == null) {
			if (other.big_imgurl != null)
				return false;
		} else if (!big_imgurl.equals(other.big_imgurl))
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
		if (wallpaperid != other.wallpaperid)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LengtooWallpaper [big_imgurl=" + big_imgurl + ", createdate="
				+ createdate + ", default_text=" + default_text + ", height="
				+ height + ", onshow=" + onshow + ", ontop=" + ontop
				+ ", small_height=" + small_height + ", small_imgurl="
				+ small_imgurl + ", small_width=" + small_width
				+ ", upload_ip=" + upload_ip + ", wallpaperid=" + wallpaperid
				+ ", width=" + width + "]";
	}
	
	public LengtooWallpaper() {
	}
	public LengtooWallpaper(int wallpaperid, String bigImgurl,
			String smallImgurl, int width, int height, int smallWidth,
			int smallHeight, String defaultText, String uploadIp,
			Date createdate, int ontop, int onshow) {
		super();
		this.wallpaperid = wallpaperid;
		big_imgurl = bigImgurl;
		small_imgurl = smallImgurl;
		this.width = width;
		this.height = height;
		small_width = smallWidth;
		small_height = smallHeight;
		default_text = defaultText;
		upload_ip = uploadIp;
		this.createdate = createdate;
		this.ontop = ontop;
		this.onshow = onshow;
	}
	
	
	
}
