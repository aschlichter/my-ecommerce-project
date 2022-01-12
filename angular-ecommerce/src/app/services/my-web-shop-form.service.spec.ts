import { TestBed } from '@angular/core/testing';

import { MyWebShopFormService } from './my-web-shop-form.service';

describe('MyWebShopFormService', () => {
  let service: MyWebShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MyWebShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
