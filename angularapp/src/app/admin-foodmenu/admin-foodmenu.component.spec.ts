import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminFoodmenuComponent } from './admin-foodmenu.component';

describe('AdminFoodmenuComponent', () => {
  let component: AdminFoodmenuComponent;
  let fixture: ComponentFixture<AdminFoodmenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminFoodmenuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminFoodmenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
