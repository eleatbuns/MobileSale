package com.sdu.mobilesale.service;


import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

public interface CustomerService {
    PageInfo<HashMap> getCustomerList(Integer pageNum, String areaId);
}
