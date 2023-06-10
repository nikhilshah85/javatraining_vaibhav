import { Component } from '@angular/core';

@Component({
  selector: 'app-kids',
  templateUrl: './kids.component.html',
  styleUrls: ['./kids.component.css']
})
export class KidsComponent {
  objectList:any[]=[

    {Pid:501,Pname:'toys',Pprice:777,PavailableQty:10},

    {Pid:502,Pname:'shoes',Pprice:888,PavailableQty:20},

    {Pid:503,Pname:'lunchbox',Pprice:999,PavailableQty:30}

  ]
}
