CREATE DATABASE BD_T2_BARBA;

USE BD_T2_BARBA;


CREATE TABLE clientes (
    id_cliente BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    direccion VARCHAR(100)
);

CREATE TABLE productos (
    id_prod BIGINT PRIMARY KEY AUTO_INCREMENT,
    nom_prod VARCHAR(100),
    precio DOUBLE,
    stock_actual INT
);

CREATE TABLE factura (
    nro_factura BIGINT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    estado VARCHAR(50),
    d_cliente BIGINT,
    total DOUBLE,
    FOREIGN KEY (d_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE detallefact (
    nro_factura BIGINT,
    id_prod BIGINT,
    cantidad INT,
    PRIMARY KEY(nro_factura, id_prod),
    FOREIGN KEY (nro_factura) REFERENCES factura(nro_factura),
    FOREIGN KEY (id_prod) REFERENCES productos(id_prod)
);

USE BD_T2_BARBA;

-- Clientes
INSERT INTO clientes (nombre, direccion) VALUES 
('Juan Pérez', 'Av. Siempre Viva 123'),
('María López', 'Jr. Los Olivos 456');

-- Productos
INSERT INTO productos (nom_prod, precio, stock_actual) VALUES
('Arroz', 3.50, 50),
('Azúcar', 2.00, 100),
('Aceite', 7.50, 30);

-- Facturas
INSERT INTO factura (fecha, estado, d_cliente, total) VALUES
(CURDATE(), 'Emitida', 1, 10.50),
(CURDATE(), 'Emitida', 2, 21.00);

-- Detalle de facturas (factura 1 con productos 1 y 2, factura 2 con producto 3)
INSERT INTO detallefact (nro_factura, id_prod, cantidad) VALUES
(1, 1, 2),   -- 2 Arroz
(1, 2, 1),   -- 1 Azúcar
(2, 3, 2);   -- 2 Aceite
