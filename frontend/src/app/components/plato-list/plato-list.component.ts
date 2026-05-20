import { Component, computed, inject, signal } from '@angular/core';
import { toSignal } from '@angular/core/rxjs-interop';
import { PlatoService } from '../../services/plato.service';
import { PlatoCardComponent } from '../plato-card/plato-card.component';
import { Plato } from '../../models/plato.model';
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
  private allPlatos = toSignal(this.platoService.getPlatos(), { initialValue: [] as Plato[] });
  
  searchTerm = signal('');
  
  filteredPlatos = computed(() => 
    this.allPlatos().filter(plato => 
      plato.nombre.toLowerCase().includes(this.searchTerm().toLowerCase())
    )
  );

  onSearch(term: string) {
    this.searchTerm.set(term);
  }
}