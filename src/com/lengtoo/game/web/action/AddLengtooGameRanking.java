/**
* <p>Title: AddLengtooGameRakking.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-26
* @version 1.0
*/
package com.lengtoo.game.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;
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
 * <p>Title: AddLengtooGameRakking.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-26
 * Email: vip6ming@126.com
 */
public class AddLengtooGameRanking extends Action{

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
		String username = request.getParameter("username");
		String declaration = request.getParameter("declaration");
		float scoreF = Float.parseFloat(request.getParameter("score"));
		int score = (int) (scoreF*1000);
		paramsMap.put("username", username);
		paramsMap.put("declaration", declaration);
		paramsMap.put("score", score);
		try {
			Map m =  service.addLengtooRanking(paramsMap);
			msg = 1;
			success = true;
			Gson g = new Gson();
			String json = g.toJson(m);
		} catch (Exception e) {
			msg = 2;
		}
		ReturnData.returnData(response, result, success, msg);
		return null;
	}

}
