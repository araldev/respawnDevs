import { Alergeno } from './alergeno.model';

export interface Plato {
  id: number;
  nombre: string;
  descripcion: string;
  precio: number;
  instrucciones?: string;
  alergenos?: Alergeno[];
  urlImagen?: string;
  valoracion?: number;
}
