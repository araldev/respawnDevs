import { Component, input, output } from '@angular/core';
import { Plato } from '../../models/plato.model';
import { AlergenosComponent } from '../alergenos/alergenos.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-plato-card',
  standalone: true,
  imports: [AlergenosComponent, CommonModule],
  templateUrl: './plato-card.component.html',
  styleUrls: ['./plato-card.component.css']
})
export class PlatoCardComponent {
  plato = input.required<Plato>();
  addToCart = output<Plato>();

  stars(valoracion: number): string[] {
    const full = Math.round(valoracion);
    return Array.from({ length: 5 }, (_, i) => i < full ? '★' : '☆');
  }
}
