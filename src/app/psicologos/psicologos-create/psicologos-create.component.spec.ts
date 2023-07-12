import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PsicologosCreateComponent } from './psicologos-create.component';

describe('PsicologosCreateComponent', () => {
  let component: PsicologosCreateComponent;
  let fixture: ComponentFixture<PsicologosCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PsicologosCreateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PsicologosCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
