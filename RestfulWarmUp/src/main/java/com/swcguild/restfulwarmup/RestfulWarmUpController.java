package com.swcguild.restfulwarmup;

import com.swcguild.restfulwarmup.dto.RandomNumber;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulWarmUpController {

    private RandomNumber randomNumber = new RandomNumber();
    Random r = new Random();

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = "/randomNumber", method = RequestMethod.GET)
    @ResponseBody
    public int getRandomNumber() {
        return randomNumber.getRandomNumber();
    }

    @RequestMapping(value = "/dieRoll/sides/{numSides}", method = RequestMethod.POST)
    @ResponseBody
    public int rollDie(@PathVariable("numSides") int numSides) {
        return r.nextInt(numSides) + 1;
    }

    @RequestMapping(value = "/randomAnimal", method = RequestMethod.GET)
    @ResponseBody
    public String getRandomAnimal() {
        String[] animals = {"Dog", "Cat", "Mouse", "Chicken"};

        return animals[r.nextInt(animals.length)];
    }

    @RequestMapping(value = "/compliment", method = RequestMethod.POST)
    @ResponseBody
    public String getRandomCompliment(@RequestBody String name) {
        String compliment = "";

        String[] compliments = {
            "Your smile is contagious, %s.",
            "You look great today, %s.",
            "You're a smart cookie, %s.",
            "I bet you make babies smile, %s.",
            "You have impeccable manners, %s.",
            "I like your style, %s.",
            "You have the best laugh, %s.",
            "I appreciate you, %s.",
            "You are the most perfect you there is, %s.",
            "You are enough, %s."
        };
        
        compliment = String.format(compliments[r.nextInt(compliments.length)], name);
        
        return compliment;
    }
}
