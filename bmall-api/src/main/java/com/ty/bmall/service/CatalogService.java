package com.ty.bmall.service;

import com.ty.bmall.bean.PmsBaseCatalog1;
import com.ty.bmall.bean.PmsBaseCatalog2;
import com.ty.bmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();
    List<PmsBaseCatalog2> getCatalog2();
    List<PmsBaseCatalog3> getCatalog3();
}
