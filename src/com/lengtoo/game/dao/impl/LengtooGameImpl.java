/**
* <p>Title: LengtooGameImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-26
* @version 1.0
*/
package com.lengtoo.game.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.game.dao.ILengtooGameDao;
import com.lengtoo.game.dao.po.LengtooGame;
import com.lengtoo.impress.dao.po.LengtooWallpaper;

/**
 * <p>Title: LengtooGameImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-26
 * Email: vip6ming@126.com
 */
public class LengtooGameImpl extends SqlSessionDaoSupport implements ILengtooGameDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.game.dao.ILengtooGameDao#addLengtooRanking(com.lengtoo.game.dao.po.LengtooGame)
	 */
	public Map addLengtooRanking(LengtooGame lengtooGame) {
		getSqlSession().insert("LengtooGame.insertOne",lengtooGame);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.game.dao.ILengtooGameDao#getAllRanking(java.util.Map)
	 */
	public List<Map> getAllRanking(Map paramsMap) {
		List result = new ArrayList();
		List<LengtooGame> list = getSqlSession().selectList("LengtooGame.selectAll", 50);
		for(LengtooGame lg: list) {
			Map map = new HashMap();
			map.put("Userid", lg.getUserid());
			map.put("Username", lg.getUsername());
			map.put("Score", toFloat(lg.getScore()));
			map.put("Declaration", lg.getDeclaration());
			Date d = lg.getDate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dStr = sdf.format(d);
			map.put("Date", dStr);
			result.add(map);
		}
		return result;
	}

	public String toFloat(int num) {
		String result = (num/1000) + "." + (num%1000);
		return result;
	}
}
