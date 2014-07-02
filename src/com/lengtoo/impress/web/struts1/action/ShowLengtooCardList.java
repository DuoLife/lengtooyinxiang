/**
* <p>Title: ShowLengtooCardList.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-2
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action;

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
import com.lengtoo.impress.returndata.ReturnData;
import com.lengtoo.impress.service.ILengtooCardService;

/**
 * <p>Title: ShowLengtooCardList.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-2
 * Email: vip6ming@126.com
 */
public class ShowLengtooCardList extends Action{

	private ILengtooCardService service;
	public void setService(ILengtooCardService service) {
		this.service = service;
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		String date = request.getParameter("date");
		List<Map> list =  service.getAllCardMesg(date);
		result.put("lengtoocardlist", list);
		Gson g = new Gson();
		String json = g.toJson(list);
		ReturnData.returnData(response, result);
		return null;
	}
	
}
