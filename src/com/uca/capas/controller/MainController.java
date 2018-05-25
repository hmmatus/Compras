package com.uca.capas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {
	 ArrayList<Producto> productos=new ArrayList<>();
	 ArrayList<Double> totales=new ArrayList<>();
	 Double total=0.0;
	
	@RequestMapping("/index")
	public ModelAndView initMain() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/products")
	public ModelAndView products(@RequestParam(value="user") String user,
			@RequestParam(value="pass") String pass) {
		ModelAndView mav=new ModelAndView();
		String userv="hmmatus",passv="money";

		if(user.equals(userv) && pass.equals(passv)) {
			try {
				Producto tag=new Producto(1,"Placa Wolverine","Placa de metal",32.50,"wolverine.jpg");
				Producto leon=new Producto(2,"Placa Leon Kennedy","Identificacion de policia",25,"placa.jpg");
				Producto ahegao=new Producto(3,"Ahegao Sweater","Sueter Ahegao :V",50,"ahegao.jpg");
				Producto nineon=new Producto(4,"1911","Pistola militar 1911",600,"nineone.jpg");
				productos.add(tag);
				productos.add(leon);
				productos.add(ahegao);
				productos.add(nineon);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			mav.addObject("productos",productos);
			mav.setViewName("productos");
		}
		else {
			mav.addObject("error", "Credenciales invalidas");
			mav.setViewName("index");
		}
		return mav;
	}
	
	@RequestMapping("/compras")
	public ModelAndView compras(@RequestParam(value="product") Double precio) {
		ModelAndView mav=new ModelAndView();
		totales.add(precio);
		total+=precio;
		mav.addObject("total", total);
		mav.addObject("productos",productos);
		mav.setViewName("productos");
		return mav;
	}

}
