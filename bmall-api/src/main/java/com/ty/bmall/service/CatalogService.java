package com.ty.bmall.service;

import com.ty.bmall.bean.PmsBaseCatalog1;
import com.ty.bmall.bean.PmsBaseCatalog2;
import com.ty.bmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();
<<<<<<< HEAD
    List<PmsBaseCatalog2> getCatalog2(String catalogId);
    List<PmsBaseCatalog3> getCatalog3(String catalogId);
=======

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
>>>>>>> ty_bmall_1
}
