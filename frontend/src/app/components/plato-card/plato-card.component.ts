import { Component, Input, signal } from '@angular/core';
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
  plato = signal<Plato | undefined>(undefined);

  @Input() set platoInput(plato: Plato) {
    this.plato.set(plato);
  }
}
