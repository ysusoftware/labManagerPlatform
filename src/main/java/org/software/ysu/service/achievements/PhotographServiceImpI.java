package org.software.ysu.service.achievements;

import org.software.ysu.dao.PhotographMapper;
import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.PhotographExample;
import org.software.ysu.service.Interface.IPhotographService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhotographServiceImpI implements IPhotographService {

    @Resource
    PhotographMapper photographMapper;
    @Override
    public int addPhoto(Photograph photograph) {
        return photographMapper.insert(photograph);

    }

    @Override
    public int modify(Photograph photograph) {

        return photographMapper.updateByPrimaryKeyWithBLOBs(photograph);
    }

    @Override
    public int remove(int photoId) {
        return photographMapper.deleteByPrimaryKey(photoId);
    }

    @Override
    public List<Photograph> selectAll(PhotographExample example) {
        return photographMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Photograph> selectByDes(String photoDes) {
        PhotographExample example=new PhotographExample();
        example.createCriteria().andPhotoDesLike(photoDes);
        return photographMapper.selectByExampleWithBLOBs(example);
    }
}
