import { TestBed } from '@angular/core/testing';

import { GreetuserService } from './greetuser.service';

describe('GreetuserService', () => {
  let service: GreetuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GreetuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
