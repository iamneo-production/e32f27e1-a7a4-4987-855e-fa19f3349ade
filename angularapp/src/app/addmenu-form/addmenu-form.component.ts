import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminFoodmenuService } from '../admin-foodmenu.service';
import { Foodmenu } from '../foodmenu';

@Component({
  selector: 'app-addmenu-form',
  templateUrl: './addmenu-form.component.html',
  styleUrls: ['./addmenu-form.component.css']
})
export class AddmenuFormComponent implements OnInit {

  constructor(private adminFoodMenuService: AdminFoodmenuService, private route: Router) { }

  ngOnInit(): void {
  }

  go() {
    this.route.navigate(['admin/foodmenu']);
  }

  public onAddMenu(addForm: NgForm): void {
    this.go();
    this.adminFoodMenuService.addMenu(addForm.value).subscribe(
      (response: Foodmenu) => { },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
