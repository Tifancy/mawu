package com.zm.mw.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.common.action.BaseController;

@Controller
@RequestMapping("/admin")
public class IndexController extends BaseController {
	@RequestMapping("index")
	public String index() {
		return "admin/index";
	}
}
