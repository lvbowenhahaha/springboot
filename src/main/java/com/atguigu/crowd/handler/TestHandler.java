package com.atguigu.crowd.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.crowd.constant.CrowdConstant;
import com.atguigu.crowd.entity.vo.MemberLoginVO;
import com.atguigu.crowd.entity.vo.ProjectVO;


@RestController
public class TestHandler {
	@RequestMapping("/tset/save/session")
	public void tesetSaveSession(HttpSession httpSession) {
		MemberLoginVO memberLoginVO = new MemberLoginVO();
		memberLoginVO.setId(1);
		httpSession.setAttribute("aa", memberLoginVO);
		Object nObject = memberLoginVO;
		System.out.println(memberLoginVO);
		System.out.println(nObject);
	}
	@RequestMapping("/")
	public void tesetSaveSession1(HttpSession httpSession) {
		System.out.println("111111111111111111");
		MemberLoginVO MemberLoginVO = (MemberLoginVO)httpSession.getAttribute("aa");
		System.out.println(MemberLoginVO);
	}
	@RequestMapping("/a")
	public void tesetSaveSession21(HttpSession httpSession) {
		ProjectVO projectVO = (ProjectVO)httpSession.getAttribute(CrowdConstant.ATTR_NAME_TEMPLE_PROJECT);
		System.out.println(projectVO);
	}
}
