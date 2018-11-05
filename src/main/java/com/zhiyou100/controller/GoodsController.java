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
	      //PageHelper.startPage(page, pageSize);��δ����ʾ������ʼ��ҳ�ˣ�
		 //pageĬ��ֵ��1��pageSizeĬ����10����˼�Ǵӵ�1ҳ��ʼ��ÿҳ��ʾ10����¼��
	      PageHelper.startPage(page, 3);
	      //��ѯ
	      List<Goods> goods = goodsService.queryAll();
	      //����PageInfo���󣬱����ѯ���Ľ����PageInfo��pageHelper�еĶ���
	      PageInfo<Goods> p=new PageInfo<Goods>(goods);
	      //�����ݴ�ŵ�request����
	      request.setAttribute("page", p);
	      request.setAttribute("goods",goods);
	      //����ҳ��
	      return "show";
	  }
}
