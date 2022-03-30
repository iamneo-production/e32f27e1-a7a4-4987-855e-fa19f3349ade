import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddThemeFormComponent } from './add-theme-form/add-theme-form.component';
import { AddmenuFormComponent } from './addmenu-form/addmenu-form.component';
import { AdminFoodmenuComponent } from './admin-foodmenu/admin-foodmenu.component';
import { AdminThemesComponent } from './admin-themes/admin-themes.component';

const routes: Routes = [
  {
    path: 'admin',
    children: [
      {
        path: 'Themes',
        component: AdminThemesComponent
      },
      {
        path: 'addThemes',
        component: AddThemeFormComponent
      },
      {
        path: 'foodmenu',
        component: AdminFoodmenuComponent
      },
      {
        path: 'addItems',
        component: AddmenuFormComponent
      },
    ]
  }
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
