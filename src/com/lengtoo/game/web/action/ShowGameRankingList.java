/**
* <p>Title: ShowGameRankingList.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-26
* @version 1.0
*/
package com.lengtoo.game.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;
import com.lengtoo.game.service.ILengtooGameService;
import com.lengtoo.impress.returndata.ReturnData;

/**
 * <p>Title: ShowGameRankingList.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-26
 * Email: vip6ming@126.com
 */
public class ShowGameRankingList extends Action{

	private ILengtooGameService service;
	public void setService(ILengtooGameService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response){
		
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		boolean success = false;
		int msg = 0;
		boolean isOk = false;
		try {
			List<Map> list =  service.getAllRanking(paramsMap);
			if(list.size() !=0) {
				success = true;
				msg = 11;//success
			}else {
				success = true;
				msg = 12;//数据为空
			}
			result.put("gamerankinglist", list);
			Gson g = new Gson();
			String json = g.toJson(list);
		} catch (Exception e) {
			msg = 2;
		}
		ReturnData.returnData(response, result, success, msg);
		return null;
	}
}
