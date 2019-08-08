package com.ty.bmall.service;

import com.ty.bmall.bean.PmsBaseAttrInfo;
import com.ty.bmall.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * 属性操作接口
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalogId);

    List<PmsBaseAttrValue> attrValueList(String attrId);

    String saveAttInfo(PmsBaseAttrInfo attrInfo);
}
