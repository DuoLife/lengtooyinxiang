/**
* <p>Title: LengtooIllustration.java</p>
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
 * <p>Title: LengtooIllustration.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-17
 * Email: vip6ming@126.com
 */
public class LengtooChartletIllustration implements Serializable{

	private static final long serialVersionUID = 201409171720L;
	
	private int illustrationid;
	private int packageid;
	private String illustrationurl;
	private String description;
	private Date createdate;
	private int numberofuse;
	private int illustrationwidth;
	private int illustrationheight;
	private int isshow;
	private int istop;
	public int getIllustrationid() {
		return illustrationid;
	}
	public void setIllustrationid(int illustrationid) {
		this.illustrationid = illustrationid;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public String getIllustrationurl() {
		return illustrationurl;
	}
	public void setIllustrationurl(String illustrationurl) {
		this.illustrationurl = illustrationurl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getIllustrationwidth() {
		return illustrationwidth;
	}
	public void setIllustrationwidth(int illustrationwidth) {
		this.illustrationwidth = illustrationwidth;
	}
	public int getIllustrationheight() {
		return illustrationheight;
	}
	public void setIllustrationheight(int illustrationheight) {
		this.illustrationheight = illustrationheight;
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
		result = prime * result + illustrationheight;
		result = prime * result + illustrationid;
		result = prime * result
				+ ((illustrationurl == null) ? 0 : illustrationurl.hashCode());
		result = prime * result + illustrationwidth;
		result = prime * result + isshow;
		result = prime * result + istop;
		result = prime * result + numberofuse;
		result = prime * result + packageid;
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
		LengtooChartletIllustration other = (LengtooChartletIllustration) obj;
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
		if (illustrationheight != other.illustrationheight)
			return false;
		if (illustrationid != other.illustrationid)
			return false;
		if (illustrationurl == null) {
			if (other.illustrationurl != null)
				return false;
		} else if (!illustrationurl.equals(other.illustrationurl))
			return false;
		if (illustrationwidth != other.illustrationwidth)
			return false;
		if (isshow != other.isshow)
			return false;
		if (istop != other.istop)
			return false;
		if (numberofuse != other.numberofuse)
			return false;
		if (packageid != other.packageid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LengtooIllustration [createdate=" + createdate
				+ ", description=" + description + ", illustrationheight="
				+ illustrationheight + ", illustrationid=" + illustrationid
				+ ", illustrationurl=" + illustrationurl
				+ ", illustrationwidth=" + illustrationwidth + ", isshow="
				+ isshow + ", istop=" + istop + ", numberofuse=" + numberofuse
				+ ", packageid=" + packageid + "]";
	}
	
}
