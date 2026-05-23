import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators, FormArray, FormControl, FormGroup } from '@angular/forms';
import { PlatoService } from '../../services/plato.service';
import { Alergeno } from '../../models/alergeno.model';
import { PlatoSugerido } from '../../models/plato-sugerido.model';
import { CommonModule } from '@angular/common';

interface PlatoForm {
  nombre: FormControl<string>;
  descripcion: FormControl<string>;
  instrucciones: FormControl<string>;
  precio: FormControl<number>;
  urlImagen: FormControl<string>;
  ingredientes: FormControl<string>;
  alergenos: FormArray<FormControl<boolean>>;
}

@Component({
  selector: 'app-plato-form',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './plato-form.component.html',
  styleUrls: ['./plato-form.component.css']
})
export class PlatoFormComponent {
  private fb = inject(FormBuilder);
  private platoService = inject(PlatoService);
  alergenosDisponibles: Alergeno[] = [];
  successMessage = '';
  form!: FormGroup<PlatoForm>;

  constructor() {
    this.platoService.getAlergenos().subscribe(alergenos => {
      this.alergenosDisponibles = alergenos;
      this.form = this.fb.group<PlatoForm>({
        nombre: this.fb.control('', { nonNullable: true, validators: Validators.required }),
        descripcion: this.fb.control('', { nonNullable: true, validators: Validators.required }),
        instrucciones: this.fb.control('', { nonNullable: true }),
        precio: this.fb.control(0, { nonNullable: true, validators: [Validators.required, Validators.min(0)] }),
        urlImagen: this.fb.control('', { nonNullable: true }),
        ingredientes: this.fb.control('', { nonNullable: true }),
        alergenos: this.fb.array(alergenos.map(() => this.fb.control(false, { nonNullable: true })))
      });
    });
  }

  get alergenosArray(): FormArray<FormControl<boolean>> {
    return this.form.controls.alergenos;
  }

  submit() {
    if (!this.form.valid) return;

    const selectedAlergenos = this.alergenosDisponibles
      .filter((_, i) => this.alergenosArray.at(i).value)
      .map(a => a.nombre);

    const raw = this.form.getRawValue();
    const sugerencia: PlatoSugerido = {
      id: 0,
      nombre: raw.nombre,
      descripcion: raw.descripcion,
      instrucciones: raw.instrucciones,
      precio: raw.precio,
      urlImagen: raw.urlImagen,
      ingredientes: raw.ingredientes
        .split(',')
        .map(i => i.trim())
        .filter(i => i.length > 0),
      alergenos: selectedAlergenos
    };

    this.platoService.createSugerencia(sugerencia).subscribe(() => {
      this.successMessage = '¡Plato sugerido con éxito!';
      this.form.reset();
      this.alergenosArray.controls.forEach(c => c.setValue(false));
      setTimeout(() => this.successMessage = '', 4000);
    });
  }
}
