package com.examly.springapp.service;

import com.examly.springapp.models.ThemeModel;
import com.examly.springapp.repo.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    public List<ThemeModel> getThemes() {
        List<ThemeModel> themeModel = new ArrayList<>();
        themeRepository.findAll().forEach(themeModels -> themeModel.add(themeModels));
        return themeModel;
    }

    @Transactional
    public String deleteById(Long themeId) {
        themeRepository.deleteById(themeId);
        return "Deleted Successfully";
    }

    public ThemeModel saveTheme(ThemeModel themeModel) {
        return themeRepository.save(themeModel);
    }

    public ThemeModel getTheme(Long themeId) {
        return themeRepository.findById(themeId).get();
    }

    public ThemeModel updateTheme(Long themeId, ThemeModel themeModel) {
        ThemeModel Get_Theme = new ThemeModel();
        Get_Theme = themeRepository.findById(themeId).get();
        Get_Theme.setThemeName(themeModel.getThemeName());
        Get_Theme.setThemeImageURL(themeModel.getThemeImageURL());
        Get_Theme.setThemeDescription(themeModel.getThemeDescription());
        Get_Theme.setThemePhotographer(themeModel.getThemePhotographer());
        Get_Theme.setThemeVideographer(themeModel.getThemeVideographer());
        Get_Theme.setThemeReturnGift(themeModel.getThemeReturnGift());
        Get_Theme.setThemeCost(themeModel.getThemeCost());
        return themeRepository.save(Get_Theme);
    }
}

