package cn.itheima.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.springmvc.pojo.Items;
import sun.nio.cs.ext.MacArabic;

@Controller
public class ItemController {

	// 入门查询 第一
	// @RequestMapping：里面放的是请求的url，和用户请求的url进行匹配
	// action可以写也可以不写
	@RequestMapping(value = "/item/itemlist")
	public ModelAndView itemList() {
		// 创建页面需要显示的商品数据
		List<Items> list = new ArrayList<>();
		list.add(new Items(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
		list.add(new Items(2, "2华为 荣耀8", 2399f, new Date(), "质量好！2"));
		list.add(new Items(3, "3华为 荣耀8", 2399f, new Date(), "质量好！3"));
		list.add(new Items(4, "4华为 荣耀8", 2399f, new Date(), "质量好！4"));
		list.add(new Items(5, "5华为 荣耀8", 2399f, new Date(), "质量好！5"));
		list.add(new Items(6, "6华为 荣耀8", 2399f, new Date(), "质量好！6"));

		// 创建ModelAndView，用来存放数据和视图
		ModelAndView modelAndView = new ModelAndView();
		// 设置数据到模型中
		modelAndView.addObject("itemList", list);
		// 设置视图jsp，需要设置视图的物理地址
		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");

		return modelAndView;
	}

}
