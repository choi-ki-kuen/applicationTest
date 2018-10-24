package net.koreate.service;

import net.koreate.dto.LoginDTO;
import net.koreate.vo.UserVO;

public interface UserService {

	UserVO login(LoginDTO dto) throws Exception;

	UserVO getUser(String uid)throws Exception;

	void join(UserVO vo) throws Exception;

}
