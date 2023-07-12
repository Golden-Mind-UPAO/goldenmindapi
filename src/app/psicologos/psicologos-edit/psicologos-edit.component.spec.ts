import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PsicologosEditComponent } from './psicologos-edit.component';

describe('PsicologosEditComponent', () => {
  let component: PsicologosEditComponent;
  let fixture: ComponentFixture<PsicologosEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PsicologosEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PsicologosEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
