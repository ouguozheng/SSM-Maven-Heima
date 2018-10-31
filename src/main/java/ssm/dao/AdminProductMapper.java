package ssm.dao;

import ssm.entity.Category;
import ssm.entity.Product;
import ssm.vo.ConditionVo;

import java.util.List;

public interface AdminProductMapper {
    public List<Product> findAllProduct();

    public List<Category> findAllCategory();

    public void addProduct(Product product);

    public void delProductById(String pid);

    public Product findProductById(String pid);

    public void updateProduct(Product product);

    public List<Product> findProductListByConditionVo(ConditionVo conditionVo);
}