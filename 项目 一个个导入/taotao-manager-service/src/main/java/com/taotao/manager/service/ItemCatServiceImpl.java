package com.taotao.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;

@Service
public class ItemCatServiceImpl extends BaseServiceImpl<ItemCat> implements ItemCatService {
	
/*	@Autowired
	private ItemCatService itemService;
	@RequestMapping("query/{page}")
	@ResponseBody
	@Override
	public List<ItemCat> queryItemCat(@PathVariable("page") Integer page, Integer rows) {
		List<ItemCat> list = this.itemService.queryListByPage(page, rows);
		return list;
	}*/
	@Override
	public List<ItemCat> queryItemCatByParentId(Long parentId) {
		// 设置查询条件
		ItemCat param = new ItemCat();
		param.setParentId(parentId);
		List<ItemCat> list = super.queryListByWhere(param);
		return list;

	}

	@Override
	public List<ItemCat> queryItemCat(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Autowired
	private ItemCatMapper itemMapper;
	@Override
	public List<ItemCat> queryItemCat(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<ItemCat> items = itemMapper.select(null);
		return items;
	}*/

}
