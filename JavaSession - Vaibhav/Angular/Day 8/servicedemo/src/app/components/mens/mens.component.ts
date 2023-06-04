import { Component } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-mens',
  templateUrl: './mens.component.html',
  styleUrls: ['./mens.component.css']
})
export class MensComponent {

  _productsSerObj:ProductsService;

  constructor(_productSerOBJREF:ProductsService)
  {
    this._productsSerObj = _productSerOBJREF;
    this._productsSerObj.maleProducts();
  }

}
