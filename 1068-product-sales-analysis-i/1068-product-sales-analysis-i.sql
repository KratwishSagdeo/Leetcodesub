# Write your MySQL query statement below
Select Product.product_name, Sales.year,Sales.price from Sales
left join Product on Sales.Product_id = Product.product_id;