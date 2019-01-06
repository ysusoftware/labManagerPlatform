package org.software.ysu.service.achievements;

import org.software.ysu.dao.DatumMapper;
import org.software.ysu.pojo.Datum;
import org.software.ysu.pojo.DatumExample;
import org.software.ysu.service.Interface.IDatumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2019/1/5 9:56
 * @Description 内部资源管理的实现service
 * @Version 1.0
 **/
@Service
public class DatumServiceImpl implements IDatumService {
    @Resource
    DatumMapper datumMapper;
    @Override
    public Integer addDatum(Datum datum) {
        return datumMapper.insertSelective(datum);
    }

    @Override
    public Integer delDatum(Integer id) {
        return datumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Datum> getDatums(DatumExample datumExample) {
        return datumMapper.selectByExample(datumExample);
    }

    @Override
    public Datum getDatum(Integer datumId) {
        return datumMapper.selectByPrimaryKey(datumId);
    }
}
