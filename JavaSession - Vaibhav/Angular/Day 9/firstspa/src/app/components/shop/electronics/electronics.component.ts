import { Component } from '@angular/core';

@Component({
  selector: 'app-electronics',
  templateUrl: './electronics.component.html',
  styleUrls: ['./electronics.component.css']
})
export class ElectronicsComponent {

  objectList:any[]=[

    {Pid:101,Pname:'iphone',Pprice:1000,PavailableQty:2000},

    {Pid:102,Pname:'tablet',Pprice:2000,PavailableQty:3000},

    {Pid:103,Pname:'laptop',Pprice:3000,PavailableQty:4000}

  ]
}
