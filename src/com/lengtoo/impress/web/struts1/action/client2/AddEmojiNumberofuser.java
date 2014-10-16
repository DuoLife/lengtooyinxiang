/**
* <p>Title: AddEmojiNumberofuser.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-24
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.client2;

import java.util.HashMap;
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
 * <p>Title: AddEmojiNumberofuser.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-24
 * Email: vip6ming@126.com
 */
public class AddEmojiNumberofuser extends Action{

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
		int emojiid;
		try {
			emojiid = Integer.parseInt(request.getParameter("emojiid"));
		} catch (Exception e) {
			msg = 20; //请求参数错误
			ReturnData.returnData(response, result, success, msg);
			return null;
		}
		
		try {
			Map m = eService.updateNumberofuse_client(emojiid);
			int isOk = ((Integer)m.get("isOk"));
			if(isOk == 1) {
				msg = 11; //update数据成功
				success = true;
			}else {
				msg = 30; //数据已被删除，数据不存在
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = 21; //服务器错误
			ReturnData.returnData(response, result, success, msg);
			return null;
		}
		
		ReturnData.returnData(response, result, success, msg);
		return null;
	}

}
