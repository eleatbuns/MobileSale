package com.sdu.mobilesale.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdu.mobilesale.mapper.CustomerInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service(value = "customerInfo")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerInformationMapper customerInfoMapper;

    @Override
    @Cacheable(value = "SaleCache", key = "#pageNum+#areaId")
    public PageInfo<HashMap> getCustomerList(Integer pageNum, String areaId) {
        //当前显示的页数，每页显示的数目
        PageHelper.startPage(pageNum, 10);
        List<HashMap> customerList = customerInfoMapper.customerList(areaId);
        PageInfo<HashMap> pageInfo = new PageInfo<>(customerList);
        return pageInfo;
    }
}
