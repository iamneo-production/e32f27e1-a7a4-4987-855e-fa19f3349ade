import { TestBed } from '@angular/core/testing';

import { AdminThemesService } from './admin-themes.service';

describe('AdminThemesService', () => {
  let service: AdminThemesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminThemesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
