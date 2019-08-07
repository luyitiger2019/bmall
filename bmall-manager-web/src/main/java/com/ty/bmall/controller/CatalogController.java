package com.ty.bmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ty.bmall.bean.PmsBaseCatalog1;
import com.ty.bmall.bean.PmsBaseCatalog2;
import com.ty.bmall.bean.PmsBaseCatalog3;
import com.ty.bmall.service.CatalogService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {
    @Reference
    CatalogService catalogService;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1()
    {
        List<PmsBaseCatalog1> cataLogs1=catalogService.getCatalog1();
        return cataLogs1;
    }
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2()
    {
        List<PmsBaseCatalog2> cataLogs2=catalogService.getCatalog2();
        return cataLogs2;
    }
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3()
    {
        List<PmsBaseCatalog3> cataLogs3=catalogService.getCatalog3();
        return cataLogs3;
    }
}