package com.examly.springapp.controller;

import com.examly.springapp.models.ThemeModel;
import com.examly.springapp.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThemeController {
    private ThemeService themeService;

    @Autowired
    public ThemeController(ThemeService themeService) {
        this.themeService = themeService;
    }

    @GetMapping("/getAllThemes")
    public List<ThemeModel> getThemes() {
        return themeService.getThemes();
    }

    @GetMapping("/getTheme/{themeId}")
    public ThemeModel getThemeById(@PathVariable("themeId") Long themeId){
        return themeService.getTheme(themeId);
    }

    @PutMapping("/editTheme/{themeId}")
    public ThemeModel updateTheme(@PathVariable("themeId") Long themeId,@RequestBody ThemeModel themeModel){
        return themeService.updateTheme(themeId,themeModel);
    }

    @DeleteMapping("/deleteThemes/{themeId}")
    public String deleteTheme(@PathVariable("themeId") Long themeId) {
        return themeService.deleteById(themeId);
    }

    @PostMapping("/addTheme")
    public ThemeModel addThemes(@RequestBody ThemeModel themeModel){
        return themeService.saveTheme(themeModel);
    }
}
