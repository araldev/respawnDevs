export const API_ENDPOINTS = {
  BASE_URL: 'http://localhost:8080/api',
  PLATOS: {
    LIST: '/platos',
    DETAIL: (id: number) => `/plato/${id}`,
    CREATE: '/platos',
    BY_ALERGENO: (alergeno: string) => `/platos/${alergeno}`
  }
};
