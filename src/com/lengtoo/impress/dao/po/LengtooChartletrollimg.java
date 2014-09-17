/**
* <p>Title: LengtooChartletrollimg.java</p>
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
 * <p>Title: LengtooChartletrollimg.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-17
 * Email: vip6ming@126.com
 */
public class LengtooChartletrollimg implements Serializable{

	private static final long serialVersionUID = 201409171803L;

	private int rollimgid;
	private String rollimgurl;
	private int imgwidth;
	private int imgheight;
	private String title;
	private String description;
	private int type;
	private String target;
	private Date createdate;
	private int isshow;
	private int istop;
	public int getRollimgid() {
		return rollimgid;
	}
	public void setRollimgid(int rollimgid) {
		this.rollimgid = rollimgid;
	}
	public String getRollimgurl() {
		return rollimgurl;
	}
	public void setRollimgurl(String rollimgurl) {
		this.rollimgurl = rollimgurl;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + imgheight;
		result = prime * result + imgwidth;
		result = prime * result + isshow;
		result = prime * result + istop;
		result = prime * result + rollimgid;
		result = prime * result
				+ ((rollimgurl == null) ? 0 : rollimgurl.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + type;
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
		LengtooChartletrollimg other = (LengtooChartletrollimg) obj;
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
		if (imgheight != other.imgheight)
			return false;
		if (imgwidth != other.imgwidth)
			return false;
		if (isshow != other.isshow)
			return false;
		if (istop != other.istop)
			return false;
		if (rollimgid != other.rollimgid)
			return false;
		if (rollimgurl == null) {
			if (other.rollimgurl != null)
				return false;
		} else if (!rollimgurl.equals(other.rollimgurl))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LengtooChartletrollimg [createdate=" + createdate
				+ ", description=" + description + ", imgheight=" + imgheight
				+ ", imgwidth=" + imgwidth + ", isshow=" + isshow + ", istop="
				+ istop + ", rollimgid=" + rollimgid + ", rollimgurl="
				+ rollimgurl + ", target=" + target + ", title=" + title
				+ ", type=" + type + "]";
	}
	
}
