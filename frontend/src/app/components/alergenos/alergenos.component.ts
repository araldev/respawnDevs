import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-alergenos',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './alergenos.component.html',
  styleUrl: './alergenos.component.css'
})
export class AlergenosComponent {
  @Input() alergenos: string[] = [];

  getIcon(alergeno: string): string {
    switch (alergeno.toLowerCase()) {
      case 'gluten':
        return 'assets/icons/gluten.svg';
      case 'crustaceos':
        return 'assets/icons/crustaceos.svg';
      case 'huevos':
        return 'assets/icons/huevos.svg';
      case 'pescado':
        return 'assets/icons/pescado.svg';
      case 'cacahuetes':
        return 'assets/icons/cacahuetes.svg';
      case 'soja':
        return 'assets/icons/soja.svg';
      case 'lacteos':
        return 'assets/icons/lacteos.svg';
      case 'frutos de cascara':
        return 'assets/icons/frutos-de-cascara.svg';
      case 'apio':
        return 'assets/icons/apio.svg';
      case 'mostaza':
        return 'assets/icons/mostaza.svg';
      case 'sesamo':
        return 'assets/icons/sesamo.svg';
      case 'sulfitos':
        return 'assets/icons/sulfitos.svg';
      case 'altramuces':
        return 'assets/icons/altramuces.svg';
      case 'moluscos':
        return 'assets/icons/moluscos.svg';
      default:
        return '';
    }
  }
}
