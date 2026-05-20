
import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { PlatoService } from '../../services/plato.service';
import { Alergeno, Plato } from '../../models/plato.model';

@Component({
  selector: 'app-plato-form',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './plato-form.component.html',
  styleUrls: ['./plato-form.component.css']
})
export class PlatoFormComponent {
  private fb = inject(FormBuilder);
  private platoService = inject(PlatoService);

  form = this.fb.group({
    nombre: ['', Validators.required],
    descripcion: ['', Validators.required],
    precio: [0, [Validators.required, Validators.min(0)]]
  });

  submit() {
    if (this.form.valid) {
      const newPlato: Plato = {
        id: 0, // El backend se encargará de asignar el id
        nombre: this.form.value.nombre!,
        descripcion: this.form.value.descripcion!,
        precio: this.form.value.precio!
      };
      this.platoService.createPlato(newPlato).subscribe(plato => {
        console.log('Plato creado:', plato);
        this.form.reset();
      });
    }
  }
}
