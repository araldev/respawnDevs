import { Routes } from '@angular/router';

export const routes: Routes = [
  // { 
  //   path: '', 
  //   loadComponent: () => import('').then(m => m.PlatoListComponent) 
  // },
  // { 
  //   path: 'crear', 
  //   loadComponent: () => import('').then(m => m.PlatoFormComponent) 
  // },
  // { 
  //   path: 'plato/:id', 
  //   loadComponent: () => import('').then(m => m.PlatoDetailComponent) 
  // },
  { path: '**', redirectTo: '' }
];
