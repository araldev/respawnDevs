import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TarjetaPlatos } from './tarjeta-platos';

describe('TarjetaPlatos', () => {
  let component: TarjetaPlatos;
  let fixture: ComponentFixture<TarjetaPlatos>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TarjetaPlatos],
    }).compileComponents();

    fixture = TestBed.createComponent(TarjetaPlatos);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
