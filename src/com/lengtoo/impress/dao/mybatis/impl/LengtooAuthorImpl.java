/**
* <p>Title: LengtooAuthorImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-19
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooAuthorDao;
import com.lengtoo.impress.dao.po.LengtooAuthor;

/**
 * <p>Title: LengtooAuthorImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public class LengtooAuthorImpl extends SqlSessionDaoSupport implements ILengtooAuthorDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooAuthorDao#getAuthorMesgById_client(java.util.Map)
	 */
	public Map getAuthorMesgById_client(Map paramsMap) {
		Map result = new HashMap();
		LengtooAuthor obj = (LengtooAuthor) getSqlSession().selectOne("LengtooAuthor.selectById", paramsMap);
		if(obj != null) {
			result.put("authorid", obj.getAuthorid());
			result.put("name", obj.getName());
			result.put("sex", obj.getSex());
			result.put("group", obj.getGroup());
			result.put("department", obj.getDepartment());
			result.put("createdate", obj.getCreatedate());
	//		result.put("headimg", obj.getHeadimg());
	//		result.put("imgwidth", obj.getImgwidth());
	//		result.put("imgheight", obj.getImgheight());
		}
		return result;
	}

}
