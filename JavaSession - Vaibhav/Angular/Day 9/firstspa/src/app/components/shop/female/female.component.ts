import { Component } from '@angular/core';

@Component({
  selector: 'app-female',
  templateUrl: './female.component.html',
  styleUrls: ['./female.component.css']
})
export class FemaleComponent {
  objectList:any[]=[

    {Pid:201,Pname:'skirt',Pprice:1234,PavailableQty:999},

    {Pid:202,Pname:'dress',Pprice:2345,PavailableQty:7777},

    {Pid:203,Pname:'headband',Pprice:111,PavailableQty:50000}

  ]
}
