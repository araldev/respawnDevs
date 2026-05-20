import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Alergeno } from '../../models/plato.model';

@Component({
  selector: 'app-alergenos',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './alergenos.component.html',
  styleUrl: './alergenos.component.css'
})
export class AlergenosComponent {
  listaAlergenos = Object.values(Alergeno);
}
