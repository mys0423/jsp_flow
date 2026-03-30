package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {
	private SqlSession sqlSession;
	
	public ProductDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void save(ProductVO productVO) {
		sqlSession.insert("product.insert", productVO);
	}
	
	public List<ProductVO> findAll() {
		return sqlSession.selectList("product.selectAll");
	}
	
	public Optional<ProductVO> find(Long id) {
		ProductVO product = sqlSession.selectOne("product.select", id);
		return Optional.ofNullable(product);
	}
	
	public void update(ProductVO productVO) {
		sqlSession.update("product.update", productVO);
	}
}
