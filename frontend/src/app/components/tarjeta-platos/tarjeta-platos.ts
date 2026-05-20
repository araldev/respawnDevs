import { Component } from '@angular/core';

@Component({
  selector: 'app-tarjeta-platos',
  standalone: true,
  templateUrl: './tarjeta-platos.html',
  styleUrl: './tarjeta-platos.css'
})
export class TarjetaPlatos {

  platos = [
  {
    nombre: 'Hamburguesa Clásica',
    descripcion: 'Jugosa hamburguesa de carne de ternera a la parrilla, acompañada de queso cheddar fundido, lechuga fresca, tomate natural y nuestra salsa especial de la casa. Servida en pan brioche ligeramente tostado.',
    precio: 8.99,
    imagen: 'https://images.unsplash.com/photo-1550547660-d9450f859349?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🥛', '🌾']
  },
  {
    nombre: 'Pizza Pepperoni',
    descripcion: 'Pizza italiana tradicional con base fina y crujiente, cubierta con salsa de tomate natural, mozzarella derretida y abundantes rodajas de pepperoni ligeramente picante.',
    precio: 10.50,
    imagen: 'https://images.unsplash.com/photo-1601924582970-9238bcb495d9?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🥛', '🌾']
  },
  {
    nombre: 'Ensalada César',
    descripcion: 'Fresca ensalada con lechuga romana crujiente, pechuga de pollo a la plancha, queso parmesano, picatostes dorados y salsa César cremosa.',
    precio: 7.20,
    imagen: 'https://images.unsplash.com/photo-1550304943-4f24f54ddde9?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🥛']
  },
  {
    nombre: 'Tacos Mexicanos',
    descripcion: 'Tres tacos de tortilla de maíz rellenos de carne especiada, acompañados de cebolla fresca, cilantro, pico de gallo y guacamole casero.',
    precio: 9.30,
    imagen: 'https://images.unsplash.com/photo-1613514785940-daed07799d9b?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🌾']
  },
  {
    nombre: 'Sushi Mix',
    descripcion: 'Selección variada de sushi fresco con salmón, atún y aguacate, acompañado de arroz japonés perfectamente sazonado, soja y wasabi.',
    precio: 12.99,
    imagen: 'https://images.unsplash.com/photo-1553621042-f6e147245754?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🐟']
  },
  {
    nombre: 'Pasta Carbonara',
    descripcion: 'Espaguetis al dente mezclados con una cremosa salsa carbonara tradicional elaborada con huevo, queso parmesano y crujiente panceta.',
    precio: 9.80,
    imagen: 'https://images.unsplash.com/photo-1525755662778-989d0524087e?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🥛', '🥚', '🌾']
  },
  {
    nombre: 'Pollo al Curry',
    descripcion: 'Trozos de pollo tiernos cocinados en una suave salsa curry especiada, acompañados de arroz basmati aromático y hierbas frescas.',
    precio: 11.20,
    imagen: 'https://www.orientalmarket.es/recetas/wp-content/uploads/2014/09/FOTO-POLLO-AL-CURRY-ROJO-A2.jpg',
    alergenos: []
  },
  {
    nombre: 'Brownie con Helado',
    descripcion: 'Delicioso brownie de chocolate caliente acompañado de una bola de helado de vainilla, con sirope de chocolate por encima.',
    precio: 5.90,
    imagen: 'https://images.unsplash.com/photo-1606313564200-e75d5e30476c?auto=format&fit=crop&w=800&q=80',
    alergenos: ['🥛', '🥚', '🌾']
  }
];

}
