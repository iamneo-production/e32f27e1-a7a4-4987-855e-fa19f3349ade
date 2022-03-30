import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminThemesComponent } from './admin-themes/admin-themes.component';
import { AddThemeFormComponent } from './add-theme-form/add-theme-form.component';
import { AdminFoodmenuComponent } from './admin-foodmenu/admin-foodmenu.component';
import { AddmenuFormComponent } from './addmenu-form/addmenu-form.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AdminThemesComponent,
    AddThemeFormComponent,
    AdminFoodmenuComponent,
    AddmenuFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
