package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Assort;

import java.util.List;

public interface IAssortService {
    public List<Assort> getAssorts();
    public List<Assort> getAssort1s();
    public List<Assort> getAssort2s(Integer parentId);
    public Assort getAssort(Integer id);
    public List<Assort> getAssortList();
    public int addAssort(Assort assort);
    public int editAssort(Assort assort);
}
