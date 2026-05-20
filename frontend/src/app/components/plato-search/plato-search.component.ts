import { Component, output } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';
import { debounceTime, distinctUntilChanged } from 'rxjs';

@Component({
  selector: 'app-plato-search',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './plato-search.component.html',
  styleUrls: ['./plato-search.component.css']
})
export class PlatoSearchComponent {
  searchControl = new FormControl('');
  search = output<string>();

  constructor() {
    this.searchControl.valueChanges.pipe(
      debounceTime(300),
      distinctUntilChanged()
    ).subscribe(value => {
      this.search.emit(value || '');
    });
  }
}
