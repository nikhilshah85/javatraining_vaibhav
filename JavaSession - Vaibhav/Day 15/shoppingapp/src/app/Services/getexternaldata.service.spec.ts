import { TestBed } from '@angular/core/testing';

import { GetexternaldataService } from './getexternaldata.service';

describe('GetexternaldataService', () => {
  let service: GetexternaldataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetexternaldataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
