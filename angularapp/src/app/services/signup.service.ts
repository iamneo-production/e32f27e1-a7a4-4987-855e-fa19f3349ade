import { Injectable } from '@angular/core';
import baseUrl from './helper';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http:HttpClient) { }

  public addAdmin(admin:any){
    return this.http.post(`${baseUrl}/admin/signup`,admin);
  }
  public addUser(user:any){
    return this.http.post(`${baseUrl}/user/signup`,user);
  }
}
