package com.ty.bmall.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ty.bmall.bean.PmsBaseCatalog1;
import com.ty.bmall.bean.PmsBaseCatalog2;
import com.ty.bmall.bean.PmsBaseCatalog3;
import com.ty.bmall.mapper.PmsBaseCatalogMapper1;
import com.ty.bmall.mapper.PmsBaseCatalogMapper2;
import com.ty.bmall.mapper.PmsBaseCatalogMapper3;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class PmsCatalogServiceImpl implements CatalogService {
    @Autowired
    PmsBaseCatalogMapper1 pmsBaseCatalogMapper1;
    @Autowired
    PmsBaseCatalogMapper2 pmsBaseCatalogMapper2;
    @Autowired
    PmsBaseCatalogMapper3 pmsBaseCatalogMapper3;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalogMapper1.selectAll();
        return pmsBaseCatalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2() {
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalogMapper2.selectAll();
        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3() {
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalogMapper3.selectAll();
        return pmsBaseCatalog3s;
    }
}
