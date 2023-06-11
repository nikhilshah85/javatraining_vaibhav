import { Component } from '@angular/core';
import { CheckuserloginService } from './services/checkuserlogin.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bankingAPP';

  _checkLoginSer:CheckuserloginService;

  constructor(_checkLoginSerREF:CheckuserloginService)
  {
    this._checkLoginSer = _checkLoginSerREF;
  }
}
