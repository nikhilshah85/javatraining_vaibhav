import { Component } from '@angular/core';
import { GreetuserService } from 'src/app/services/greetuser.service';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  styleUrls: ['./comp1.component.css']
})
export class Comp1Component {

    _greetSerObj:GreetuserService;
   
    //object of GreetUserService will be created by Angular runtime and injected inside this component
    constructor(_greetSerOBJREF:GreetuserService) {      
      this._greetSerObj = _greetSerOBJREF;
    }



}
