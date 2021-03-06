import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { FormComponent } from './signup/form/form.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './dashboard/admin/admin.component';
import { UserComponent } from './dashboard/user/user.component';
import { HomePageComponent } from './dashboard/home-page/home-page.component';
import { UserEventComponent } from './user-event/user-event.component';
import { AdminAddonsComponent } from './admin-addons/admin-addons.component';
import { AdminAddAddonsComponent } from './admin-addons/admin-add-addons/admin-add-addons.component';
import { AboutComponent } from './about/about.component';
import { ConfirmEqualValidatorDirective } from './shared/confirm-equal-validator.directive';


@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    FormComponent,
    LoginComponent,
    AdminComponent,
    UserComponent,
    HomePageComponent,
    UserEventComponent,
    AdminAddonsComponent,
    AdminAddAddonsComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    HttpClientModule,
    FormsModule,
    MatSnackBarModule,
    ReactiveFormsModule,
    ConfirmEqualValidatorDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
