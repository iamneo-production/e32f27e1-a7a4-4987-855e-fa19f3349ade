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

  displayStyle = "none";
  openPopup(res: any) {
    this.displayStyle = "block";
    this.menuUpdate = res;
  }
  close() {
    this.displayStyle = "none";
  }
  onUpdateMenu() {
    this.adminFoodmenuService.updateMenu(this.menuUpdate).subscribe(data => {
      console.log(data);
    })
  }

  menuUpdate: any = {
    id: "",
    foodImageUrl: "",
    foodMenuItems: "",
    foodMenuType: "",
    foodMenuCost: "",
  }

}
