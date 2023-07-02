import { Component } from '@angular/core';
import { GetexternaldataService } from 'src/app/Services/getexternaldata.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

  _externalData:GetexternaldataService;

  constructor(_extData:GetexternaldataService)
  {
    this._externalData = _extData;
  }

}
