import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAddAddonsComponent } from './admin-add-addons.component';

describe('AdminAddAddonsComponent', () => {
  let component: AdminAddAddonsComponent;
  let fixture: ComponentFixture<AdminAddAddonsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminAddAddonsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminAddAddonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
