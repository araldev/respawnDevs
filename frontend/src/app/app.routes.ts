import { Routes } from '@angular/router';

export const routes: Routes = [
  // { 
  //   path: '', 
  //   loadComponent: () => import('./components/plato-list/plato-list.component').then(m => m.PlatoListComponent) 
  // },
  { 
    path: 'crear', 
    loadComponent: () => import('./components/plato-form/plato-form.component').then(m => m.PlatoFormComponent) 
  },
  // { 
  //   path: 'plato/:id', 
  //   loadComponent: () => import('./components/plato-detail/plato-detail.component').then(m => m.PlatoDetailComponent) 
  // },
  { path: '**', redirectTo: '' }
];
