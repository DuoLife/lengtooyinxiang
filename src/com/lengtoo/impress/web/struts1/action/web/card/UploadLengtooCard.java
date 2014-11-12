/**
* <p>Title: UploadLengtooCard.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-10
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.web.card;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lengtoo.impress.service.ILengtooCardService;
import com.lengtoo.impress.tools.GetRealIp;
import com.lengtoo.impress.tools.LengtooImgPath;
import com.lengtoo.impress.tools.UploadFileUtil;

/**
 * <p>Title: UploadLengtooCard.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-10
 * Email: vip6ming@126.com
 */
public class UploadLengtooCard extends Action{

	private ILengtooCardService service;
	public void setService(ILengtooCardService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			Map map = new HashMap();
			String originWH = null;  
			String originsite = null;  
			String default_text = null;
			String imgPath = null;
			String smallimgPath = null;
			
			UploadFileUtil uf = new UploadFileUtil();
			Map parameter = uf.getUploadFile2Map(request, response);
			//System.out.println(parameter);
			
			//service
			String ip = GetRealIp.getIpAddr(request);
			map.put("ip", ip);
			map.put("originWH", parameter.get("originWH"));
			map.put("originsite", parameter.get("originsite"));
			map.put("imgPath", parameter.get("img"));  
			map.put("smallimgPath", parameter.get("thumbnail"));  
			map.put("default_text", parameter.get("default_text"));
			//
			service.addLengtooCard(map);
			response.sendRedirect(LengtooImgPath.getUploadCardSuccessUrl());
		return null;
	}

}
