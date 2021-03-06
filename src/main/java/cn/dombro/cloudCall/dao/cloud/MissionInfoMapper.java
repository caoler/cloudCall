package cn.dombro.cloudCall.dao.cloud;

import cn.dombro.cloudCall.entity.MissionInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

/**
 * Author Caole
 * CreateDate: 2017/7/16
 * CreateTime: 11:39
 */
public interface MissionInfoMapper {

    public MissionInfo selectByPrimaryKey(Integer mId) throws IOException;

    public void deleteByPrimaryKey(Integer mId) throws IOException;

    public void insert(MissionInfo missionInfo) throws IOException;

    public void insertSelective(MissionInfo missionInfo) throws IOException;

    public void updateByPrimaryKeySelective(MissionInfo missionInfo) throws IOException;

    public void updateByPrimaryKey(MissionInfo missionInfo) throws IOException;

    public List<MissionInfo> getAll() throws IOException;

    public List<MissionInfo> getListByEcId(Integer ecId) throws IOException;

    public List<MissionInfo> getListByEcIdAndAccept(@Param("ecId")Integer ecId ,@Param("acceptStatus")Integer acceptStatus) throws IOException;

    public void deleteByMidAndAccept(Integer mId) throws IOException;

    public List<MissionInfo> getClassAndClassifyAndInfoByQueryStamLiKe(String queryStatement) throws IOException;

    public int getAcceptStatusByMid(Integer mId) throws IOException;

    public int getAcceptStatusNumByEcIdAndAccept(@Param("ecId")Integer ecId, @Param("acceptStatus")Integer acceptStatus) throws IOException;

    public int getAcceptStatusNumByCsIdAndAccept(@Param("csId")Integer csId, @Param("acceptStatus")Integer acceptStatus) throws IOException;

    public int getAcceptStatusNumByCsId(Integer csId) throws IOException;

    public int getAcceptStatusNumByAcceptStatus(Integer acceptStatus) throws IOException;

    List<MissionInfo> getAllByQueryStatementLike(String queryStatement) throws IOException;
}
