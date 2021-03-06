package cn.dombro.cloudCall.dao.cloud;

import cn.dombro.cloudCall.entity.CallMission;
import cn.dombro.cloudCall.entity.Message;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

/**
 * Author Caole
 * CreateDate: 2017/7/19
 * CreateTime: 12:21
 */
public interface MessageMapper {
    public Message selectByPrimaryKey(Integer msg_id) throws IOException;

    public void deleteByPrimaryKey(Integer msg_id) throws IOException;

    public void insert(Message message) throws IOException;

    public void insertSelective(Message message) throws IOException;

    public void updateByPrimaryKeySelective(Message message) throws IOException;

    public void updateByPrimaryKey(Message message) throws IOException;

    public List<Message> getAll() throws IOException;

    public List<Message> getListByIdGroup(@Param("receiverId") Integer receiverId, @Param("group") String group) throws IOException;

    public List<Message> getListByIdGroupAndRead(@Param("receiverId") Integer receiverId, @Param("group") String group,
                                                 @Param("readd") Integer readd) throws IOException;

    public List<Message> getOnly2ByIdGroup(@Param("receiverId") Integer receiverId, @Param("group") String group) throws IOException;
}
