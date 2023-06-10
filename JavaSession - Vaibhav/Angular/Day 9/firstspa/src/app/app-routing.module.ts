import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewsComponent } from './components/news/news.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { ProductdetailComponent } from './components/productdetail/productdetail.component';
import { RegisterComponent } from './components/register/register.component';
import { ElectronicsComponent } from './components/shop/electronics/electronics.component';
import { FemaleComponent } from './components/shop/female/female.component';
import { KidsComponent } from './components/shop/kids/kids.component';
import { MaleComponent } from './components/shop/male/male.component';
import { ShopComponent } from './components/shop/shop.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent},
  {path:'news',component:NewsComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},  
  {path:'shop',component:ShopComponent, children:[
    {path:'',component:FemaleComponent},
    {path:'male',component:MaleComponent},
    {path:'female',component:FemaleComponent},
    {path:'kids',component:KidsComponent},
    {path:'electronics',component:ElectronicsComponent},
  ]},
  {path:'shop/productdetail/:pid',component:ProductdetailComponent},
  {path:'**',component:NotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
