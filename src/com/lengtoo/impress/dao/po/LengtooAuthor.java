/**
* <p>Title: Lengtoo_author.java</p>
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

import com.lengtoo.impress.tools.Sex;

/**
 * <p>Title: Lengtoo_author.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-17
 * Email: vip6ming@126.com
 */
public class LengtooAuthor implements Serializable{
	
	private static final long serialVersionUID = 201409171643L;
	
	private int authorid;
	private String name;
	private Sex sex;
	private String headimg;
	private Date createdate;
	private String group;
	private String department;
	private int imgwidth;
	private int imgheight;
	
	public LengtooAuthor() {
	}
	public LengtooAuthor(int authorid, String name, Sex sex, String headimg,
			Date createdate, String group, String department, int imgwidth,
			int imgheight) {
		super();
		this.authorid = authorid;
		this.name = name;
		this.sex = sex;
		this.headimg = headimg;
		this.createdate = createdate;
		this.group = group;
		this.department = department;
		this.imgwidth = imgwidth;
		this.imgheight = imgheight;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getHeadimg() {
		return headimg;
	}
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	@Override
	public String toString() {
		return "LengtooAuthor [authorid=" + authorid + ", createdate="
				+ createdate + ", department=" + department + ", group="
				+ group + ", headimg=" + headimg + ", imgheight=" + imgheight
				+ ", imgwidth=" + imgwidth + ", name=" + name + ", sex=" + sex
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorid;
		result = prime * result
				+ ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((headimg == null) ? 0 : headimg.hashCode());
		result = prime * result + imgheight;
		result = prime * result + imgwidth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		LengtooAuthor other = (LengtooAuthor) obj;
		if (authorid != other.authorid)
			return false;
		if (createdate == null) {
			if (other.createdate != null)
				return false;
		} else if (!createdate.equals(other.createdate))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (headimg == null) {
			if (other.headimg != null)
				return false;
		} else if (!headimg.equals(other.headimg))
			return false;
		if (imgheight != other.imgheight)
			return false;
		if (imgwidth != other.imgwidth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
}
