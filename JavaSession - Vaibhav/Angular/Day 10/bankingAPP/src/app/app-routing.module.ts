import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { AccountdetailsComponent } from './components/accountdetails/accountdetails.component';
import { ContactComponent } from './components/contact/contact.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { TransferfundsComponent } from './components/transferfunds/transferfunds.component';
import { CheckuserloginService } from './services/checkuserlogin.service';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home', component:HomeComponent},
  {path:'about', component:AboutComponent},
  {path:'contact', component:ContactComponent},
  {path:'accdetails', component:AccountdetailsComponent, canActivate:[CheckuserloginService]},
  {path:'transferfunds', component:TransferfundsComponent, canActivate:[CheckuserloginService]},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
