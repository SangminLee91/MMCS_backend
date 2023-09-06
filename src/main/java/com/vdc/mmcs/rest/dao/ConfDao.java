package com.vdc.mmcs.rest.dao;

import com.vdc.mmcs.common.dao.AbstractDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository("confDao")
public class ConfDao extends AbstractDAO{

    @Resource(name="sqlSessionMain")
    private SqlSessionTemplate sqlSession;

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> holiday_list(Map<String, Object> map) {
        return (List<Map<String, Object>>)selectList(sqlSession, "hday.holiday_list", map);
    }
    public int holiday_add(Map<String, Object> map) {
        return (int) insert(sqlSession, "hday.holiday_add", map);
    }
    public int holiday_edt(Map<String, Object> map) {
        return (int) update(sqlSession, "hday.holiday_edt", map);
    }
    public int holiday_del(Map<String, Object> map) {
        return (int) update(sqlSession, "hday.holiday_del", map);
    }
}
