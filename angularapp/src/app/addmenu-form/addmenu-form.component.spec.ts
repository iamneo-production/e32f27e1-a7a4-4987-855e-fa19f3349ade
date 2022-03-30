import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddmenuFormComponent } from './addmenu-form.component';

describe('AddmenuFormComponent', () => {
  let component: AddmenuFormComponent;
  let fixture: ComponentFixture<AddmenuFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddmenuFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddmenuFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
