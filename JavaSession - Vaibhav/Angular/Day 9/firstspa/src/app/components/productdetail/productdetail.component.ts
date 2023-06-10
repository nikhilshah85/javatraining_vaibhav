import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-productdetail',
  templateUrl: './productdetail.component.html',
  styleUrls: ['./productdetail.component.css']
})
export class ProductdetailComponent {

  product:number = 0;

  objectList:any[]=[

    {Pid:101,Pname:'iphone',Pprice:1000,PavailableQty:2000,pimg:'../../../assets/images/iphone.jpg',productdescription:'Two great sizes. Now with a splash of yellow. Buy in yellow now. Pro-level camera. Whoa-level pics. Accessibility features. iOS 16. Services: No-contact free delivery, EMI available, Shop with Specialists.'},

    {Pid:102,Pname:'Ipad',Pprice:2000,PavailableQty:3000,pimg:'../../../assets/images/ipad.jpg',productdescription:'Get up to ₹4000 instant savings on selected iPad models. Plus No Cost EMI. Terms apply. Supercharged by M2. Buy direct from Apple. Services: Shop with Specialists, Free delivery, No Cost EMI available, Free engraving, Direct from Apple.'},

    {Pid:103,Pname:'laptop',Pprice:3000,PavailableQty:4000,pimg:'../../../assets/images/macbook.jpg', productdescription:'Get up to ₹8000 instant savings on selected Mac models. Plus No Cost EMI. Terms apply. Customise your Mac. Build it just the way you want. Services: Shop with Specialists, Free delivery, No Cost EMI available, Direct from Apple.'}

  ]

  productDetail:any = "";

  getProduct(id:number)
  {
    this.productDetail = this.objectList.find(o => o.Pid == id);
    console.log('Method Called');
    console.log(this.productDetail);
  }

  constructor(_activatedroute:ActivatedRoute)
  {

    this.product = _activatedroute.snapshot.params["pid"];
    this.getProduct(this.product);


  }
}
