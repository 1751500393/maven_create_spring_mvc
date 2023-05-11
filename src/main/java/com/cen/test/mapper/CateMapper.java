package com.cen.test.mapper;

import com.cen.test.object.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CateMapper {
    /**
     * 相同表，进行多表查询
     *
     * @return cateDTO集合
     */
    public List<CategoryDTO> selectCateVOList();
}
