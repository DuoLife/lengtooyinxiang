/**
* <p>Title: ShowAllCahrtletByPackageid.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
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
import com.lengtoo.impress.service.ILengtooAuthorService;
import com.lengtoo.impress.service.ILengtooChartletService;
import com.lengtoo.impress.service.ILengtooChartletillustrationService;
import com.lengtoo.impress.service.ILengtooChartletpackageService;

/**
 * <p>Title: ShowAllCahrtletByPackageid.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class ShowAllCahrtletByPackageid extends Action{

	private ILengtooChartletService cService;
	private ILengtooChartletillustrationService iService;
	private ILengtooAuthorService aService;
	private ILengtooChartletpackageService cpService;
	
	public void setcService(ILengtooChartletService cService) {
		this.cService = cService;
	}
	public void setiService(ILengtooChartletillustrationService iService) {
		this.iService = iService;
	}
	public void setaService(ILengtooAuthorService aService) {
		this.aService = aService;
	}
	public void setCpService(ILengtooChartletpackageService cpService) {
		this.cpService = cpService;
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
		String requestType;
		int authorid = 0;
		try {
			packageid = Integer.parseInt(request.getParameter("packageid"));
			requestType = request.getParameter("requestType");
			if("list".equals(requestType)) {
				authorid = Integer.parseInt(request.getParameter("authorid"));
			}
		} catch (Exception e) {
			msg = 20; //请求参数错误
			ReturnData.returnData(response, result, success, msg);
			return null;
		}
		paramsMap.put("packageid", packageid);
		paramsMap.put("authorid", authorid);
		paramsMap.put("requestType", requestType);
		
		List<Map> chartletList;
		List<Map> illustrationList;
		Map author;
		Map packageMes = null;
		try {
			chartletList = cService.getAllChartlet_client(paramsMap);
			illustrationList = iService.getIllustrationByPackageId_client(paramsMap);
			author = aService.getAuthorMesgById_client(paramsMap);
			if("chartletrollimg".equals(requestType)) {
				packageMes = cpService.getOneChartletpackageByPid_client(paramsMap);
			}
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
		
		result.put("author", author);
		result.put("chartletlist", chartletList);
		result.put("illustrationList", illustrationList);
		result.put("packageMes", packageMes);
		ReturnData.returnData(response, result, success, msg);
		return null;
	}

}
