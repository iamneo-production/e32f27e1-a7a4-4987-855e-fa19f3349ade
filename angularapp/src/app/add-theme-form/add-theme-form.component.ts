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
  constructor(private adminThemesService: AdminThemesService, private route: Router) { }
  
  ngOnInit(): void {
  }

  go() {
    this.route.navigate(['admin/Themes']);
  }

  public onAddTheme(addForm: NgForm): void {
    this.go();
    this.adminThemesService.addThemes(addForm.value).subscribe(
      (response: Themes) => { },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
  
}
