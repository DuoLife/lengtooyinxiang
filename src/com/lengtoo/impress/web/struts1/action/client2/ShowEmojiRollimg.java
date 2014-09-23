/**
* <p>Title: ShowEmojiRollimg.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-23
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.client2;

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
import com.lengtoo.impress.service.ILengtooEmojirollimgService;

/**
 * <p>Title: ShowEmojiRollimg.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-23
 * Email: vip6ming@126.com
 */
public class ShowEmojiRollimg extends Action{

	private ILengtooEmojirollimgService eService;
	public void seteService(ILengtooEmojirollimgService eService) {
		this.eService = eService;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		boolean success = false;
		int msg = 0;
		String date = null;
		int limit;
		try {
			limit = Integer.parseInt(request.getParameter("limit"));
		} catch (Exception e) {
			limit = 4;
		}
		if(limit>6 || limit<0) {
			limit = 4;
		}
		paramsMap.put("limit", limit);
		try {
			List<Map> list =  eService.getAllRollimg_client(paramsMap);
			if(list.size() !=0) {
				success = true;
				msg = 11;//success
			}else {
				success = true;
				msg = 12;//数据为空
			}
			result.put("rollimglist", list);
			Gson g = new Gson();
			String json = g.toJson(list);
		} catch (Exception e) {
			e.printStackTrace();
			msg = 2;
		}
		ReturnData.returnData(response, result, success, msg);
		return null;
	}

}
