import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import { SignupComponent } from './signup/signup.component';
import { FormComponent } from './signup/form/form.component';
>>>>>>> a9e06c431505aa608036745e197f98412f5e1ded
=======
import { SignupComponent } from './signup/signup.component';
import { FormComponent } from './signup/form/form.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { MatSnackBarModule } from '@angular/material/snack-bar';
>>>>>>> vikash
=======
import { SignupComponent } from './signup/signup.component';
import { FormComponent } from './signup/form/form.component';
>>>>>>> 58a9f56784891f5760ec582cf20ba44a68e1f323

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    FormComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    HttpClientModule,
    FormsModule,
    MatSnackBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
