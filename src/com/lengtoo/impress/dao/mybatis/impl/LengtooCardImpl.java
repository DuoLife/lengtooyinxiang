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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		List<LengtooCard> list = getSqlSession().selectList("LengtooCard.selectAll", date);
		for(LengtooCard c: list) {
			Map card = new HashMap();
			card.put("Cardid", c.getCardid());
			card.put("Width", c.getWidth());
			card.put("Height", c.getHeight());
			card.put("Origin_x", c.getOrigin_x());
			card.put("Origin_y", c.getOrigin_y());
			card.put("Origin_width", c.getOrigin_width());
			card.put("Origin_height", c.getOrigin_height());
			card.put("Default_test", c.getDefault_test());
			card.put("And_width", c.getAnd_width());
			card.put("And_height", c.getAnd_height());
			card.put("And_origin_x", c.getAnd_origin_x());
			card.put("And_origin_y", c.getAnd_origin_y());
			card.put("And_origin_width", c.getAnd_origin_width());
			card.put("And_origin_height", c.getAnd_origin_height());
			card.put("Small_imgurl", c.getSmall_imgurl());
			card.put("Big_imgurl", c.getBig_imgurl());
			//card.put("Upload_ip", c.getUpload_ip());
			Date d = c.getCreatedate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dStr = sdf.format(d);
			card.put("Createdate", dStr);
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
