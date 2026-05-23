import { Component, input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Alergeno } from '../../models/alergeno.model';

@Component({
  selector: 'app-alergenos',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './alergenos.component.html',
  styleUrl: './alergenos.component.css'
})
export class AlergenosComponent {
  alergenos = input<Alergeno[]>([]);

  getIcon(alergeno: Alergeno): string {
    const name = alergeno.nombre
      .toLowerCase()
      .normalize('NFD').replace(/[\u0300-\u036f]/g, '');
    return `icons/${name}.svg`;
  }
}
