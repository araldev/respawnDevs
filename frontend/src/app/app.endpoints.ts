export const API_ENDPOINTS = {
  BASE_URL: 'http://localhost:9090',
  PLATOS: {
    LIST: '/recetas',
    DETAIL: (id: number) => `/recetas/${id}`,
    CREATE: '/recetas',
    BY_ALERGENO: (alergeno: string) => `/recetas/${alergeno}`
  },
  SUGERENCIAS: {
    LIST: '/sugerencias',
    CREATE: '/sugerencias',
    DETAIL: (id: number) => `/sugerencias/${id}`,
    DELETE: (id: number) => `/sugerencias/${id}`
  },
  ALERGENOS: {
    LIST: '/alergenos'
  }
};
