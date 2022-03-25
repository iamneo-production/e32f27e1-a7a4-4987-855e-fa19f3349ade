import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookEventContentComponent } from './book-event-content.component';

describe('BookEventContentComponent', () => {
  let component: BookEventContentComponent;
  let fixture: ComponentFixture<BookEventContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookEventContentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookEventContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
