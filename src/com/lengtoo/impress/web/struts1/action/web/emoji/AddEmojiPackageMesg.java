/**
* <p>Title: AddEmojiPackageMesg.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-12-11
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.web.emoji;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lengtoo.impress.service.ILengtooEmojipackageService;
import com.lengtoo.impress.service.impl.LengtooEmojiPackageServiceImpl;

/**
 * <p>Title: AddEmojiPackageMesg.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-12-11
 * Email: vip6ming@126.com
 */
public class AddEmojiPackageMesg extends Action{

	private ILengtooEmojipackageService service;
	public void setService(ILengtooEmojipackageService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String thumbnailurl = "img/abc.jpg";
		String title = "lengtoo Emoji";
		String description = "lengtu的表情最棒棒了~";
		int numberofuse = 100;
		int emojitotal = 24;
		Map paramsMap = new HashMap();
		paramsMap.put("thumbnailurl", thumbnailurl);
		paramsMap.put("title", title);
		paramsMap.put("description", description);
		paramsMap.put("numberofuse", numberofuse);
		paramsMap.put("emojitotal", emojitotal);
		try {
			service.insertEmojipackage_web(paramsMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
		return null;
	}

}
