package cn.dombro.cloudCall.dao.tradition;

import cn.dombro.cloudCall.entity.MissionInfo;
import cn.dombro.cloudCall.entity.SiteNumber;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

/**
 * Author Caole
 * CreateDate: 2017/7/16
 * CreateTime: 11:37
 */
public interface SiteNumberMapper {

    public SiteNumber selectByPrimaryKey(Integer mId) throws IOException;

    public void deleteByPrimaryKey(Integer mId) throws IOException;

    public void insert(SiteNumber siteNumber) throws IOException;

    public void insertSelective(SiteNumber siteNumber) throws IOException;

    public void updateByPrimaryKeySelective(SiteNumber siteNumber) throws IOException;

    public void updateByPrimaryKey(SiteNumber siteNumber) throws IOException;

    public List<SiteNumber> getAll() throws IOException;

    public SiteNumber getListByPswAndUser(@Param("username") String username, @Param("password") String password) throws IOException;
}
