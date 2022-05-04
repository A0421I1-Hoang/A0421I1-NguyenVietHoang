import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HackernewComponent } from './hackernew.component';

describe('HackernewComponent', () => {
  let component: HackernewComponent;
  let fixture: ComponentFixture<HackernewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HackernewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HackernewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
