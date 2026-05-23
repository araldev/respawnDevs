import { Routes } from '@angular/router';

export const routes: Routes = [
  { 
    path: '', 
    loadComponent: () => import('./components/plato-list/plato-list.component').then(m => m.PlatoListComponent) 
  },
  { 
    path: 'crear', 
    loadComponent: () => import('./components/plato-form/plato-form.component').then(m => m.PlatoFormComponent) 
  },
  { 
    path: 'sugerencias', 
    loadComponent: () => import('./components/plato-sugerencias/plato-sugerencias.component').then(m => m.PlatoSugerenciasComponent) 
  },
  { path: '**', redirectTo: '' }
];
