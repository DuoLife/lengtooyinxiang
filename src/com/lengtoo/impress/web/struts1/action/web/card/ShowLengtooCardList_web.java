/**
* <p>Title: ShowLengtooCardList_web.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-8-29
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.web.card;

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
import com.lengtoo.impress.returndata.ReturnData;
import com.lengtoo.impress.service.ILengtooCardService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: ShowLengtooCardList_web.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-8-29
 * Email: vip6ming@126.com
 */
public class ShowLengtooCardList_web extends Action{

	private ILengtooCardService service;
	public void setService(ILengtooCardService service) {
		this.service = service;
	}
	//获取当前URL前缀
	String url = LengtooImgPath.getUrl();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		boolean success = false;
		int msg = 0;
		boolean isOk = false;
		boolean refresh = Boolean.parseBoolean(request.getParameter("refresh"));
		String date = null;
		if(refresh) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sf.format(new Date());
		}else {
			date = request.getParameter("date");
		}
		int limit;
		try {
			limit = Integer.parseInt(request.getParameter("limit"));
		} catch (Exception e) {
			limit = 30;
		}
		if(limit>30 || limit<0) {
			limit = 30;
		}
		paramsMap.put("date", date);
		paramsMap.put("limit", limit);
		//paramsMap.put("refresh", refresh);
		try {
			List<Map> list =  service.getAllCardMesg_Web(paramsMap);
			for (Map m: list) {
				String bStr = (String) m.get("Big_imgurl");
				String sStr = (String) m.get("Small_imgurl");
				m.put("Big_imgurl", url + bStr); 
				m.put("Small_imgurl", url + sStr); 
			}
			isOk = true;
			if(list.size() !=0) {
				success = true;
				msg = 11;//success
			}else {
				success = true;
				msg = 12;//数据为空
			}
			result.put("lengtoocardlist", list);
			Gson g = new Gson();
			String json = g.toJson(list);
		} catch (Exception e) {
			msg = 2;
		}
		ReturnData.returnData(response, result, success, msg);
		return null;
	}
	
}