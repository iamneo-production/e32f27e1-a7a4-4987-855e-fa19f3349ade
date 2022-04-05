import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Themes } from './themes';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AdminThemesService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getThemes(): Observable<Themes[]> {
    return this.http.get<Themes[]>(`${this.apiServerUrl}/getAllThemes`);
  }

  public addThemes(data: Themes): Observable<Themes> {
    return this.http.post<Themes>(`${this.apiServerUrl}/addTheme`, data);
  }

  public updateTheme(data: Themes): Observable<Themes> {
    return this.http.put<Themes>(`${this.apiServerUrl}/editTheme/${data.themeId}`, data);
  }

  public deleteTheme(themeId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/deleteThemes/${themeId}`);
  }

}
