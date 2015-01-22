/**
* <p>Title: LengtooEmojipackage.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-17
* @version 1.0
*/
package com.lengtoo.impress.dao.po;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: LengtooEmojipackage.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-17
 * Email: vip6ming@126.com
 */
public class LengtooEmojipackage implements Serializable{

	private static final long serialVersionUID = 201409171702L;
	
	private int emojipackageid;
	private String thumbnailurl;
	private String title;
	private String description;
	private String zipurl;
	private Date createdate;
	private int numberofuse;
	private int emojitotal;
	private int authorid;
	private int imgwidth;
	private int imgheight;
	private int isshow;
	private int istop;
	private int isnew;
	public int getEmojipackageid() {
		return emojipackageid;
	}
	public void setEmojipackageid(int emojipackageid) {
		this.emojipackageid = emojipackageid;
	}
	public String getThumbnailurl() {
		return thumbnailurl;
	}
	public void setThumbnailurl(String thumbnailurl) {
		this.thumbnailurl = thumbnailurl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getZipurl() {
		return zipurl;
	}
	public void setZipurl(String zipurl) {
		this.zipurl = zipurl;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public int getNumberofuse() {
		return numberofuse;
	}
	public void setNumberofuse(int numberofuse) {
		this.numberofuse = numberofuse;
	}
	public int getEmojitotal() {
		return emojitotal;
	}
	public void setEmojitotal(int emojitotal) {
		this.emojitotal = emojitotal;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public int getImgwidth() {
		return imgwidth;
	}
	public void setImgwidth(int imgwidth) {
		this.imgwidth = imgwidth;
	}
	public int getImgheight() {
		return imgheight;
	}
	public void setImgheight(int imgheight) {
		this.imgheight = imgheight;
	}
	public int getIsshow() {
		return isshow;
	}
	public void setIsshow(int isshow) {
		this.isshow = isshow;
	}
	public int getIstop() {
		return istop;
	}
	public void setIstop(int istop) {
		this.istop = istop;
	}
	public int getIsnew() {
		return isnew;
	}
	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorid;
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + emojipackageid;
		result = prime * result + emojitotal;
		result = prime * result + imgheight;
		result = prime * result + imgwidth;
		result = prime * result + isnew;
		result = prime * result + isshow;
		result = prime * result + istop;
		result = prime * result + numberofuse;
		result = prime * result
				+ ((thumbnailurl == null) ? 0 : thumbnailurl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((zipurl == null) ? 0 : zipurl.hashCode());
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
		LengtooEmojipackage other = (LengtooEmojipackage) obj;
		if (authorid != other.authorid)
			return false;
		if (createdate == null) {
			if (other.createdate != null)
				return false;
		} else if (!createdate.equals(other.createdate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (emojipackageid != other.emojipackageid)
			return false;
		if (emojitotal != other.emojitotal)
			return false;
		if (imgheight != other.imgheight)
			return false;
		if (imgwidth != other.imgwidth)
			return false;
		if (isnew != other.isnew)
			return false;
		if (isshow != other.isshow)
			return false;
		if (istop != other.istop)
			return false;
		if (numberofuse != other.numberofuse)
			return false;
		if (thumbnailurl == null) {
			if (other.thumbnailurl != null)
				return false;
		} else if (!thumbnailurl.equals(other.thumbnailurl))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (zipurl == null) {
			if (other.zipurl != null)
				return false;
		} else if (!zipurl.equals(other.zipurl))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LengtooEmojipackage [authorid=" + authorid + ", createdate="
				+ createdate + ", description=" + description
				+ ", emojipackageid=" + emojipackageid + ", emojitotal="
				+ emojitotal + ", imgheight=" + imgheight + ", imgwidth="
				+ imgwidth + ", isnew=" + isnew + ", isshow=" + isshow
				+ ", istop=" + istop + ", numberofuse=" + numberofuse
				+ ", thumbnailurl=" + thumbnailurl + ", title=" + title
				+ ", zipurl=" + zipurl + "]";
	}

}
