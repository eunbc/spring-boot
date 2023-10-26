CREATE TABLE IF NOT EXISTS customer (
      customer_id    CHAR(36) PRIMARY KEY,
      name           VARCHAR(20) NOT NULL,
      email          VARCHAR(50) NOT NULL UNIQUE,
      created_at     DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS voucher (
     voucher_id CHAR(36) PRIMARY KEY,
     voucher_type VARCHAR(30) NOT NULL,
     percent INT,
     amount INT
);