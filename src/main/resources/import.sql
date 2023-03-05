INSERT INTO `productos` (`nombre`, `talla`, `color`, `descripcion`, `precio`,`foto`) VALUES ('LOVE 4 GALLI', 'chica', 'blanco', 'Esta es perfecta para rockearla en tal fecha, un uniforme para todo cuaadeño o artista de closet', 270,'https://res.cloudinary.com/dgp2sgznp/image/upload/v1677443976/productos_LucaSantorini/playera_luca_love_for_galli.jpg');
INSERT INTO `productos` (`nombre`, `talla`, `color`, `descripcion`, `precio`,`foto`) VALUES ('LSSW x DANNY OCÉANO Babylon G', 'chica', 'rojo', 'En más de 5 colorways', 300,'https://res.cloudinary.com/dgp2sgznp/image/upload/v1677443974/productos_LucaSantorini/playera_dannyocean_babylon_roja.jpg');
INSERT INTO `productos` (`nombre`, `talla`, `color`, `descripcion`, `precio`,`foto`) VALUES ('HARRY EN GUANATOS', 'chica', 'blanco', 'It was given to me on my last visit to the VFG arena, now I dont take it off. I love you my watermelonas Styles, Harry (2022)', 300,'https://res.cloudinary.com/dgp2sgznp/image/upload/v1677443976/productos_LucaSantorini/playera_harry_en_guanatos02_blanca.jpg');


INSERT INTO `pedidos` (`monto_total`, `metodo_pago`, `fecha_solicitud`, `fk_id_usuario`) VALUES (270, 'tarjeta', '2022-12-23','1');
INSERT INTO `pedidos` (`monto_total`, `metodo_pago`, `fecha_solicitud`, `fk_id_usuario`) VALUES (600, 'tarjeta', '2022-12-28','1');
INSERT INTO `pedidos` (`monto_total`, `metodo_pago`, `fecha_solicitud`, `fk_id_usuario`) VALUES (570, 'tarjeta', '2022-12-30','1');

INSERT INTO `pedidos_has_productos` (`cantidad`,`subtotal`, `detalles`, `fk_id_pedido`, `fk_id_producto`) VALUES (1, 270, 'Pedido exitoso', '1', '1');
INSERT INTO `pedidos_has_productos` (`cantidad`,`subtotal`, `detalles`, `fk_id_pedido`, `fk_id_producto`) VALUES (1, 300,'Pedido exitoso 1/2', '2', '2');
INSERT INTO `pedidos_has_productos` (`cantidad`,`subtotal`, `detalles`, `fk_id_pedido`, `fk_id_producto`) VALUES (1, 300,'Pedido exitoso 2/2', '2', '3');
INSERT INTO `pedidos_has_productos` (`cantidad`,`subtotal`, `detalles`, `fk_id_pedido`, `fk_id_producto`) VALUES (1, 270,'Pedido exitoso 1/2', '3', '1');
INSERT INTO `pedidos_has_productos` (`cantidad`,`subtotal`, `detalles`, `fk_id_pedido`, `fk_id_producto`) VALUES (1, 300,'Pedido exitoso 1/2', '3', '3');