import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookEventNavBarComponent } from './book-event-nav-bar.component';

describe('BookEventNavBarComponent', () => {
  let component: BookEventNavBarComponent;
  let fixture: ComponentFixture<BookEventNavBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookEventNavBarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookEventNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
