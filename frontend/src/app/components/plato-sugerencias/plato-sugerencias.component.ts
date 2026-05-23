import { Component, inject, signal } from '@angular/core';
import { PlatoService } from '../../services/plato.service';
import { PlatoSugerido } from '../../models/plato-sugerido.model';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-plato-sugerencias',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './plato-sugerencias.component.html',
  styleUrls: ['./plato-sugerencias.component.css']
})
export class PlatoSugerenciasComponent {
  private platoService = inject(PlatoService);
  sugerencias = signal<PlatoSugerido[]>([]);

  constructor() {
    this.platoService.getSugerencias().subscribe(data => this.sugerencias.set(data));
  }

  delete(id: number) {
    this.platoService.deleteSugerencia(id).subscribe(() => {
      this.sugerencias.update(list => list.filter(s => s.id !== id));
    });
  }
}
