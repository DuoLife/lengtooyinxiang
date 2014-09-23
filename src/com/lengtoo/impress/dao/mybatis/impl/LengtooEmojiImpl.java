/**
* <p>Title: LengtooEmojiImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-19
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooEmojiDao;
import com.lengtoo.impress.dao.po.LengtooEmoji;

/**
 * <p>Title: LengtooEmojiImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public class LengtooEmojiImpl extends SqlSessionDaoSupport implements ILengtooEmojiDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooEmojiDao#getAllChartlet_client(java.util.Map)
	 */
	public List<Map> getAllEmoji_client(Map paramsMap) {
		List result = new ArrayList();
		List<LengtooEmoji> list = getSqlSession().selectList("LengtooEmoji.selectAll");
		for(LengtooEmoji e: list) {
			Map m = new HashMap();
			m.put("emojiid", e.getEmojiid());
			m.put("emojiurl", e.getEmojiurl());
			m.put("emojiwidth", e.getEmojiwidth());
			m.put("emojiheight", e.getEmojiheight());
			m.put("numberofuse", e.getNumberofuse());
			result.add(m);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooEmojiDao#updateNumberofuse_client(int)
	 */
	public Map updateNumberofuse_client(int emojiid) {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		paramsMap.put("emojiid", emojiid);
		getSqlSession().update("LengtooEmoji.numberofusePlus", paramsMap);
		return null;
	}

}
