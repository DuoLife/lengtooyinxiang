/**
* <p>Title: LengtooChartlet.java</p>
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
 * <p>Title: LengtooChartlet.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-17
 * Email: vip6ming@126.com
 */
public class LengtooChartlet implements Serializable{
	
	private static final long serialVersionUID = 201409171645L;

	private int chartletid;
	private int packageid;
	private String chartleturl;
	private String description;
	private Date createdate;
	private int numberofuse;
	private int chartletwidth;
	private int chartletheight;
	private int isshow;
	private int istop;
	public int getChartletid() {
		return chartletid;
	}
	public void setChartletid(int chartletid) {
		this.chartletid = chartletid;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public String getChartleturl() {
		return chartleturl;
	}
	public void setChartleturl(String chartleturl) {
		this.chartleturl = chartleturl;
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
	public int getChartletwidth() {
		return chartletwidth;
	}
	public void setChartletwidth(int chartletwidth) {
		this.chartletwidth = chartletwidth;
	}
	public int getChartletheight() {
		return chartletheight;
	}
	public void setChartletheight(int chartletheight) {
		this.chartletheight = chartletheight;
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
		result = prime * result + chartletheight;
		result = prime * result + chartletid;
		result = prime * result + chartletwidth;
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((chartleturl == null) ? 0 : chartleturl.hashCode());
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
		LengtooChartlet other = (LengtooChartlet) obj;
		if (chartletheight != other.chartletheight)
			return false;
		if (chartletid != other.chartletid)
			return false;
		if (chartletwidth != other.chartletwidth)
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
		if (chartleturl == null) {
			if (other.chartleturl != null)
				return false;
		} else if (!chartleturl.equals(other.chartleturl))
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
		return "LengtooChartlet [chartletheight=" + chartletheight
				+ ", chartletid=" + chartletid + ", chartletwidth="
				+ chartletwidth + ", createdate=" + createdate
				+ ", description=" + description + ", chartleturl=" + chartleturl
				+ ", isshow=" + isshow + ", istop=" + istop + ", numberofuse="
				+ numberofuse + ", packageid=" + packageid + "]";
	}
	
	
}
