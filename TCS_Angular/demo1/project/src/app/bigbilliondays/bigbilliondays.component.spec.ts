import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BigbilliondaysComponent } from './bigbilliondays.component';

describe('BigbilliondaysComponent', () => {
  let component: BigbilliondaysComponent;
  let fixture: ComponentFixture<BigbilliondaysComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BigbilliondaysComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BigbilliondaysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
