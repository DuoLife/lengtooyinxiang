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

import com.lengtoo.impress.dao.ILengtooChartletDao;
import com.lengtoo.impress.dao.po.LengtooChartlet;

/**
 * <p>Title: LengtooEmojiImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public class LengtooChartletImpl extends SqlSessionDaoSupport implements ILengtooChartletDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooEmojiDao#getAllChartlet_client(java.util.Map)
	 */
	public List<Map> getAllChartlet_client(Map paramsMap) {
		List result = new ArrayList();
		List<LengtooChartlet> list = getSqlSession().selectList("LengtooChartlet.selectAll");
		for(LengtooChartlet e: list) {
			Map m = new HashMap();
			m.put("chartletid", e.getChartletid());
			m.put("chartleturl", e.getChartleturl());
			m.put("chartletwidth", e.getChartletwidth());
			m.put("chartletheight", e.getChartletheight());
			m.put("numberofuse", e.getNumberofuse());
			result.add(m);
		}
		return result;
	}

}
