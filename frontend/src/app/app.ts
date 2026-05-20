import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TarjetaPlatos } from './components/tarjeta-platos/tarjeta-platos';

@Component({
  selector: 'app-root',
   imports: [RouterOutlet, TarjetaPlatos],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('frontend');
}
