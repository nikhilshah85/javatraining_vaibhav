import { TestBed } from '@angular/core/testing';

import { CheckuserloginService } from './checkuserlogin.service';

describe('CheckuserloginService', () => {
  let service: CheckuserloginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CheckuserloginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
