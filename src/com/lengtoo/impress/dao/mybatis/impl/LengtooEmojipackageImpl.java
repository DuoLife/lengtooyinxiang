/**
* <p>Title: LengtooEmojipackageImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-18
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooEmojipackageDao;

/**
 * <p>Title: LengtooEmojipackageImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-18
 * Email: vip6ming@126.com
 */
public class LengtooEmojipackageImpl extends SqlSessionDaoSupport implements ILengtooEmojipackageDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooEmojipackageDao#getAllEmojipackage_client(java.util.Map)
	 */
	public List<Map> getAllEmojipackage_client(Map paramsMap) {
		List result = new ArrayList();
		
		return null;
	}

}
