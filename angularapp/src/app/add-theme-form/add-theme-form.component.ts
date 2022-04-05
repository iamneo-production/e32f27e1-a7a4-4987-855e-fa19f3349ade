import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminThemesService } from '../admin-themes.service';
import { Themes } from '../themes';

@Component({
  selector: 'app-add-theme-form',
  templateUrl: './add-theme-form.component.html',
  styleUrls: ['./add-theme-form.component.css']
})
export class AddThemeFormComponent implements OnInit {
  public theme: Themes[] = [];
  constructor(private adminThemesService: AdminThemesService, private route: Router) { }
  
  ngOnInit(): void {
    this.getThemes();
  }

  public getThemes(): void {
    this.adminThemesService.getThemes().subscribe(
      (response: Themes[]) => {
        this.theme = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  go() {
    this.route.navigate(['admin/Themes']);
  }

  public onAddTheme(addForm: NgForm): void {
    let flag = 0;
    this.theme.forEach((data) => {
      if (addForm.value.themeName === data.themeName) {
        window.alert("Theme Name already Exists");
        flag = 1;
        return;
      }
    });
    if (flag === 1)
      return;
    this.addTheme(addForm);
  }

  public addTheme(addForm: NgForm): void {
    this.go();
    this.adminThemesService.addThemes(addForm.value).subscribe(
      (response: Themes) => { },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  } 
}
