import { Component } from '@angular/core';
import { GreetuserService } from 'src/app/services/greetuser.service';

@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.css']
})
export class Comp2Component {


  _greetSerObj:GreetuserService;

  constructor(_greetSerObjREF:GreetuserService)
  {
    this._greetSerObj = _greetSerObjREF;
  }
}
