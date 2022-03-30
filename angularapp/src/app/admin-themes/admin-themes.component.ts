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


  displayStyle = "none";
  openPopup(Addon: any) {
    this.displayStyle = "block";
    this.themesUpdate = Addon;
  }
  close() {
    this.displayStyle = "none";
  }
  onUpdateTheme() {
    this.adminThemesService.updateTheme(this.themesUpdate).subscribe(data => {
      console.log(data);
    })
  }

  themesUpdate: any = {
    themeId: "",
    themeName: "",
    themeImageURL: "",
    themePhotographer: "",
    themeVideographer: "",
    themeReturnGift: "",
    themeCost: "",

  }

}
