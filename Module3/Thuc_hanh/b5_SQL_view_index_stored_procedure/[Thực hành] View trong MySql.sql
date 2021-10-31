-- Tạo bảng ảo view

CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;

-- Cập nhật bảng view
CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';