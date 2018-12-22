package org.software.ysu.service.achievements;

import org.software.ysu.dao.MaterialMapper;
import org.software.ysu.pojo.Material;
import org.software.ysu.pojo.MaterialExample;
import org.software.ysu.service.Interface.IMaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialServiceImpl implements IMaterialService {
    @Resource
    MaterialMapper materialMapper;
    @Override
    public List<Material> getMaterial2s(Material material) {
        return materialMapper.search(material);
    }

    @Override
    public List<Material> getMaterials() {
        MaterialExample materialExample=new MaterialExample();
        materialExample.createCriteria();
        List<Material> lists=materialMapper.selectByExampleWithBLOBs(materialExample);
        System.out.println(lists);
        return lists;
    }

    @Override
    public int addMaterial(Material material) {
        materialMapper.insertSelective(material);
        return 1;
    }

    @Override
    public Material getMaterial(Integer id) {
        return materialMapper.selectByPrimaryKey(id);
    }

    @Override
    public int editMaterial(Material material) {
        return materialMapper.updateByPrimaryKeySelective(material);
    }
}
