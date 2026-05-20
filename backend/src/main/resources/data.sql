INSERT INTO ingredientes (id, nombre) VALUES (1, 'Tallarines de arroz'), (2, 'Pechuga de pollo'), (3, 'Salsa de soja'), (4, 'Cacahuetes'), (5, 'Huevo'), (6, 'Langostinos'), (7, 'Harina de trigo'), (8, 'Leche de vaca'), (9, 'Queso parmesano'), (10, 'Carne picada de ternera'), (11, 'Tomate triturado'), (12, 'Lechuga'), (13, 'Pan de hamburguesa'), (14, 'Arroz arborio'), (15, 'Setas variadas'), (16, 'Garbanzos'), (17, 'Tahini'), (18, 'Salmón fresco'), (19, 'Aguacate'), (20, 'Tortillas de maíz');

INSERT INTO alergenos (id, nombre) VALUES (1, 'Gluten'), (2, 'Crustáceos'), (3, 'Huevos'), (4, 'Pescado'), (5, 'Cacahuetes'), (6, 'Soja'), (7, 'Lácteos'), (8, 'Granos de sésamo');

INSERT INTO recetas (id, nombre, descripcion, precio, url_imagen) VALUES
(1, 'Pad Thai de Pollo', 'Fideos de arroz salteados con pollo, huevo, brotes y cacahuetes.', 12.50, 'https://images.unsplash.com/photo-1559314809-0d155014e29e?auto=format&fit=crop&q=80&w=800'),
(2, 'Lasaña Boloñesa Clásica', 'Capas de pasta con salsa de carne, bechamel casera y queso derretido.', 14.00, 'https://images.unsplash.com/photo-1619895092538-128341789043?auto=format&fit=crop&q=80&w=800'),
(3, 'Risotto de Setas salvajes', 'Arroz cremoso italiano cocinado a fuego lento con variedad de setas.', 15.50, 'https://images.unsplash.com/photo-1633964913295-ceb43826e7cf?auto=format&fit=crop&q=80&w=800'),
(4, 'Hamburguesa Gourmet', 'Medallón de ternera con queso, lechuga y salsa especial en pan tierno.', 11.90, 'https://images.unsplash.com/photo-1568901346375-23c9450c58cd?auto=format&fit=crop&q=80&w=800'),
(5, 'Hummus de Garbanzo Casero', 'Crema suave de garbanzos, tahini, limón, aceite de oliva y un toque de comino.', 7.50, 'https://images.unsplash.com/photo-1637542901323-9c88eeeca873?auto=format&fit=crop&q=80&w=800'),
(6, 'Tacos de Salmón y Aguacate', 'Tortillas de maíz rellenas de salmón a la plancha, aguacate y cilantro.', 13.20, 'https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?auto=format&fit=crop&q=80&w=800'),
(7, 'Wok de Langostinos', 'Salteado rápido de langostinos con verduras frescas y salsa de soja.', 16.00, 'https://images.unsplash.com/photo-1603133872878-684f208fb84b?auto=format&fit=crop&q=80&w=800'),
(8, 'Tortilla de Patatas Tradicional', 'La receta clásica española con huevos camperos, patatas y cebolla.', 9.50, 'https://images.unsplash.com/photo-1536521642388-441263f88a61?auto=format&fit=crop&q=80&w=800'),
(9, 'Crema de Calabaza y Queso', 'Puré fino de calabaza asada con un toque de queso crema suave.', 8.00, 'https://images.unsplash.com/photo-1476718406336-bb5a9690ee2a?auto=format&fit=crop&q=80&w=800'),
(10, 'Bowl de Arroz y Pollo Teriyaki', 'Base de arroz con pollo caramelizado en salsa teriyaki casera.', 12.00, 'https://images.unsplash.com/photo-1543339308-43e59d6b73a6?auto=format&fit=crop&q=80&w=800');

INSERT INTO receta_ingredientes (receta_id, ingrediente_id) VALUES
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5), -- Pad Thai
(2, 7), (2, 8), (2, 9), (2, 10), (2, 11), -- Lasaña
(3, 9), (3, 14), (3, 15),                 -- Risotto
(4, 9), (4, 10), (4, 12), (4, 13),        -- Hamburguesa
(5, 16), (5, 17),                         -- Hummus
(6, 18), (6, 19), (6, 20),                -- Tacos
(7, 3), (7, 6),                           -- Wok
(8, 5),                                   -- Tortilla
(9, 8), (9, 9),                           -- Crema Calabaza
(10, 2), (10, 3), (10, 14);               -- Bowl Teriyaki
