import { TestBed } from '@angular/core/testing';

import { AdminFoodmenuService } from './admin-foodmenu.service';

describe('AdminFoodmenuService', () => {
  let service: AdminFoodmenuService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminFoodmenuService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
