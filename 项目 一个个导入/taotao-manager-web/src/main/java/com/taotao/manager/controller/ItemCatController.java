package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

@Controller
@RequestMapping("item/cat")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	@RequestMapping("query/{page}")
	@ResponseBody
	public List<ItemCat> queryItemCat(@PathVariable Integer page,@RequestParam("row") Integer row)
	{
		List list = itemCatService.queryByPage(page, row);
		return list;
	}
	
	// url:'/rest/item/cat?id={nodeId}',
	// method:'GET',
	// 第一次请求是没有id参数，需要设置默认的parentId为0，查询一级类目
	/**
	 * 根据parentId查询类目
	 * 
	 * @param parentId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<ItemCat> queryItemCatByParentId(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		List<ItemCat> list = this.itemCatService.queryItemCatByParentId(parentId);

		return list;
	}


}
