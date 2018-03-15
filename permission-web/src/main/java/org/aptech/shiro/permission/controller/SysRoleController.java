package org.aptech.shiro.permission.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.aptech.shiro.permission.dao.SysRoleDao;
import org.aptech.shiro.permission.pojo.SysRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class SysRoleController {
	@Resource
	private SysRoleDao sysRoleDao;

	public void setSysRoleDao(SysRoleDao sysRoleDao) {
		this.sysRoleDao = sysRoleDao;
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<SysRole> all() throws Exception {
		return sysRoleDao.getAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> add(SysRole sysRole)throws Exception{
		Map<String,Object> map=new HashMap<>();
		sysRoleDao.add(sysRole);
		map.put("result",true);
		return map;
	}
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(SysRole sysRole){
		Map<String, Object> map = new HashMap<>();
		map.put("result", true);
		return map;
	}
	
}






