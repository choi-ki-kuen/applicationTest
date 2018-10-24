package net.koreate.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import net.koreate.dao.UserDao;
import net.koreate.dto.LoginDTO;
import net.koreate.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	UserDao dao;

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}

	@Override
	public UserVO getUser(String uid) throws Exception {
		return dao.getUser(uid);
	}

	@Override
	public void join(UserVO vo) throws Exception {
		dao.join(vo);
	}

}
