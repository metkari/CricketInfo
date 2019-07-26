package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Player;
import com.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired 
	PlayerService playerService;
	
	@RequestMapping("/")
	public ModelAndView first() {
		
		System.out.println("login successfiull");
		//HashMap<String,Object> model=new HashMap<>();
		ModelAndView model =new ModelAndView();
		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addObject("list",playerList);
		model.addObject("command",new Player());
		model.setViewName("Player");
		
		//return new ModelAndView("redirect:/playerList");
		return model;
	}
	
	@RequestMapping("/playerList")
	public ModelAndView allPlayers(ModelMap model) {
		
		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addAttribute("list",playerList);
		
		return new  ModelAndView("playerList",model);
	}
	
	@RequestMapping("/delete{id}")
	public ModelAndView deleteList(@PathVariable Long id,ModelMap model) {
		
		//Long playerNo=Long.parseLong(id);
		playerService.deletePlayer(id);
		model.addAttribute("msg", "Record deleted");
		
		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addAttribute("list",playerList);
		return new  ModelAndView("Player","command",new Player());
	}
	
	@RequestMapping("/update{id}")
	public ModelAndView editList(@PathVariable Long id,ModelMap model) {
		
		//Long playerNo=Long.parseLong(id);
		Player player=playerService.getPlayer(id);
		
		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addAttribute("list",playerList);
		
		return new  ModelAndView("Player","command",player);
	}
	
	
	@RequestMapping(value="/savePlayer", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("command") Player playerObj, BindingResult resultset, ModelMap model) {
		
		System.out.println("Save "+playerObj.getPlayerNo());
		System.out.println("Save "+playerObj.getPlayerName());
		System.out.println("Save "+playerObj.getPlayerAge());
		//playerObj.setPlayerNo(1112);;
		
		String msg=playerService.addPlayerDetails(playerObj);
		
		
		if(msg.equals("Success"))
			model.addAttribute("msg","Data saved");
		else
			model.addAttribute("msg","Exception Occurred");
		

		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addAttribute("list",playerList);
		
		return new ModelAndView("Player","command",model);
	}
	
	@RequestMapping("/index")
	public String print() {
		
		System.out.println("Hello...");
		
		return "home";
	}

}
