import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Plato } from '../models/plato.model';
import { PlatoSugerido } from '../models/plato-sugerido.model';
import { Alergeno } from '../models/alergeno.model';
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

  getSugerencias(): Observable<PlatoSugerido[]> {
    return this.http.get<PlatoSugerido[]>(`${this.baseUrl}${API_ENDPOINTS.SUGERENCIAS.LIST}`);
  }

  createSugerencia(plato: PlatoSugerido): Observable<PlatoSugerido> {
    return this.http.post<PlatoSugerido>(`${this.baseUrl}${API_ENDPOINTS.SUGERENCIAS.CREATE}`, plato);
  }

  deleteSugerencia(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}${API_ENDPOINTS.SUGERENCIAS.DELETE(id)}`);
  }

  getAlergenos(): Observable<Alergeno[]> {
    return this.http.get<Alergeno[]>(`${this.baseUrl}${API_ENDPOINTS.ALERGENOS.LIST}`);
  }
}
