import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { AdminThemesService } from '../admin-themes.service';
import { Themes } from '../themes';
@Component({
  selector: 'app-admin-themes',
  templateUrl: './admin-themes.component.html',
  styleUrls: ['./admin-themes.component.css']
})
export class AdminThemesComponent implements OnInit {
  public theme: Themes[] = [];

  constructor(private adminThemesService: AdminThemesService) { }

  ngOnInit() {
    this.getThemes();
  }

  editTheme: Themes = {
    themeId: 0,
    themeName: "",
    themeImageURL: "",
    themePhotographer: "",
    themeVideographer: "",
    themeReturnGift: "",
    themeCost: 0,
    themeDescription: ""
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

  OnDeleteTheme(i: any) {
    this.adminThemesService.deleteTheme(i.themeId)
      .subscribe(res => {
        this.getThemes();
        alert("Deleted Successfully");

      });
  }

  public onupdateTheme(i: Themes): void {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "none";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "1";
    this.adminThemesService.updateTheme(i).subscribe(
      (response: Themes) => {
        console.log(response);
        this.getThemes();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  show(i: Themes) {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "block";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "0.3";
    this.editTheme = i;
  }

  close() {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "none";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "1";
  }

}
