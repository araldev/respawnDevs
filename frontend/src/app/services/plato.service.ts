import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Plato } from '../models/plato.model';
import { API_ENDPOINTS } from '../app.endpoints';

@Injectable({
  providedIn: 'root'
})
export class PlatoService {
  private http = inject(HttpClient);
  private baseUrl = API_ENDPOINTS.BASE_URL;

  getPlatos(): Observable<Plato[]> {
    return this.http.get<Plato[]>(`${this.baseUrl}${API_ENDPOINTS.PLATOS.LIST}`);
  }

  getPlatoById(id: number): Observable<Plato> {
    return this.http.get<Plato>(`${this.baseUrl}${API_ENDPOINTS.PLATOS.DETAIL(id)}`);
  }

  createPlato(plato: Partial<Plato>): Observable<Plato> {
    return this.http.post<Plato>(`${this.baseUrl}${API_ENDPOINTS.PLATOS.CREATE}`, plato);
  }

  getPlatosByAlergeno(alergeno: string): Observable<Plato[]> {
    return this.http.get<Plato[]>(`${this.baseUrl}${API_ENDPOINTS.PLATOS.BY_ALERGENO(alergeno)}`);
  }
}
