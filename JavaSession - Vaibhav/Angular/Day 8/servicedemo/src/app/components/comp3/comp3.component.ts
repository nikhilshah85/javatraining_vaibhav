import { Component } from '@angular/core';
import { GreetuserService } from 'src/app/services/greetuser.service';

@Component({
  selector: 'app-comp3',
  templateUrl: './comp3.component.html',
  styleUrls: ['./comp3.component.css']
})
export class Comp3Component {


  _greetSerObj:GreetuserService;

  constructor(_greetSerObjREF:GreetuserService)
  {
    this._greetSerObj = _greetSerObjREF;
  }
}
