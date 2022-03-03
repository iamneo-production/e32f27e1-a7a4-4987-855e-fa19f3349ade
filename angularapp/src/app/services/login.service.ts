import { Injectable } from '@angular/core';
import baseUrl from './helper';
import { HttpClient} from '@angular/common/http';


interface loginModel{
  email,
  password

}

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  public getLoginRole(loginData:loginModel){
    console.log(loginData);
    console.log(JSON.stringify(loginData));
    return this.http.post(`${baseUrl}/api/login`,loginData);
  }

  
}
