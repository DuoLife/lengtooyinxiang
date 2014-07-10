/**
* <p>Title: LengtooCardImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-6-27
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooCardDao;
import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: LengtooCardImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public class LengtooCardImpl extends SqlSessionDaoSupport implements ILengtooCardDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooCardDao#getAllCardMesg(java.lang.String)
	 */

	public List<Map> getAllCardMesg(String date) {
		List result = new ArrayList();
		List<LengtooCard> list = getSqlSession().selectList("LengtooCard.selectAll");
		for(LengtooCard c: list) {
			Map card = new HashMap();
			card.put("And_height", c.getAnd_height());
			card.put("And_origin_x", c.getAnd_origin_x());
			card.put("And_origin_y", c.getAnd_origin_y());
			card.put("And_width", c.getAnd_width());
			card.put("Big_imgurl", c.getBig_imgurl());
			card.put("Cardid", c.getCardid());
			card.put("Createdate", c.getCreatedate());
			card.put("Default_test", c.getDefault_test());
			card.put("Height", c.getHeight());
			card.put("Origin_x", c.getOrigin_x());
			card.put("Origin_y", c.getOrigin_y());
			card.put("Small_imgurl", c.getSmall_imgurl());
			card.put("Upload_ip", c.getUpload_ip());
			card.put("Width", c.getWidth());
			result.add(card);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooCardDao#addLengtooCard(java.util.Map)
	 */
	public Map addLengtooCard(LengtooCard lengtooCard) {
		int isOk = getSqlSession().insert("LengtooCard.insertOne", lengtooCard);
		return null;
	}

}
