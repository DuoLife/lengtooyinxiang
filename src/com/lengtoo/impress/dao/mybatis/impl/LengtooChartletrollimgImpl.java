/**
* <p>Title: LengtooChartletrollimgImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooChartletrollimgDao;
import com.lengtoo.impress.dao.po.LengtooChartletrollimg;

/**
 * <p>Title: LengtooChartletrollimgImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-18
 * Email: vip6ming@126.com
 */
public class LengtooChartletrollimgImpl extends SqlSessionDaoSupport  implements ILengtooChartletrollimgDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooChartletrollimgDao#getAllRollimg_client()
	 */
	public List<Map> getAllRollimg_client() {
		List result = new ArrayList();
		List<LengtooChartletrollimg> list = getSqlSession().selectList("LengtooChartletrollimg.selectAll");
		for(LengtooChartletrollimg c: list) {
			Map m = new HashMap();
			m.put("rollimgid", c.getRollimgid());
			m.put("", c.getRollimgurl());
			m.put("", c.getImgwidth());
			m.put("", c.getImgheight());
			m.put("", c.getTitle());
			m.put("", c.getDescription());
			m.put("", c.getType());
			m.put("", c.getTarget());
			result.add(m);
		}
		return result;
	}

}