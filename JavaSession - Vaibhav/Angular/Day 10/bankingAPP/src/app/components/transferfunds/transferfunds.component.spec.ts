import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransferfundsComponent } from './transferfunds.component';

describe('TransferfundsComponent', () => {
  let component: TransferfundsComponent;
  let fixture: ComponentFixture<TransferfundsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TransferfundsComponent]
    });
    fixture = TestBed.createComponent(TransferfundsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
