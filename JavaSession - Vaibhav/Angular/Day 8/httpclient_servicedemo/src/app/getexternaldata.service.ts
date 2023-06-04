import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class GetexternaldataService {


  postData:any = [];

  _httpObj:HttpClient;


  constructor(_httpObjREF:HttpClient)
  {
      this._httpObj = _httpObjREF;
  }

  getPostData()
  {
    this._httpObj.get('https://jsonplaceholder.typicode.com/posts').subscribe( (data)=>{
    console.log(data);  
    this.postData = data;
    })
  }
}
