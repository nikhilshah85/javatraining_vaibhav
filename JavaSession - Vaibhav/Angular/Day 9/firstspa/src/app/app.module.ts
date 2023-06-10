import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { NewsComponent } from './components/news/news.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { ShopComponent } from './components/shop/shop.component';
import { MaleComponent } from './components/shop/male/male.component';
import { FemaleComponent } from './components/shop/female/female.component';
import { KidsComponent } from './components/shop/kids/kids.component';
import { ElectronicsComponent } from './components/shop/electronics/electronics.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { ProductdetailComponent } from './components/productdetail/productdetail.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    NewsComponent,
    RegisterComponent,
    LoginComponent,
    ShopComponent,
    MaleComponent,
    FemaleComponent,
    KidsComponent,
    ElectronicsComponent,
    NotfoundComponent,
    ProductdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
