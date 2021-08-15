package mapper;

import models.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;


/**
 * @author Rentaian
 */

@Mapper
@Component
public interface ProductMapper {

    @Select("select * from product where id = #{id}")
    Product selectById(@Param("id") Integer id);


    @Update("update product set stock = stock - 1 where id = #{id}")
    int reduceStock(@Param("id") Integer id);
}
