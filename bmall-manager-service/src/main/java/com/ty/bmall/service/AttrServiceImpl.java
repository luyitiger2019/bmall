package com.ty.bmall.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ty.bmall.bean.PmsBaseAttrInfo;
import com.ty.bmall.bean.PmsBaseAttrValue;
import com.ty.bmall.mapper.PmsBaseAttrInfoMapper;
import com.ty.bmall.mapper.PmsBaseAttrValueMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

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

    /**
     * 保存商品属性
     *
     * @param attrInfo
     * @return
     */
    @Override
    public String saveAttInfo(PmsBaseAttrInfo attrInfo) {
        String id = attrInfo.getId();
        if (StringUtils.isBlank(id)) {
            // 保存属性
            pmsBaseAttrInfoMapper.insertSelective(attrInfo);
            List<PmsBaseAttrValue> attrValueList = attrInfo.getAttrValueList();
            //保存属性值
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                //设置属性的组件
                pmsBaseAttrValue.setAttrId(attrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);

            }
        } else {
            //如果ID为空，为修改操作
            Example example = new Example(PmsBaseAttrInfo.class);
            example.createCriteria().andEqualTo("id", attrInfo.getId());
            pmsBaseAttrInfoMapper.updateByExampleSelective(attrInfo, example);
            //修改属性值
            List<PmsBaseAttrValue> attrValueList = attrInfo.getAttrValueList();
            //按照属性ID删除属性值
            PmsBaseAttrValue pmsBaseAttrValueDel = new PmsBaseAttrValue();
            pmsBaseAttrValueDel.setAttrId(attrInfo.getId());
            pmsBaseAttrValueMapper.delete(pmsBaseAttrValueDel);
            //删除后将新的属性值插入
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                // pmsBaseAttrValue.setAttrId(null);
                pmsBaseAttrValue.setAttrId(attrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }

        return "success";
    }
}
