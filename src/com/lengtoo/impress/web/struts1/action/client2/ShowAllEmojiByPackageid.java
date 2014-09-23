/**
* <p>Title: ShowAllEmojiByPackageid.java</p>
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

import com.lengtoo.impress.returndata.ReturnData;
import com.lengtoo.impress.service.ILengtooEmojiService;

/**
 * <p>Title: ShowAllEmojiByPackageid.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-23
 * Email: vip6ming@126.com
 */
public class ShowAllEmojiByPackageid extends Action{

	private ILengtooEmojiService eService;
	public void seteService(ILengtooEmojiService eService) {
		this.eService = eService;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		boolean success = false;
		int msg = 0;
		Map paramsMap = new HashMap();
		int packageid;
		//int authorid;
		try {
			packageid = Integer.parseInt(request.getParameter("packageid"));
			//authorid = Integer.parseInt(request.getParameter("authorid"));
		} catch (Exception e) {
			msg = 20; //请求参数错误
			ReturnData.returnData(response, result, success, msg);
			return null;
		}
		paramsMap.put("packageid", packageid);
		//paramsMap.put("authorid", authorid);
		
		List<Map> chartletList;
		List<Map> illustrationList;
		Map author;
		try {
			chartletList = eService.getAllEmoji_client(paramsMap);
			//author = aService.getAuthorMesgById_client(paramsMap);
			success = true;
			if (chartletList.size() != 0) {
				msg = 11;
			}else {
				msg = 12;
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = 21; //服务器错误
			ReturnData.returnData(response, result, success, msg);
			return null;
		}
		
		result.put("emojilist", chartletList);
		//result.put("author", author);
		ReturnData.returnData(response, result, success, msg);
		return null;
	}

}
