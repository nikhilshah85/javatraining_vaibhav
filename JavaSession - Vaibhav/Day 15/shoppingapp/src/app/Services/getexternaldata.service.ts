import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetexternaldataService {

  _http:HttpClient;

  constructor(_httpREF:HttpClient) 
  {
    this._http = _httpREF;
  }
  
    allProducts:any;

    getAllProducts()
    {
      this._http.get('https://fakestoreapi.com/products').subscribe( (result) =>
      {
        // console.log(result);
        this.allProducts = result;
        console.log(this.allProducts);
      })
    
    
    }





}



