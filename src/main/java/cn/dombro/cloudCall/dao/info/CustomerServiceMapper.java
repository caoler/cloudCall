package cn.dombro.cloudCall.dao.info;

import cn.dombro.cloudCall.entity.CustomerService;

import java.io.IOException;
import java.util.List;


/**
 * Author Caole
 * CreateDate: 2017/7/16
 * CreateTime: 11:41
 */
public interface CustomerServiceMapper {


    public CustomerService selectByPrimaryKey(Integer csId) throws IOException;

    public void deleteByPrimaryKey(Integer csId) throws IOException;

    public void insert(CustomerService customerService) throws IOException;

    public void insertSelective(CustomerService customerService) throws IOException;

    public void updateByPrimaryKeySelective(CustomerService customerService) throws IOException;

    public void updateByPrimaryKey(CustomerService customerService) throws IOException;

    public List<CustomerService> getAll() throws IOException;

    public String selectPswByUser(String username) throws IOException;

    public CustomerService selectByUser(String username) throws IOException;
}
