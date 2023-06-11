import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CheckuserloginService implements CanActivate {

  constructor() { }

  canActivate():boolean
  {
    return this.isValidUser;
  }
  isValidUser = false;

  checkUserCredentials(userName:string, password:string):boolean
  {
    console.log(userName);
    console.log(password);

      if(userName == 'Nikhil' && password=='Nikhil@1234')
      {
        this.isValidUser = true;
        return this.isValidUser;
      }
      else
      {        
        return this.isValidUser;
      }
  }

  logoutUser()
  {
    this.isValidUser = false;
  }

}
