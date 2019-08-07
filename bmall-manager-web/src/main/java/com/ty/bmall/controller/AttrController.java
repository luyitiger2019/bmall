package com.ty.bmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ty.bmall.bean.PmsBaseAttrInfo;
import com.ty.bmall.bean.PmsBaseAttrValue;
import com.ty.bmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品属性操作
 */
@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;

    //获取商品属性信息
    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        List<PmsBaseAttrInfo> attrInfos = attrService.attrInfoList(catalog3Id);
        return attrInfos;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> attrValues = attrService.attrValueList(attrId);
        return attrValues;
    }

    /**
     * option操作，保存属性
     *
     * @param pmsBaseAttrInfo
     * @return
     */
    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {

        return "success";
    }
}
