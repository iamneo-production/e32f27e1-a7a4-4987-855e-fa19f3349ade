import { Component, OnInit,ViewEncapsulation } from '@angular/core';
import Swal from 'sweetalert2';
import { MatSnackBar} from '@angular/material/snack-bar';
import { SignupService } from 'src/app/services/signup.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
  encapsulation: ViewEncapsulation.None,
})
export class FormComponent implements OnInit {
  // userRole = 'Select Customer Type';
  // show = false;
  constructor(private signupService:SignupService,private snack:MatSnackBar) {}

  model = {
    userRole: "1",
    email:'',
    mobileNumber: '',
    password: '',
  }
  username:String = ''; 
  confirmPassword:String='';
  ngOnInit(): void {}
  
  onSubmit(e:any){
    console.log(this.model)
    // Log for response
    if(this.model.email=='' || this.model.email==null){
      this.snack.open("Email is required !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    else if(!(this.model.email.includes('@') && this.model.email.includes('.com'))){
      this.snack.open("Please give a valid Email! Valid email should contains: '@' and '.com'.",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    else if(this.model.mobileNumber=='' || this.model.mobileNumber==null){
      this.snack.open("Phone No is required !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }else if(this.model.mobileNumber.length!=10 ){
      this.snack.open("Mobile No should be of 10 Digits !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }else if(!(this.model.mobileNumber.startsWith('9') || this.model.mobileNumber.startsWith('8') || this.model.mobileNumber.startsWith('7') || this.model.mobileNumber.startsWith('6') || this.model.mobileNumber.startsWith('0'))){
      this.snack.open("Mobile No should start with 9, 8 or 7 !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    else if(this.model.password=='' || this.model.password==null){
      this.snack.open("Password is required !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }
    

    if(this.model.password!=this.confirmPassword){
      this.snack.open("Confirm password and Password does Not Match!",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
      return;
    }

    if(this.model.userRole === "1"){
      this.snack.open("Select your Role First !",'',{
        duration:3000,
        panelClass: 'custom-css-class'
      });
    }
    else if(this.model.userRole == "2"){
      console.log({...this.model,userRole: "Admin"});
      this.signupService.addAdmin({...this.model,userRole: "Admin"}).subscribe(
        (data)=>{
          console.log(data);
          Swal.fire('Success','Admin "'+this.model.email+'" is successfully registered','success');
        },
        (error)=>{
          console.log(error);
          this.snack.open('Something went wrong !!','',{
            duration:3000,
            panelClass: 'custom-css-class'
          })
        }
      )
    }
    else{
      this.signupService.addUser({...this.model,userRole: "User",username:this.username}).subscribe(
        (data)=>{
          console.log(data);
          Swal.fire('Success','User "'+this.model.email+'" is successfully registered','success');
        },
        (error)=>{
          console.log(error);
          this.snack.open('Something went wrong !!','',{
            duration:3000,
            panelClass: 'custom-css-class'
          })
        }
      )
    }
    }
    // typeToggler(r: string) {
    // this.show = !this.show;
    // this.userRole = r;
  
}
