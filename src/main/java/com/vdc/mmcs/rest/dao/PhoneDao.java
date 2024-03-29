package com.vdc.mmcs.rest.dao;

import com.vdc.mmcs.common.dao.AbstractDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository("phoneDao")
public class PhoneDao extends AbstractDAO {
    @Resource(name="sqlSessionMain")
    private SqlSessionTemplate sqlSession;

    /* group */

    public Map<String, Object> group_list(Map<String, Object> map) {
        return (Map<String, Object>)selectOne(sqlSession, "phone.group_list", map);
    }
    public List<Map<String, Object>> group_info(Map<String, Object> map) {
        return (List<Map<String, Object>>)selectList(sqlSession, "phone.group_info", map);
    }
    public int group_add(Map<String, Object> map) {
        return (int) insert(sqlSession, "phone.group_add", map);
    }
    public int group_edt(Map<String, Object> map) {
        return (int) update(sqlSession, "phone.group_edt", map);
    }
    public int group_del(Map<String, Object> map) {
        return (int) update(sqlSession, "phone.group_del", map);
    }

    /* phone */
    public List<Map<String, Object>> phone_list(Map<String, Object> map) {
        return (List<Map<String, Object>>)selectList(sqlSession, "phone.phone_list", map);
    }
    public Map<String, Object> phone_total_cnt(Map<String, Object> map) {
        return (Map<String, Object>)selectOne(sqlSession, "phone.phone_total_cnt", map);
    }
    public Map<String, Object> phone_search_total_cnt(Map<String, Object> map) {
        return (Map<String, Object>)selectOne(sqlSession, "phone.phone_search_total_cnt", map);
    }
    public List<Map<String, Object>> phone_search_list(Map<String, Object> map) {
        return (List<Map<String, Object>>)selectList(sqlSession, "phone.phone_search_list", map);
    }
    public int phone_add(Map<String, Object> map) {
        return (int) insert(sqlSession, "phone.phone_add", map);
    }
    public int phone_edt(Map<String, Object> map) {
        return (int) update(sqlSession, "phone.phone_edt", map);
    }
    public int phone_del(Map<String, Object> map) {
        return (int) update(sqlSession, "phone.phone_del", map);
    }

    public List<Map<String, Object>> phone_group_list(Map<String, Object> map) {
        return (List<Map<String, Object>>)selectList(sqlSession, "phone.phone_group_list", map);
    }
    public Map<String, Object> phone_group_total_cnt(Map<String, Object> map) {
        return (Map<String, Object>)selectOne(sqlSession, "phone.phone_group_total_cnt", map);
    }
    public int phone_group_edt(Map<String, Object> map) {
        return (int) update(sqlSession, "phone.phone_group_edt", map);
    }
}
