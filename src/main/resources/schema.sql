--booktableがあれば削除
DROP TABLE IF EXISTS englishwords;

--booktableがなければ新しく作成
CREATE TABLE IF NOT EXISTS englishwords(
id INT AUTO_INCREMENT,
word VARCHAR(50) NOT NULL,
mean VARCHAR(50) NOT NULL,
PRIMARY KEY(id)
);