package com.example.dependency.rest;

import jakarta.annotation.PostConstruct;
import com.example.dependency.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.example.dependency.tax.Taxable;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DeveloperController {
private Taxable tax;

   @Value("${instructor.name}")
   private String name;
   @Value("${instructor.surname}")
   private String surname;
   private Map<Integer, Developer> developers;
   @PostConstruct
   public void init(){
      developers=new HashMap<>();
   }
   @GetMapping("/welcome")
   public String welcome(){
      return name+""+surname+ "says hi";
   }
   @Autowired
   public DeveloperController(@Qualifier ("developerTax") Taxable taxable){

      this.tax=taxable;
   }

   @GetMapping("/")
   public List<Developer> get(){

return developers.values().stream().toList();
   }
   @GetMapping("/{id}")
   public Developer get(@PathVariable int id){
      if(id<0){
         return null;
      }
      if(!developers.containsKey(id)){
         return  null;

      }
      return developers.get(id);
   }

   @PostMapping("/")
   public Developer post(@RequestBody Developer developer){
      if(developers.containsKey(developer.getId())){
         return null;

      }
      Developer b=new Developer(developer.getId(), developer.getName(), developer.getSalary(), developer.getExperience());
      developers.put(b.getId(),b);
      return b;


   }
}
