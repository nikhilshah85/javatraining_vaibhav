import { Component } from '@angular/core';
import { CheckuserloginService } from 'src/app/services/checkuserlogin.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  _checkLogin:CheckuserloginService;

  constructor(_checkLoginREF:CheckuserloginService)
  {
    this._checkLogin   = _checkLoginREF;
  }

  collectUserInfo(details:any)
  {   
    this._checkLogin.checkUserCredentials(details.userName,details.password);
  }




}
