import { Component } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-kids',
  templateUrl: './kids.component.html',
  styleUrls: ['./kids.component.css']
})
export class KidsComponent {

  _productsSerObj:ProductsService;

  constructor(_productSerOBJREF:ProductsService)
  {
    this._productsSerObj = _productSerOBJREF;
    this._productsSerObj.KidsProducts();
  }
}
