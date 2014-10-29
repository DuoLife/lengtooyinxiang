/**
* <p>Title: LengtooEmojirollimgImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-18
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooEmojirollimgDao;
import com.lengtoo.impress.dao.po.LengtooEmojirollimg;

/**
 * <p>Title: LengtooEmojirollimgImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-18
 * Email: vip6ming@126.com
 */
public class LengtooEmojirollimgImpl extends SqlSessionDaoSupport implements ILengtooEmojirollimgDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooEmojirollimgDao#getAllRollimg_client()
	 */
	public List<Map> getAllRollimg_client(Map paramsMap) {
		List result = new ArrayList();
		List<LengtooEmojirollimg> list = getSqlSession().selectList("LengtooEmojirollimg.selectAll", paramsMap);
		for(LengtooEmojirollimg e: list) {
			Map m = new HashMap();
			m.put("rollimgid", e.getRollimgid());
			m.put("rollimgurl", e.getRollimgurl());
			m.put("imgwidth", e.getImgwidth());
			m.put("imgheight", e.getImgheight());
			m.put("title", e.getTitle());
			m.put("description", e.getDescription());
			m.put("type", e.getType());
			m.put("target", e.getTarget());
			m.put("createdate", e.getCreatedate());
			result.add(m);
		}
		return result;
	}
}
