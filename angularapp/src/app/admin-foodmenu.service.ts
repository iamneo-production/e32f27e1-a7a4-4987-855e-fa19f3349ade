import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Foodmenu } from './foodmenu';


@Injectable({
  providedIn: 'root'
})
export class AdminFoodmenuService {

  private apiServerUrl = environment.apiBaseUrl;


  constructor(private http: HttpClient) { }

  public getAllMenu(): Observable<Foodmenu[]> {
    return this.http.get<Foodmenu[]>(`${this.apiServerUrl}/getAllMenu`);
  }

  public addMenu(data: Foodmenu): Observable<Foodmenu> {
    return this.http.post<Foodmenu>(`${this.apiServerUrl}/addMenu`, data);
  }

  public updateMenu(data: Foodmenu): Observable<Foodmenu> {
    return this.http.put<Foodmenu>(`${this.apiServerUrl}/editMenu`, data);
  }

  public deleteMenu(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/deleteMenu/${id}`);
  }
}
