DROP TABLE IF EXISTS tb_students;

CREATE TABLE tb_students (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);

INSERT INTO tb_students (first_name, last_name) VALUES
  ('Mostafa', 'Rastegar'),
  ('Hannah', 'Rastegar'),
  ('Narges', 'Maleki');