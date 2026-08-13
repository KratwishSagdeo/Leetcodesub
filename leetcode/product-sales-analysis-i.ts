// Problem: Product Sales Analysis I
// Link: https://leetcode.com/problems/product-sales-analysis-i/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select Product.product_name, Sales.year,Sales.price from Sales
left join Product on Sales.Product_id = Product.product_id;