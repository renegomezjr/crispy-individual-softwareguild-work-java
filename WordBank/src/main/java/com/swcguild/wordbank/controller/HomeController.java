package com.swcguild.wordbank.controller;

import com.swcguild.wordbank.dao.Dictionary;
import com.swcguild.wordbank.dto.WordAndDef;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    //method1
    //List<String> dictionary = new ArrayList<>();
    Dictionary dictionary = new Dictionary();
        
    public HomeController() {
    }
    
    @RequestMapping(value={"/","/index"}, method=RequestMethod.GET)
    public String indexWithForm() {
        
        return "index";
    }
    
    //method1
//    @RequestMapping(value="getWordForm", method=RequestMethod.POST)
//    public String gettingWordAndDef(Model model, HttpServletRequest req){
//        String wordDef = req.getParameter("word") + " : " +req.getParameter("definition");
//       
//        dictionary.add(wordDef);
//        
//        model.addAttribute("dictionary", this.dictionary);
//        
//        return "index";
//    }
    
//    method2
    @RequestMapping(value="getWordForm", method=RequestMethod.POST)
    public String gettingWordAndDef(Model model, HttpServletRequest req){
        String word = req.getParameter("word");
        String def = req.getParameter("definition");
        
        WordAndDef wordDef = new WordAndDef(word, def);
        dictionary.addWord(wordDef);
        
        model.addAttribute("dictionary",dictionary.getAllWords());
        
        return "index";
        
    }
    
    @RequestMapping(value="/word/{wordParam}", method=RequestMethod.GET)
    @ResponseBody
    public WordAndDef getWordAndDef(@PathVariable("wordParam")String word){
        
        return new WordAndDef("Car", "Cool");
    }
}
