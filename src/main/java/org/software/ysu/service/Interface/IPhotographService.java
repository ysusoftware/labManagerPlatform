package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.PhotographExample;

import java.util.List;

public interface IPhotographService {
    public int addPhoto(Photograph photograph);
    public int modify(Photograph photograph);
    public int remove(int photoId);
    public List<Photograph> selectAll(PhotographExample example);
    public List<Photograph> selectByDes(String photoDes);
    public int delPhoto(PhotographExample photographExample);
}
