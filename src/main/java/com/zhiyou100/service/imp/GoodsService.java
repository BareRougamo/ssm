package com.zhiyou100.service.imp;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.zhiyou100.dao.IGoodsDao;
import com.zhiyou100.entity.Goods;
import com.zhiyou100.service.IGoodsService;

@Service("goodsService")
public class GoodsService implements IGoodsService{

	@Resource
	private IGoodsDao goodsDao;

	public List<Goods> queryAll() {
		return goodsDao.queryAll();
	}
	
}
