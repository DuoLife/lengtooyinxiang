/**
* <p>Title: LengtooGameServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-26
* @version 1.0
*/
package com.lengtoo.game.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.lengtoo.game.dao.ILengtooGameDao;
import com.lengtoo.game.dao.po.LengtooGame;
import com.lengtoo.game.service.ILengtooGameService;

/**
 * <p>Title: LengtooGameServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-26
 * Email: vip6ming@126.com
 */
public class LengtooGameServiceImpl implements ILengtooGameService{
	
	private ILengtooGameDao dao;
	public void setDao(ILengtooGameDao dao) {
		this.dao = dao;
	}

	public Map addLengtooRanking(Map paramsMap) {
		LengtooGame lengtooGame = new LengtooGame();
		Date date = new Date();
		lengtooGame.setDate(date);
		lengtooGame.setUsername((String)paramsMap.get("username"));
		lengtooGame.setDeclaration((String)paramsMap.get("declaration"));
		lengtooGame.setScore((Integer)paramsMap.get("score"));
		return dao.addLengtooRanking(lengtooGame);
	}
	
	
	public List<Map> getAllRanking(Map paramsMap) {
		return dao.getAllRanking(paramsMap);
	}

}
