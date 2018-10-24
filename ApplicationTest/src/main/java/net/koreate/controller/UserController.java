package net.koreate.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.koreate.dto.LoginDTO;
import net.koreate.service.UserService;
import net.koreate.vo.UserVO;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Inject
	UserService service;
	
	@RequestMapping("/login")
	public void login() {}
	
	@RequestMapping(value="/loginPost",method=RequestMethod.POST)
	public void loginPOST(LoginDTO dto, Model model) throws Exception{
		System.out.println(dto);
		UserVO vo = service.login(dto);
		System.out.println("UserController : "+vo);
		
		if(vo != null) {
			model.addAttribute("userVO",vo);			
		}
	}
	
	@RequestMapping(value="/logOut",method=RequestMethod.GET)
	public String logOut(HttpServletRequest request,
						HttpSession session,
						HttpServletResponse response ) {
		
		Object obj = session.getAttribute("login");
		
		if(obj != null) {
			session.removeAttribute("login");
			session.invalidate();
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "/user/join";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String joinPost(UserVO vo,Model model)  throws Exception{
		System.out.println(vo);
		service.join(vo);
		model.addAttribute("message","회원가입 성공!");
		return "redirect:/user/signIn";
	}
}
