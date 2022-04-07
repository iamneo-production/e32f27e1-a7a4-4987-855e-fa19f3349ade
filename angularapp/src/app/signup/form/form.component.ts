import { Component, OnInit, ViewChild } from '@angular/core';
import Swal from 'sweetalert2';
import { SignupService } from 'src/app/services/signup.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { UserModel } from 'src/app/models/User.model';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
})
export class FormComponent implements OnInit {
  @ViewChild('f') sform: NgForm;
  enableCss='animate-bounce bg-blue-300 border-2 border-blue-200 hover:bg-green-200 hover:border-green-100 transition duration-[3s]'
  disableCss='bg-red-500 border-2 border-red-200'
  constructor(private router:Router,private signupService:SignupService) {}
  ngOnInit(): void {
  }

  onSubmit(form:NgForm){
    console.log(form.value)
    console.log(form.valid);
    const user = new UserModel("User",form.value.email,form.value.password,form.value.username,form.value.mobileNumber)
     this.signupService.addUser(user).subscribe(
        (data)=>{
          console.log(data);
          Swal.fire('Success','User <b>"'+user.getEmail()+'"</b> is successfully registered','success');
          form.reset()
          this.router.navigate([''])
        },
        (error)=>{
          console.log(error);
          Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: `${error.error}`
      })
        }
      )
  }
}