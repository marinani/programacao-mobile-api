
CREATE TABLE Produto (
id INT(8) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
descricao VARCHAR(50) NOT NULL,
valor DECIMAL(10,2) NOT NULL,
quantidade INT(6) NOT NULL,
imagem VARCHAR(250) NOT NULL
)