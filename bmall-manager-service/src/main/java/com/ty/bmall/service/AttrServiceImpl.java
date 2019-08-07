package com.ty.bmall.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ty.bmall.bean.PmsBaseAttrInfo;
import com.ty.bmall.bean.PmsBaseAttrValue;
import com.ty.bmall.mapper.PmsBaseAttrInfoMapper;
import com.ty.bmall.mapper.PmsBaseAttrValueMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    //获取到所有的属性信息
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalogId) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalogId);
        List<PmsBaseAttrInfo> attrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return attrInfos;
    }

    /**
     * 获取商品属性值
     *
     * @param attrId
     * @return
     */
    @Override
    public List<PmsBaseAttrValue> attrValueList(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
        return pmsBaseAttrValues;
    }
}
