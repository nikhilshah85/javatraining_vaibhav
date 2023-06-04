import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GreetuserService {

  developerName = 'Kriti Arora';
  teamStrength = 15;

  counter = 0;

  increaseCounter()
  {
    this.counter = this.counter + 1;

    return this.counter;
  }

  decreaseCounter()
  {
    this.counter = this.counter - 1;
    return this.counter;
  }

  greetUserMessage()
  {
    return 'Hello and Welcome to the world of Angular Services';
  }

  constructor() { }
}
