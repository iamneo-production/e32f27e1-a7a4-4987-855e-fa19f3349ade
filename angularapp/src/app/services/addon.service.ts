import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
import { AddonModel } from '../models/AddOn.model';

@Injectable({
  providedIn: 'root'
})
export class AddonService {

  constructor(private httpClient: HttpClient) {}
    
  public saveAddOn(addOn : AddonModel){
    return this.httpClient.post(baseUrl+'/addOn/save', addOn)
  }

  public updateAddOn(addOn : AddonModel){
    return this.httpClient.post(baseUrl+'/addOn/update', addOn)
  }

}

