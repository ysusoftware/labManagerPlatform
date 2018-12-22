package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Material;

import java.util.List;

public interface IMaterialService {
    public List<Material> getMaterials();
    public int addMaterial(Material material);
    public Material getMaterial(Integer id);
    public int editMaterial(Material material);
    public List<Material> getMaterial2s(Material material);
}
