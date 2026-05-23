import { Injectable, signal } from '@angular/core';
import { Plato } from '../models/plato.model';

export interface CartItem {
  plato: Plato;
  quantity: number;
}

@Injectable({
  providedIn: 'root'
})
export class CartService {
  items = signal<CartItem[]>([]);

  add(plato: Plato) {
    this.items.update(list => {
      const existing = list.find(item => item.plato.id === plato.id);
      if (existing) {
        return list.map(item =>
          item.plato.id === plato.id
            ? { ...item, quantity: item.quantity + 1 }
            : item
        );
      }
      return [...list, { plato, quantity: 1 }];
    });
  }

  increment(id: number) {
    this.items.update(list =>
      list.map(item =>
        item.plato.id === id
          ? { ...item, quantity: item.quantity + 1 }
          : item
      )
    );
  }

  decrement(id: number) {
    this.items.update(list => {
      const item = list.find(i => i.plato.id === id);
      if (item && item.quantity <= 1) {
        return list.filter(i => i.plato.id !== id);
      }
      return list.map(i =>
        i.plato.id === id
          ? { ...i, quantity: i.quantity - 1 }
          : i
      );
    });
  }

  remove(id: number) {
    this.items.update(list => list.filter(i => i.plato.id !== id));
  }

  clear() {
    this.items.set([]);
  }

  total(): number {
    return this.items().reduce((sum, item) => sum + item.plato.precio * item.quantity, 0);
  }
}
