import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { AdminFoodmenuService } from '../admin-foodmenu.service';
import { Foodmenu } from '../foodmenu';


@Component({
  selector: 'app-admin-foodmenu',
  templateUrl: './admin-foodmenu.component.html',
  styleUrls: ['./admin-foodmenu.component.css']
})
export class AdminFoodmenuComponent implements OnInit {

  public foodmenu: Foodmenu[] = [];

  constructor(private adminFoodmenuService: AdminFoodmenuService) { }

  ngOnInit() {
    this.getAllMenu();
  }

  menuUpdate: Foodmenu = {
    id: 0,
    foodImageUrl: "",
    foodMenuItems: "",
    foodMenuType: "",
    foodMenuCost: 0,

  }

  public getAllMenu(): void {
    this.adminFoodmenuService.getAllMenu().subscribe(
      (response: Foodmenu[]) => {
        this.foodmenu = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onDeleteMenu(data: any) {
    this.adminFoodmenuService.deleteMenu(data.id)
      .subscribe(res => {
        alert("Deleted Successfully");
        this.getAllMenu();
      })
  }

  onUpdateMenu(menuUpdate: Foodmenu) {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "none";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "1";
    this.adminFoodmenuService.updateMenu(menuUpdate).subscribe(
      (response: Foodmenu) => {
        console.log(response);
        this.getAllMenu();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  show(menuUpdate: Foodmenu) {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "block";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "0.3";
    this.menuUpdate = menuUpdate;
  }

  close() {
    var t = document.getElementById("hide") as HTMLElement;
    t.style.display = "none";
    var con = document.getElementById("main-container") as HTMLElement;
    con.style.opacity = "1";

  }

}
