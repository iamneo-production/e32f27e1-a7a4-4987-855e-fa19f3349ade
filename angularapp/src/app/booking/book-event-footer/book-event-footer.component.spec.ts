import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookEventFooterComponent } from './book-event-footer.component';

describe('BookEventFooterComponent', () => {
  let component: BookEventFooterComponent;
  let fixture: ComponentFixture<BookEventFooterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookEventFooterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookEventFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
