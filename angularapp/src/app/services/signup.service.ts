import { Injectable } from '@angular/core';
import baseUrl from './helper';
import { HttpClient} from '@angular/common/http';
import { UserModel } from '../models/User.model';
import {tap} from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http:HttpClient) { }

  public addAdmin(admin:any){
    return this.http.post(`${baseUrl}/admin/signup`,admin);
  }
  public addUser(user:UserModel){
    return this.http.post(`${baseUrl}/user/signup`,user);
  }
  public getUserByEmail(email:String){
    return this.http.get(`${baseUrl}/user/${email}`
    ).pipe(tap(x=>console.log(x)))
  }
}