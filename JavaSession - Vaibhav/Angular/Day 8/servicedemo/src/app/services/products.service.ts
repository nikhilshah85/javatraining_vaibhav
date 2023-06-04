import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {


  productList:any[] = [
    {pId:101, pName:'Mens-TShirt',pPrice:999, pCategory:'Mens'},
    {pId:102, pName:'Belt',pPrice:8990, pCategory:'Mens'},
    {pId:103, pName:'Toddler Shoes',pPrice:999, pCategory:'Kids'},
    {pId:104, pName:'Make-up Kit',pPrice:999, pCategory:'Female'},
    {pId:105, pName:'Hair Band',pPrice:999, pCategory:'Female'},
    {pId:106, pName:'Baby Powder',pPrice:999, pCategory:'Kids'},
    {pId:107, pName:'Swaddle',pPrice:999, pCategory:'Kids'},
    {pId:108, pName:'Female Tshirt',pPrice:999, pCategory:'Female'},
    {pId:109, pName:'Kids Night Shoes',pPrice:999, pCategory:'Kids'},
    {pId:110, pName:'GYM Bag',pPrice:999, pCategory:'Mens'},
    {pId:111, pName:'Craddle',pPrice:999, pCategory:'Kids'},
    {pId:112, pName:'Mens Deo',pPrice:999, pCategory:'Mens'},
    {pId:113, pName:'Tie',pPrice:999, pCategory:'Mens'},
    {pId:114, pName:'Saree',pPrice:999, pCategory:'Female'},
    {pId:115, pName:'High-Heel Sandals',pPrice:999, pCategory:'Female'},
    {pId:116, pName:'Baby Powder',pPrice:999, pCategory:'Kids'},
  ]


  mensProductList:any[] = [];  
  kidsProductList:any[] = [];  
 femaleProductList:any[] = [];

 maleProducts()
 {
  for (let i = 0; i < this.productList.length; i++) {
   
    if (this.productList[i].pCategory == 'Mens')
    {
      this.mensProductList.push(this.productList[i]);  
    } 
  }
 }

 femaleProducts()
 {
  for (let i = 0; i < this.productList.length; i++) {
   
    if (this.productList[i].pCategory == 'Female')
    {
      this.femaleProductList.push(this.productList[i]);  
    } 
  }
 }


 KidsProducts()
 {
  for (let i = 0; i < this.productList.length; i++) {
   
    if (this.productList[i].pCategory == 'Kids')
    {
      this.kidsProductList.push(this.productList[i]);  
    } 
  }
 }


  constructor() { }
}
