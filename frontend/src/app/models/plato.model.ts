export enum Alergeno {
  GLUTEN = 'Gluten',
  CRUSTACEOS = 'Crustáceos',
  HUEVOS = 'Huevos',
  PESCADO = 'Pescado',
  CACAHUETES = 'Cacahuetes',
  SOJA = 'Soja',
  LACTEOS = 'Lácteos',
  FRUTOS_CASCARA = 'Frutos de cáscara',
  APIO = 'Apio',
  MOSTAZA = 'Mostaza',
  SESAMO = 'Sésamo',
  SULFITOS = 'Sulfitos',
  ALTRAMUCES = 'Altramuces',
  MOLUSCOS = 'Moluscos'
}

export interface Plato {
  id: number;
  nombre: string;
  descripcion: string;
  precio: number;
  alergenos: Alergeno[];
}

