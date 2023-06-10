import { Component } from '@angular/core';

@Component({
  selector: 'app-male',
  templateUrl: './male.component.html',
  styleUrls: ['./male.component.css']
})
export class MaleComponent {
  objectList:any[]=[

    {Pid:701,Pname:'suit',Pprice:99999,PavailableQty:5},

    {Pid:702,Pname:'belt',Pprice:358,PavailableQty:249},

    {Pid:703,Pname:'perfume',Pprice:77,PavailableQty:100}

  ]
}
