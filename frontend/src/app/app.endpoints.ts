export const API_ENDPOINTS = {
  BASE_URL: 'http://localhost:8080/',
  PLATOS: {
    LIST: '/recetas',
    DETAIL: (id: number) => `/recetas/${id}`,
    CREATE: '/recetas',
    BY_ALERGENO: (alergeno: string) => `/recetas/${alergeno}`
  }
};
