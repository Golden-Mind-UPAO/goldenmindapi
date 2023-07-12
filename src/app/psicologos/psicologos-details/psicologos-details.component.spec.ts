import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PsicologosDetailsComponent } from './psicologos-details.component';

describe('PsicologosDetailsComponent', () => {
  let component: PsicologosDetailsComponent;
  let fixture: ComponentFixture<PsicologosDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PsicologosDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PsicologosDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
