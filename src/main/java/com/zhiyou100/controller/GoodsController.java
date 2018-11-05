package com.zhiyou100.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.entity.Goods;
import com.zhiyou100.service.IGoodsService;

@Controller
public class GoodsController {

	@Resource(name="goodsService")
	private IGoodsService goodsService;
	
	@RequestMapping("goods.do")
	  public String userList(@RequestParam(required=true,defaultValue="1") Integer page,
			  HttpServletRequest request){
	      //PageHelper.startPage(page, pageSize);这段代码表示，程序开始分页了，
		 //page默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
	      PageHelper.startPage(page, 3);
	      //查询
	      List<Goods> goods = goodsService.queryAll();
	      //创建PageInfo对象，保存查询出的结果，PageInfo是pageHelper中的对象
	      PageInfo<Goods> p=new PageInfo<Goods>(goods);
	      //将数据存放到request域中
	      request.setAttribute("page", p);
	      request.setAttribute("goods",goods);
	      //返回页面
	      return "show";
	  }
}
