INSERT INTO ingredientes (id, nombre) VALUES (1, 'Tallarines de arroz'), (2, 'Pechuga de pollo'), (3, 'Salsa de soja'), (4, 'Cacahuetes'), (5, 'Huevo'), (6, 'Langostinos'), (7, 'Harina de trigo'), (8, 'Leche de vaca'), (9, 'Queso parmesano'), (10, 'Carne picada de ternera'), (11, 'Tomate triturado'), (12, 'Lechuga'), (13, 'Pan de hamburguesa'), (14, 'Arroz arborio'), (15, 'Setas variadas'), (16, 'Garbanzos'), (17, 'Tahini'), (18, 'Salmón fresco'), (19, 'Aguacate'), (20, 'Tortillas de maíz');

INSERT INTO alergenos (id, nombre, descripcion) VALUES
(1, 'Gluten', 'Proteína presente en cereales como trigo, cebada y centeno.'),
(2, 'Crustáceos', 'Incluye gambas, langostinos y otros crustáceos.'),
(3, 'Huevos', 'Presencia de huevo o derivados.'),
(4, 'Pescado', 'Presencia de pescado o derivados.'),
(5, 'Cacahuetes', 'Presencia de cacahuetes o derivados.'),
(6, 'Soja', 'Presencia de soja o derivados.'),
(7, 'Lácteos', 'Presencia de leche o derivados.'),
(8, 'Sésamo', 'Presencia de granos de sésamo.');

INSERT INTO recetas (id, nombre, descripcion, precio, url_imagen, valoracion) VALUES
(1, 'Pad Thai de Pollo', 'Fideos de arroz salteados con pollo, huevo, brotes y cacahuetes.', 12.50, 'https://images.unsplash.com/photo-1559314809-0d155014e29e?auto=format&fit=crop&q=80&w=800', 4.7),
(2, 'Lasaña Boloñesa Clásica', 'Capas de pasta con salsa de carne, bechamel casera y queso derretido.', 14.00, 'https://images.unsplash.com/photo-1619895092538-128341789043?auto=format&fit=crop&q=80&w=800', 4.5),
(3, 'Risotto de Setas salvajes', 'Arroz cremoso italiano cocinado a fuego lento con variedad de setas.', 15.50, 'https://images.unsplash.com/photo-1476124369491-e7addf5db371?auto=format&fit=crop&q=80&w=800', 4.8),
(4, 'Hamburguesa Gourmet', 'Medallón de ternera con queso, lechuga y salsa especial en pan tierno.', 11.90, 'https://images.unsplash.com/photo-1568901346375-23c9450c58cd?auto=format&fit=crop&q=80&w=800', 4.2),
(5, 'Hummus de Garbanzo Casero', 'Crema suave de garbanzos, tahini, limón, aceite de oliva y un toque de comino.', 7.50, 'https://images.unsplash.com/photo-1577805947697-89e18249d767?auto=format&fit=crop&q=80&w=800', 4.0),
(6, 'Tacos de Salmón y Aguacate', 'Tortillas de maíz rellenas de salmón a la plancha, aguacate y cilantro.', 13.20, 'https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?auto=format&fit=crop&q=80&w=800', 4.3),
(7, 'Wok de Langostinos', 'Salteado rápido de langostinos con verduras frescas y salsa de soja.', 16.00, 'https://images.unsplash.com/photo-1603133872878-684f208fb84b?auto=format&fit=crop&q=80&w=800', 4.1),
(8, 'Tortilla de Patatas Tradicional', 'La receta clásica española con huevos camperos, patatas y cebolla.', 9.50, 'https://images.unsplash.com/photo-1536521642388-441263f88a61?auto=format&fit=crop&q=80&w=800', 4.6),
(9, 'Crema de Calabaza y Queso', 'Puré fino de calabaza asada con un toque de queso crema suave.', 8.00, 'https://images.unsplash.com/photo-1476718406336-bb5a9690ee2a?auto=format&fit=crop&q=80&w=800', 3.9),
(10, 'Bowl de Arroz y Pollo Teriyaki', 'Base de arroz con pollo caramelizado en salsa teriyaki casera.', 12.00, 'https://images.unsplash.com/photo-1543339308-43e59d6b73a6?auto=format&fit=crop&q=80&w=800', 4.4);

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

INSERT INTO ingrediente_alergenos (ingrediente_id, alergeno_id, es_traza) VALUES
(1, 6, false),  -- Tallarines de arroz -> Soja (por salsa habitual)
(2, 3, false),  -- Pechuga de pollo -> Huevos (marinado)
(3, 6, false),  -- Salsa de soja -> Soja
(4, 5, false),  -- Cacahuetes -> Cacahuetes
(5, 3, false),  -- Huevo -> Huevos
(6, 2, false),  -- Langostinos -> Crustaceos
(7, 1, false),  -- Harina de trigo -> Gluten
(8, 7, false),  -- Leche de vaca -> Lacteos
(9, 7, false),  -- Queso parmesano -> Lacteos
(10, 1, false), -- Carne picada de ternera -> Gluten (trazas)
(11, 1, false), -- Tomate triturado -> Gluten (trazas)
(12, 1, false), -- Lechuga -> Gluten (trazas)
(13, 1, false), -- Pan de hamburguesa -> Gluten
(14, 1, false), -- Arroz arborio -> Gluten (trazas)
(15, 1, false), -- Setas variadas -> Gluten (trazas)
(16, 1, false), -- Garbanzos -> Gluten (trazas)
(17, 8, false), -- Tahini -> Sesamo
(18, 4, false), -- Salmon fresco -> Pescado
(19, 1, false), -- Aguacate -> Gluten (trazas)
(20, 1, false); -- Tortillas de maiz -> Gluten (trazas)
