import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Comp1Component } from './components/comp1/comp1.component';
import { Comp2Component } from './components/comp2/comp2.component';
import { Comp3Component } from './components/comp3/comp3.component';
import { MensComponent } from './components/mens/mens.component';
import { FemaleComponent } from './components/female/female.component';
import { KidsComponent } from './components/kids/kids.component';

@NgModule({
  declarations: [
    AppComponent,   
    Comp1Component, Comp2Component, Comp3Component, MensComponent, FemaleComponent, KidsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
