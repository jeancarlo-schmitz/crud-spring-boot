CREATE OR REPLACE VIEW car.car_summary
AS SELECT c.id,
	c."name",
	b."name" as brand_name,
	ct."name" as category_type_name,
	c.year_fabrication,
	c.created_at,
	c.updated_at
FROM
	car.car c
JOIN car.brand b ON b.id = c.id_brand AND b.is_active
JOIN car.category_type ct ON ct.id = c.id_category_type
WHERE NOT c.deleted;

CREATE OR REPLACE VIEW car.car_detail
AS SELECT c.id,
	c."name",
	b."name" as brand_name,
	ct."name" as category_type_name,
	c.year_fabrication,
	c.chassi,
	c.created_at,
	c.updated_at
FROM
	car.car c
JOIN car.brand b ON b.id = c.id_brand AND b.is_active
JOIN car.category_type ct ON ct.id = c.id_category_type
WHERE NOT c.deleted;