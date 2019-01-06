package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Datum;
import org.software.ysu.pojo.DatumExample;

import java.util.List;

/**
 * @author Erisu
 * @date 2019/1/5 9:52
 * @Description 内部资料管理service
 * @Version 1.0
 **/
public interface IDatumService {
    public Integer addDatum(Datum datum);
    public Integer delDatum(Integer id);
    public List<Datum> getDatums(DatumExample datumExample);
    public Datum getDatum(Integer datumId);
}
