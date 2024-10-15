USE charity_donation_platform_db;

-- DELETE ALREADY EXISTING TABLES
DROP TABLE IF EXISTS charities;
DROP TABLE IF EXISTS donations;

 -- CREATE TABLES
CREATE TABLE charities (
    id INT auto_increment PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    donation_total INT
);

CREATE TABLE donations (
    id INT auto_increment PRIMARY KEY,
    email VARCHAR(50) NOT NULL,
    first_name VARCHAR(35) NOT NULL,
    last_name VARCHAR(35) NOT NULL,
    charity_id INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    gift_aid BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (charity_id) REFERENCES charities(id)
);


-- INSERT SAMPLE DATA
INSERT INTO charities VALUES (1, 'British Red Cross', 'The British Red Cross Society is the United Kingdom body of the worldwide neutral and impartial humanitarian network the International Red Cross and Red Crescent Movement. The society was formed in 1870, and is a registered charity with more than 17,200 volunteers and 3,400 staff.', 150);
INSERT INTO charities VALUES (2, 'Cancer Research UK', 'Cancer Research UK is the world''s largest independent cancer research organisation. It is registered as a charity in the United Kingdom and Isle of Man, and was formed on 4 February 2002 by the merger of The Cancer Research Campaign and the Imperial Cancer Research Fund.', 200);
INSERT INTO charities VALUES (3, 'British Heart Foundation', 'The British Heart Foundation is a cardiovascular research charity in the United Kingdom. It funds medical research related to heart and circulatory diseases and their risk factors, and runs influencing work aimed at shaping public policy and raising awareness.', 100);
INSERT INTO charities VALUES (4, 'Save The Children', 'The Save the Children Fund, commonly known as Save the Children, is an international non-governmental organization. It was founded in the UK in 1919, with the goal of helping improve the lives of children worldwide.', 350);

-- TESTING TABLES
SELECT * FROM charities;
SELECT * FROM donations;