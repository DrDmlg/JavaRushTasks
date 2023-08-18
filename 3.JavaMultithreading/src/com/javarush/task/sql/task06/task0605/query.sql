-- Write your code here:
CREATE TABLE users
(
    user_id    INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    first_name VARCHAR(255)                   NOT NULL,
    last_name  VARCHAR(255)                   NOT NULL,
    date       DATE                           NOT NULL GETDATE(),
    weight     FLOAT(10)
);