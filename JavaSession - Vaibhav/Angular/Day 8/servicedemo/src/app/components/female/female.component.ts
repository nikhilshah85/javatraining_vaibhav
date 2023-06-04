import { Component } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-female',
  templateUrl: './female.component.html',
  styleUrls: ['./female.component.css']
})
export class FemaleComponent {
  _productsSerObj:ProductsService;

  constructor(_productSerOBJREF:ProductsService)
  {
    this._productsSerObj = _productSerOBJREF;
    this._productsSerObj.femaleProducts();
  }
}
