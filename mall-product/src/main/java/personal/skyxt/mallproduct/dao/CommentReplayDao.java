package personal.skyxt.mallproduct.dao;

import personal.skyxt.mallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
