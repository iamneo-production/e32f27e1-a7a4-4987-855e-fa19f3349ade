import { Component, OnInit,ViewEncapsulation } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  encapsulation: ViewEncapsulation.None,
})
export class LoginComponent implements OnInit {

  loginForm : FormGroup;
  constructor(private snack:MatSnackBar,private loginService:LoginService) { }

  loginData={
    email:'',
    password:''
  }

  ngOnInit(): void {
    this.loginForm = new FormGroup({
      email : new FormControl('',[Validators.required,Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")]),
      password: new FormControl('',Validators.required)
    })
  }

  onLogin(e:any){
    if(this.loginData.email=='' || this.loginData.email==null){
      this.snack.open("Email is required !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    else if(!(this.loginData.email.includes('@') && this.loginData.email.includes('.com'))){
      this.snack.open("Email must contains '@' and '.com'.",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    this.loginService.getLoginRole(this.loginData).subscribe(
      (data:any)=>{
        console.log(data);
      },
      (error)=>{
        console.log(error);
        console.log("error finds");
        if(error.error.text=="Admin" && error.status==200){
          console.log("Admin dashboard here!");
          window.location.href='/admin-dashboard';
        }
        else if(error.error.text=="User" && error.status==200){
          console.log("User Dashboard Here!");
          window.location.href='/user-dashboard';
        }
        else{
          this.snack.open("Invalid Credentials",'',{
            duration:3000,
            panelClass: 'custom-css-class'
          });
          return;
        }
      }
    )

  }

}
