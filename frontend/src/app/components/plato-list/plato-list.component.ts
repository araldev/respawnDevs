import { Component, computed, inject, signal } from '@angular/core';
import { toSignal } from '@angular/core/rxjs-interop';
import { PlatoService } from '../../services/plato.service';
import { CartService } from '../../services/cart.service';
import { PlatoCardComponent } from '../plato-card/plato-card.component';
import { Plato } from '../../models/plato.model';
import { Alergeno } from '../../models/alergeno.model';
import { PlatoSearchComponent } from '../plato-search/plato-search.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-plato-list',
  standalone: true,
  imports: [PlatoCardComponent, PlatoSearchComponent, CommonModule],
  templateUrl: './plato-list.component.html',
  styleUrls: ['./plato-list.component.css']
})
export class PlatoListComponent {
  private platoService = inject(PlatoService);
  cartService = inject(CartService);
  private allPlatos = toSignal(this.platoService.getPlatos(), { initialValue: [] as Plato[] });

  alergenosDisponibles = toSignal(this.platoService.getAlergenos(), { initialValue: [] as Alergeno[] });

  searchTerm = signal('');
  excludedAlergenoIds = signal<Set<number>>(new Set());

  filteredPlatos = computed(() => {
    const excluded = this.excludedAlergenoIds();
    return this.allPlatos().filter(plato => {
      if (!plato.nombre.toLowerCase().includes(this.searchTerm().toLowerCase())) {
        return false;
      }
      if (excluded.size > 0 && plato.alergenos?.some(a => excluded.has(a.id))) {
        return false;
      }
      return true;
    });
  });

  onSearch(term: string) {
    this.searchTerm.set(term);
  }

  toggleAlergeno(id: number) {
    this.excludedAlergenoIds.update(set => {
      const next = new Set(set);
      if (next.has(id)) { next.delete(id); } else { next.add(id); }
      return next;
    });
  }

  addToCart(plato: Plato) {
    this.cartService.add(plato);
  }
}