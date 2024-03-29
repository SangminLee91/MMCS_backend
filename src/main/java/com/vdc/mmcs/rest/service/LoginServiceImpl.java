package com.vdc.mmcs.rest.service;

import com.vdc.mmcs.rest.dao.LoginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource(name="loginDao")
    private LoginDao loginDao;

    @Override
    public Map<String, Object> account_login(Map<String, Object> map) {
        return loginDao.account_login(map);
    }
    @Override
    public int account_last_login(Map<String, Object> map) {
        return loginDao.account_last_login(map);
    }

}
