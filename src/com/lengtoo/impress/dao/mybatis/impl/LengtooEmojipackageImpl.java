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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooEmojipackageDao;
import com.lengtoo.impress.dao.po.LengtooEmojipackage;

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
		List<LengtooEmojipackage> list = getSqlSession().selectList("LengtooEmojipackage.selectAll", paramsMap);
		for(LengtooEmojipackage e: list) {
			Map m = new HashMap();
			m.put("emojipackageid", e.getEmojipackageid());
			m.put("title", e.getTitle());
			m.put("description", e.getDescription());
			m.put("emojitotal", e.getEmojitotal());
			m.put("thumbnaiurl", e.getThumbnailurl());
			m.put("imgwidth", e.getImgwidth());
			m.put("imgheight", e.getImgheight());
			//m.put("numberofuse", e.getNumberofuse());
			m.put("authorid", e.getAuthorid());
			Date d = e.getCreatedate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dStr = sdf.format(d);
			m.put("createdate", dStr);
			result.add(m);
//			m.put("", e.get);
//			m.put("", e.get);
		}
		return result;
	}

}
