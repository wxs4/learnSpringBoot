package com.example.myProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class palindromeController {

    @GetMapping("/palindroma/{palabra}")
    public String Palindrome(@PathVariable String palabra) {
        if(isPalindrome(palabra)){
            return "La palabra es "+palabra+" es palindroma";
        }else{
            return "La palabra "+palabra+" no es palidroma";
        }
    }
//somos
    private boolean isPalindrome(String palabra){
        int longitud = palabra.length();
        for(int i=0;i<longitud/2;i++){
            if(palabra.charAt(i)!=palabra.charAt(longitud-i-1)){
                return false;
            }
        }
        return true;
    }
}
